/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patrondao1;

import controlador.DocenteInterfaz;
import demostracion.ImplementacionInterfaz;
import modelo.Docente;

/**
 *
 * @author leale
 */
public class PatronDAO1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        DocenteInterfaz docenteDao = new ImplementacionInterfaz();
        docenteDao.obtenerDocentes().forEach(System.out::println);
        // obtener o consultar un docente por id para actualizar
        Docente docente = docenteDao.obtenerDocente(2);
        docente.setApellido("Ramirez");
        // actualizar
        docenteDao.actualizarDocente(docente);
        // imprimir lista actualizada
        System.out.println("Obtener docentes:");
        docenteDao.obtenerDocentes().forEach(System.out::println);
        
        // eliminar
        docenteDao.eliminarDocente(docente);
        System.out.println("Eliminar Docente:");
        docenteDao.obtenerDocentes().forEach(System.out::println);
        
    }
    
}
