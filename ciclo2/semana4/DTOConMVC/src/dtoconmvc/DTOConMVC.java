/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dtoconmvc;

import controlador.EstudianteBo;
import modelo.EstudianteVo;
import java.util.Scanner;

/**
 *
 * @author leale
 */
public class DTOConMVC {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try {
        Scanner leer = new Scanner(System.in);
        
        // definir variables
        int opcion = 1;
        
        // crear arreglo de forma generica
        EstudianteBo estudianteBo = new EstudianteBo();
        
        while (opcion >= 1 && opcion <= 6) {
            System.out.println("**********MENU ESTUDIANTE**********");
            System.out.println("1. Añadir Estudiante");
            System.out.println("2. Consultar Estudiante");
            System.out.println("3. Actualizar Estudiante");
            System.out.println("4. Eliminar Estudiante");
            System.out.println("5. Mostrar Estudiantes");
            System.out.println("6. Salir");
            System.out.println("Ingrese una opcion");
            opcion = leer.nextInt();
            
            switch (opcion) {
                case 1:
                    // Tamaño inicial del arreglo
                    System.out.println("El tamaño inicial del arreglo es: " + estudianteBo.obtenerEstudiante().size());
                   
                    // instancio clase Vo para añadir estudiante
                    EstudianteVo Nuevo = new EstudianteVo();
                    System.out.println("Ingrese los nombres: ");
                    Nuevo.setNombre(leer.next());
                    System.out.println("Ingrese los apellidos: ");
                    Nuevo.setApellido(leer.next());
                    System.out.println("Ingrese la fecha de nacimiento: ");
                    Nuevo.setNacimiento(leer.next());
                    System.out.println("Ingrese el correo institucional: ");
                    Nuevo.setCorreoInst(leer.next());
                    
                    estudianteBo.agregarEstudiante(Nuevo);
                    System.out.println("El tamaño actual del arreglo es: " + estudianteBo.obtenerEstudiante().size());
                    break;
                case 2:
                    
                    // consultar estudiantes por correo
                    System.out.println("Ingrese el correo institucional: ");
                    String CorreoInst = leer.next();
                    EstudianteVo encontrado = estudianteBo.consultarEstudiante(CorreoInst);
                    
                    if (encontrado != null) {
                        System.out.println("Imprimir informacion del estudiante");
                        System.out.println("Nombres: " + encontrado.getNombre());
                        System.out.println("Apellidos: " + encontrado.getApellido());
                        System.out.println("Fecha nacimiento: " + encontrado.getNacimiento());
                        System.out.println("Correo Institucional: " + encontrado.getCorreoInst());
                        
                    } else {
                        System.out.println("No se encontro el estudiante");
                    }
                    break;
                case 3:
                    // Actualizar un estudiante por parametro correo
                    EstudianteVo actualizar = new EstudianteVo();
                    System.out.println("Ingrese el correo institucional: ");
                    CorreoInst = leer.next();
                    actualizar = estudianteBo.consultarEstudiante(CorreoInst);
                    System.out.println("Ingrese el nombre: ");
                    actualizar.setNombre(leer.next());
                    System.out.println("Ingrese el apellido: ");
                    actualizar.setApellido(leer.next());
                    System.out.println("Ingrese la fecha de nacimiento: ");
                    actualizar.setNacimiento(leer.next());
                    estudianteBo.actualizarEstudiante(actualizar);
                    break;
                case 4:
                    // Borrar o eliminar estudiante por parametro correo
                    
                    System.out.println("Ingrese el correo institucional: ");
                    CorreoInst = leer.nextLine();
                    EstudianteVo estudiante = estudianteBo.consultarEstudiante(CorreoInst);
                    estudianteBo.eliminarEstudiante(estudiante);
                    System.out.println("El estudiante fue eliminado satisfactoriamente");
                    System.out.println("El tamaño actual del arreglo es: " + estudianteBo.obtenerEstudiante().size());
                    break;
                case 5:
                    for (EstudianteVo Estudiantes : estudianteBo.obtenerEstudiante()) {
                        System.out.println(Estudiantes);
                    }
                    break;
                case 6:
                    System.out.println("Hasta pronto");
                    System.exit(0);
                    break;
                default:
                    System.out.println("No es una opcion valida");
                    break;
            }
        }
    } catch(Exception e) {
            System.out.println("El error es: " + e);
    } finally {
            System.out.println("Programa finalizado");
        }
    }
}
