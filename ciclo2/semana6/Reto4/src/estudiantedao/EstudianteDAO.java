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
import java.util.ArrayList;

public class EstudianteDAO extends BaseConexion implements IEstudianteDAO {

    @Override
    public boolean insertarEstudiante(EstudianteVo Estudiante) {
        try {
            Conectar();
            PreparedStatement sentencia = Conexion.prepareStatement("insert into estudiantes(nombre, apellido, nacimiento, CorreoInst, correopersonal, celular, fijo, programa) values (?, ?, ?, ?, ?, ?, ?, ?)");
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
            PreparedStatement sentencia = Conexion.prepareStatement("update estudiantes set nombre = ?, apellido = ?, nacimiento = ?, correopersonal = ?, celular = ?, fijo = ?, programa = ? where CorreoInst = ?");
            sentencia.setString(1, Estudiante.getNombres());
            sentencia.setString(2, Estudiante.getApellidos());
            sentencia.setString(3, Estudiante.getNacimiento());
            sentencia.setString(4, Estudiante.getCorreoPersonal());
            sentencia.setLong(5, Estudiante.getCelular());
            sentencia.setLong(6, Estudiante.getFijo());
            sentencia.setString(7, Estudiante.getPrograma());
            sentencia.setString(8, Estudiante.getCorreoInst());

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
            PreparedStatement sentencia = Conexion.prepareStatement("delete from estudiantes where CorreoInst = ?");
            sentencia.setString(1, CorreoInst);
            sentencia.executeUpdate();
            Desconectar();
            return true;
        } catch (Exception e) {
            System.out.println("El error es: " + e);
            return false;
        }
    }

    @Override
    public List<EstudianteVo> consultar_todos() {
        try {
            List<EstudianteVo> estudiantes = new ArrayList();
            Conectar();
            PreparedStatement sentencia = Conexion.prepareStatement("select * from estudiantes");
            ResultSet datos = sentencia.executeQuery();
            while (datos.next()) {
                EstudianteVo estudiante = new EstudianteVo();
                estudiante.setNombres(datos.getString("nombre"));
                estudiante.setApellidos(datos.getString("apellido"));
                estudiante.setNacimiento(datos.getString("nacimiento"));
                estudiante.setCorreoInst(datos.getString("CorreoInst"));
                estudiante.setCorreoPersonal(datos.getString("correopersonal"));
                estudiante.setCelular(datos.getLong("celular"));
                estudiante.setFijo(datos.getLong("fijo"));
                estudiante.setPrograma(datos.getString("programa"));
                estudiantes.add(estudiante);

            }
            Desconectar();
            return estudiantes;
        } catch (Exception e) {
            System.out.println("El error es: " + e);
            return null;
        }
    }

    @Override
    public EstudianteVo consultarPorCorreo(String CorreoInst) {
        try {
            Conectar();
            PreparedStatement sentencia = Conexion.prepareStatement("select * from estudiantes where CorreoInst = ?");
            sentencia.setString(1, CorreoInst);
            ResultSet datos = sentencia.executeQuery();
            EstudianteVo estudiante = new EstudianteVo();

            if (datos.next()) {
                estudiante.setNombres(datos.getString("nombre"));
                estudiante.setApellidos(datos.getString("apellido"));
                estudiante.setNacimiento(datos.getString("nacimiento"));
                estudiante.setCorreoInst(datos.getString("CorreoInst"));
                estudiante.setCorreoPersonal(datos.getString("correopersonal"));
                estudiante.setCelular(datos.getLong("celular"));
                estudiante.setFijo(datos.getLong("fijo"));
                estudiante.setPrograma(datos.getString("programa"));
                sentencia.executeQuery();

            }
            Desconectar();
            return estudiante;
        } catch (Exception e) {
            System.out.println("El error es: " + e);
            return null;
        }
    }

