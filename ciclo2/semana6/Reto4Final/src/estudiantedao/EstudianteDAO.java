/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estudiantedao;

import conector.BaseConexion;
import java.util.List;
import modelovo.EstudianteVo;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class EstudianteDAO extends BaseConexion implements IEstudianteDAO {

    @Override
    public boolean insertarEstudiante(EstudianteVo Estudiante) {
        try {
            Conectar();
            PreparedStatement sentencia = Conexion.prepareStatement("insert into estudiantes(nombre, apellido, nacimiento, CorreoInst, correopersonal, celular, fijo, programa) values (?, ?, ?, ?, ?, ?, ?, ?);");
            sentencia.setString(1, Estudiante.getNombres());
            sentencia.setString(2, Estudiante.getApellidos());
            sentencia.setString(3, Estudiante.getNacimiento());
            sentencia.setString(4, Estudiante.getCorreoInst());
            sentencia.setString(5, Estudiante.getCorreoPersonal());
            sentencia.setLong(6, Estudiante.getCelular());
            sentencia.setLong(7, Estudiante.getFijo());
            sentencia.setString(8, Estudiante.getPrograma());
            sentencia.executeUpdate();
            Desconectar();
            return true;

        } catch (Exception e) {
            System.out.println("El error es: " + e);
            return false;
        }
    }

    @Override
    public boolean actualizarEstudiante(EstudianteVo Estudiante) {
        try {
            Conectar();
            PreparedStatement sentencia = Conexion.prepareStatement("update estudiantes set nombre = ?, apellido = ?, nacimiento = ?, CorreoInst = ?, correopersonal = ?, celular = ?, fijo = ?, programa = ?;");
            sentencia.setString(1, Estudiante.getNombres());
            sentencia.setString(2, Estudiante.getApellidos());
            sentencia.setString(3, Estudiante.getNacimiento());
            sentencia.setString(4, Estudiante.getCorreoInst());
            sentencia.setString(5, Estudiante.getCorreoPersonal());
            sentencia.setLong(6, Estudiante.getCelular());
            sentencia.setLong(7, Estudiante.getFijo());
            sentencia.setString(8, Estudiante.getPrograma());
            sentencia.executeUpdate();
            Desconectar();
            return true;
        } catch (Exception e) {
            System.out.println("El error es: " + e);
            return false;
        }        
    }

    @Override
    public boolean eliminarEstudiante(String CorreoInst) {
        try {
            Conectar();
            PreparedStatement sentencia = Conexion.prepareStatement("delete estudiantes where CorreoInst = ?;");
        } catch (Exception e) {
        }
    }

    @Override
    public List<EstudianteVo> consultar_todos() {
    }

    @Override
    public EstudianteVo consultarPorCorreo(String CorreoInst) {
    }

    @Override
    public List<EstudianteVo> consultarPorApellido(String Apellido) {
    }

    @Override
    public List<EstudianteVo> consultarPorPrograma(String Programa) {
    }

    @Override
    public int consultarCantidadEstudiante(String Programa) {
    }

    @Override
    public List<EstudianteVo> consultarPorFecha(String Nacimiento) {
    }

    @Override
    public EstudianteVo consultarPorCelular(long Celular) {
    }
    
}
