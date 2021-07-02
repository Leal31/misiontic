/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciodos;
import java.util.Scanner;
/**
 *
 * @author leale
 */
public class EjercicioDos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic her
        Scanner lectura = new Scanner(System.in);
        
      
        String Cedula, NombreDocente, Profesion;
        String Codigo, NombreEstudiante, Carrera;
        
        System.out.println("Digite la cedula del profesor: ");
        Cedula = lectura.nextLine();
        System.out.println("Digite el nombre del docente: ");
        NombreDocente = lectura.nextLine();
        System.out.println("Digite la profesion del docente: ");
        Profesion = lectura.nextLine();
        System.out.println("Digite el codigo del estudiante: ");
        Codigo = lectura.nextLine();
        System.out.println("Digite el nombre del estudiante: ");
        NombreEstudiante = lectura.nextLine();
        System.out.println("Digite la carrera del estudiante: ");
        Carrera = lectura.nextLine();
        
        Estudiante objetoEstudiante = new Estudiante();
        
        Docente objetoDocente = new Docente();
        
        objetoDocente.SetCedula(Cedula);
        objetoDocente.SetNombre(NombreDocente);
        objetoDocente.SetProfesion(Profesion);
        objetoEstudiante.SetCodigo(Codigo);
        objetoEstudiante.SetNombre(NombreEstudiante);
        objetoEstudiante.SetCarrera(Carrera);
        
        System.out.println("El Docente " + objetoDocente.GetNombre() + " con el numero de cedula " 
                + objetoDocente.GetCedula() + " y con una profesion de " + objetoDocente.GetProfesion() + 
                " Le da clases al estudiante " + objetoEstudiante.GetNombre() + " con el codigo " 
                + objetoEstudiante.GetCodigo() + " que esta cursando la carrera de " 
                + objetoEstudiante.GetCarrera());   
        
    }
    
}