    @Override
    public List<EstudianteVo> consultarPorApellido(String Apellido) {
        try {
            Conectar();
            List<EstudianteVo> estudiantes = new ArrayList();
            PreparedStatement sentencia = Conexion.prepareStatement("select * from estudiantes where apellido = ?");
            sentencia.setString(1, Apellido);
            ResultSet datos = sentencia.executeQuery();
            if (datos.next()) {
                EstudianteVo estudiante = new EstudianteVo();
                estudiante.setNombres(datos.getString("nombre"));
                estudiante.setApellidos(datos.getString("apellido"));
                estudiante.setNacimiento(datos.getString("nacimiento"));
                estudiante.setCorreoInst(datos.getString("CorreoInst"));
                estudiante.setCorreoPersonal(datos.getString("correopersonal"));
                estudiante.setCelular(datos.getLong("celular"));
                estudiante.setFijo(datos.getLong("fijo"));
                estudiante.setPrograma(datos.getString("programa"));
                estudiantes.add(estudiante);

            }
            Desconectar();
            return estudiantes;
        } catch (Exception e) {
            System.out.println("El error es: " + e);
            return null;
        }
    }

    @Override
    public List<EstudianteVo> consultarPorPrograma(String Programa) {
        try {
            List<EstudianteVo> estudiantes = new ArrayList();
            Conectar();
            PreparedStatement sentencia = Conexion.prepareStatement("select nombre, apellido from estudiantes where programa = ?");
            sentencia.setString(1, Programa);
            ResultSet datos = sentencia.executeQuery();
            while (datos.next()) {
                EstudianteVo estudiante = new EstudianteVo();
                estudiante.setNombres(datos.getString("nombre"));
                estudiante.setApellidos(datos.getString("apellido"));
                
                estudiantes.add(estudiante);
            }
            Desconectar();
            return estudiantes;
        } catch (Exception e) {
            System.out.println("El error es: " + e);
            return null;
        }
    }

    @Override
    public int consultarCantidadEstudiante(String Programa) {
        try {
            Conectar();
            PreparedStatement sentencia = Conexion.prepareStatement("select count(nombre) from estudiantes where programa = ?");
            sentencia.setString(1, Programa);
            ResultSet datos = sentencia.executeQuery();
            if (datos.next()) {
                int resultado = datos.getInt(1);
                Desconectar();
                return resultado;
            } else {
                Desconectar();
                return -1;
            }
        } catch (Exception e) {
            System.out.println("El error es: " + e);
            return -1;
        }
    }

    @Override
    public List<EstudianteVo> consultarPorFecha(String Nacimiento) {
        try {
            List<EstudianteVo> estudiantes = new ArrayList();
            Conectar();
            PreparedStatement sentencia = Conexion.prepareStatement("select * from estudiantes where nacimiento = ?");
            sentencia.setString(1, Nacimiento);
            ResultSet datos = sentencia.executeQuery();
            while (datos.next()) {
                EstudianteVo estudiante = new EstudianteVo();
                estudiante.setNombres(datos.getString("nombre"));
                estudiante.setApellidos(datos.getString("apellido"));
                estudiante.setNacimiento(datos.getString("nacimiento"));
                estudiante.setCorreoInst(datos.getString("CorreoInst"));
                estudiante.setCorreoPersonal(datos.getString("correopersonal"));
                estudiante.setCelular(datos.getLong("celular"));
                estudiante.setFijo(datos.getLong("fijo"));
                estudiante.setPrograma(datos.getString("programa"));
                estudiantes.add(estudiante);
                
            }
            Desconectar();
            return estudiantes;
        } catch (Exception e) {
            System.out.println("El error es: " + e);
            return null;
        }
    }

    @Override
    public List<EstudianteVo> consultarPorCelular(long Celular) {
        try {
            List<EstudianteVo> estudiantes = new ArrayList();
            Conectar();
            PreparedStatement sentencia = Conexion.prepareStatement("select * from estudiantes where celular = ?");
            sentencia.setLong(1, Celular);
            ResultSet datos = sentencia.executeQuery();
            while (datos.next()) {
                EstudianteVo estudiante = new EstudianteVo();
                estudiante.setNombres(datos.getString("nombre"));
                estudiante.setApellidos(datos.getString("apellido"));
                estudiante.setNacimiento(datos.getString("nacimiento"));
                estudiante.setCorreoInst(datos.getString("CorreoInst"));
                estudiante.setCorreoPersonal(datos.getString("correopersonal"));
                estudiante.setCelular(datos.getLong("celular"));
                estudiante.setFijo(datos.getLong("fijo"));
                estudiante.setPrograma(datos.getString("programa"));
                estudiantes.add(estudiante);
                
            }
            Desconectar();
            return estudiantes;
        } catch (Exception e) {
            System.out.println("El error es: " + e);
            return null;
        }
    }
    
}
