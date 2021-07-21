/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demostracion;

import controlador.DocenteInterfaz;
import java.util.ArrayList;
import java.util.List;
import modelo.Docente;

/**
 *
 * @author leale
 */
public class ImplementacionInterfaz implements DocenteInterfaz{
    List<Docente> docentes;
    
    public ImplementacionInterfaz() {
        docentes = new ArrayList();
        Docente docente1 = new Docente(0, "Gabriela", "Ramos");
        Docente docente2 = new Docente(1, "Pedro", "Gonzalez");
        Docente docente3 = new Docente(2, "Maria", "Rosales");
        Docente docente4 = new Docente(3, "Victoria", "Gaitan");

        docentes.add(docente1);
        docentes.add(docente2);
        docentes.add(docente3);
        docentes.add(docente4);
    }
    @Override
    public List<Docente> obtenerDocentes() {
        
        return docentes;
    }

    @Override
    public Docente obtenerDocente(int id) {
      
       // obtener un docente por su id
       return docentes.get(id); 
    }

    @Override
    public void actualizarDocente(Docente docente) {
        docentes.get(docente.getId()).setNombre(docente.getNombre());
        docentes.get(docente.getId()).setApellido(docente.getApellido());
        System.out.println("El docente con el id: " + docente.getId() + " se actualizo satisfactoriamente");
    }

    @Override
    public void eliminarDocente(Docente docente) {
        docentes.remove(docente.getId());
        System.out.println("El docente con el id: " + docente.getId() + " se removio satisfactoriamente");
    }
    
}
