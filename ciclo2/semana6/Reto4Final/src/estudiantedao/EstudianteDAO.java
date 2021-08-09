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
    }

    @Override
    public boolean actualizarEstudiante(EstudianteVo Estudiante) {
    }

    @Override
    public boolean eliminarEstudiante(String CorreoInst) {
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
