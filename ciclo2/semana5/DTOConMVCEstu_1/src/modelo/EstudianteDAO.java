package modelo;

import java.util.List;

public interface EstudianteDAO{
    public void guardar_estudiantes(List<EstudianteVo> estudiantes); // guardar archivo
    public List<EstudianteVo> cargar_estudiantes(); // leer archivo
}
