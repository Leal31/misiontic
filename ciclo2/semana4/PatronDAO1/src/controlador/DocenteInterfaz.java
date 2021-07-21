/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.util.List;
import modelo.Docente;

/**
 *
 * @author leale
 */
public interface DocenteInterfaz {
    // Declaramos los métodos de acceso de datos
    public List<Docente> obtenerDocentes();
    public Docente obtenerDocente(int id);
    public void actualizarDocente(Docente docente);
    public void eliminarDocente(Docente docente);
}
