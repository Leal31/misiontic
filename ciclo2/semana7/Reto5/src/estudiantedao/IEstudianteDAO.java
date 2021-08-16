/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estudiantedao;

import java.util.List;
import modelovo.EstudianteVo;

/**
 *
 * @author leale
 */
public interface IEstudianteDAO {
    public boolean insertarEstudiante(EstudianteVo Estudiante);
    public boolean actualizarEstudiante(String CorreoInst, EstudianteVo Estudiante);
    public boolean eliminarEstudiante(String CorreoInst);
    public List<EstudianteVo> consultar_todos();
    public EstudianteVo consultarPorCorreo(String CorreoInst);
    public List<EstudianteVo> consultarPorApellido(String Apellido);
    public List<EstudianteVo> consultarPorPrograma(String Programa);
    public int consultarCantidadEstudiante(String Programa);
    public List<EstudianteVo> consultarPorFecha(String Nacimiento);
    public List<EstudianteVo> consultarPorCelular(long Celular);
    
}
