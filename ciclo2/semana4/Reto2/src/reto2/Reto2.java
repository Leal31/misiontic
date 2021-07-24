/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reto2;

import controlador.EstudianteBo;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import modelo.EstudianteVo;

/**
 *
 * @author leale
 */
public class Reto2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));
        int opcion = 1;

        EstudianteBo estudiante = new EstudianteBo();
        
        while (opcion >= 1  && opcion <= 4) {
            System.out.println("INSTITUTO LA FLORESTA");
            System.out.println("Seleccione tarea a realizar: ");
            System.out.println("1. Ingresar estudiante");
            System.out.println("2. Buscar estudiante");
            System.out.println("3. Modificar estudiante");
            System.out.println("4. Eliminar Estudiante");
            System.out.println("5. Ver directorio de estudiantes");
            System.out.println("6. Salir");
            System.out.println("Opción: ");
            opcion = Integer.parseInt(leer.readLine());
            
            switch (opcion) {
                case 1:
                    EstudianteVo agregar = new EstudianteVo();
                    System.out.println("Ingresar estudiante");
                    System.out.println("Ingresar nombres: ");
                    agregar.setNombres(leer.readLine());
                    System.out.println("Ingresar apellidos: ");
                    agregar.setApellidos(leer.readLine());
                    System.out.println("Ingresar fecha de nacimiento (YYYY-MM-DD): ");
                    agregar.setFechaNac(leer.readLine());
                    System.out.println("Ingresar correo institucional: ");
                    agregar.setCorreoInst(leer.readLine());
                    System.out.println("Ingresar correo personal: ");
                    agregar.setCorreoPersonal(leer.readLine());
                    System.out.println("Ingresar número de celular: ");
                    agregar.setCelular(Long.parseLong(leer.readLine()));
                    System.out.println("Ingresar número fijo: ");
                    agregar.setFijo(Long.parseLong(leer.readLine()));
                    System.out.println("Ingresar programa: ");
                    agregar.setProgramaAcademico(leer.readLine());
                    
                    estudiante.agregarEstudiante(agregar);
                    System.out.println("Se agregó el estudiante");
                    break;
                case 2:
                    String CorreoInst;
                    System.out.println("Buscar estudiante");
                    System.out.println("Ingresar correo institucional: ");
                    CorreoInst = leer.readLine();
                    EstudianteVo estudianteEncontrado = estudiante.consultarEstudiante(CorreoInst);
                    
                    if (estudianteEncontrado != null) {
                        System.out.println("Nombres: " + estudianteEncontrado.getNombres());
                        System.out.println("Apellidos: " + estudianteEncontrado.getApellidos());
                        System.out.println("Fecha nacimiento: " + estudianteEncontrado.getFechaNac());
                        System.out.println("Correo institucional: " + estudianteEncontrado.getCorreoInst());
                        System.out.println("Correo personal: " + estudianteEncontrado.getCorreoPersonal());
                        System.out.println("Número de teléfono celular: " + estudianteEncontrado.getCelular());
                        System.out.println("Número de teléfono fijo: " + estudianteEncontrado.getFijo());
                        System.out.println("Programa academico: " + estudianteEncontrado.getProgramaAcademico());
                    } else {
                        System.out.println("No existe un estudiante con ese correo");
                    }
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    System.out.println("Hasta pronto");
                    System.exit(0);
                    break;
            }
            
            
        }
    }
    
}
