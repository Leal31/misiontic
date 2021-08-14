/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import controladorbo.EstudianteBo;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import modelovo.EstudianteVo;

/**
 *
 * @author leale
 */
public class Vista {
    public void Menu() throws IOException {
        BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));
        int opcion = 1;
        
        while (opcion >= 1 && opcion <= 11) {
            System.out.println("Instituto la floresta");
            System.out.println("1. Ingresar estudiante");
            System.out.println("2. Actualizar estudiante");
            System.out.println("3. Borrar estudiante");
            System.out.println("4. Mostrar estudiantes");
            System.out.println("5. Consultar estudiante por correo institucional");
            System.out.println("6. Consultar estudiantes por apellido");
            System.out.println("7. Consultar estudiantes por programa");
            System.out.println("8. Consultar la cantidad de estudiantes");
            System.out.println("9. Consultar Estudiantes por fecha de nacimiento");
            System.out.println("10. Consultar estudiantes por Celular");
            System.out.println("11. Salir");
            System.out.println("Ingresa una opcion");
            opcion = Integer.parseInt(leer.readLine());
            
            switch (opcion) {
                case 1: // Ingresar un estudiante
                    try {
                        EstudianteBo añadir = new EstudianteBo();
                        EstudianteVo estudiante = new EstudianteVo();
                        System.out.println("Ingresa el nombre del estudiante");
                        estudiante.setNombres(leer.readLine());
                        System.out.println("Ingresa los apellidos del estudiante");
                        estudiante.setApellidos(leer.readLine());
                        System.out.println("Ingresa la fecha de nacimiento del estudiante");
                        estudiante.setNacimiento(leer.readLine());
                        System.out.println("Ingresa el correo institucional del estudiante");
                        estudiante.setCorreoInst(leer.readLine());
                        System.out.println("Ingresa el correo personal del estudiante");
                        estudiante.setCorreoPersonal(leer.readLine());
                        System.out.println("Ingresa el celular del estudiante");
                        estudiante.setCelular(Long.parseLong(leer.readLine()));
                        System.out.println("Ingresa el fijo del estudiante");
                        estudiante.setFijo(Long.parseLong(leer.readLine()));
                        System.out.println("Ingresa el programa del estudiante");
                        estudiante.setPrograma(leer.readLine());
                        añadir.agregarEstudiante(estudiante);
                        System.out.println("El estudiante fue agregado correctamente");
                } catch (Exception e) {
                        System.out.println("El error es: " + e);
                }    
                    break;
                case 2: // Modificar un estudiante
                    try {
                        EstudianteBo actualizar = new EstudianteBo();
                        EstudianteVo estudiante = new EstudianteVo();
                        System.out.println("Ingresa el nombre del estudiante");
                        estudiante.setNombres(leer.readLine());
                        System.out.println("Ingresa los apellidos del estudiante");
                        estudiante.setApellidos(leer.readLine());
                        System.out.println("Ingresa la fecha de nacimiento del estudiante");
                        estudiante.setNacimiento(leer.readLine());
                        System.out.println("Ingresa el correo institucional del estudiante");
                        estudiante.setCorreoInst(leer.readLine());
                        System.out.println("Ingresa el correo personal del estudiante");
                        estudiante.setCorreoPersonal(leer.readLine());
                        System.out.println("Ingresa el celular del estudiante");
                        estudiante.setCelular(Long.parseLong(leer.readLine()));
                        System.out.println("Ingresa el fijo del estudiante");
                        estudiante.setFijo(Long.parseLong(leer.readLine()));
                        System.out.println("Ingresa el programa del estudiante");
                        estudiante.setPrograma(leer.readLine());
                        actualizar.actualizarEstudiante(estudiante);
                        System.out.println("El estudiante fue actualizado correctamente");
                } catch (Exception e) {
                        System.out.println("El error es: " + e);
                }
                    break;
                case 3: // Eliminar un estudiante
                    try {
                        EstudianteBo eliminar = new EstudianteBo();
                        System.out.println("Ingrese el correo de la persona que desea eliminar: ");
                        String correo = leer.readLine();
                        eliminar.eliminarEstudiante(correo);
                        System.out.println("El estudiante fue eliminado satisfactoriamente");
                    } catch (Exception e) {
                        System.out.println("El error es: " + e);
                    }
                    break;
                case 4: // Mostrar todos los estudiantes
                    EstudianteBo mostrar = new EstudianteBo();
                    for (EstudianteVo Estudiante : mostrar.consultarEstudiantes()) {
                        System.out.println("Nombres: " + Estudiante.getNombres());
                        System.out.println("Apellidos: " +Estudiante.getApellidos());
                        System.out.println("Fecha de nacimiento: " + Estudiante.getNacimiento());
                        System.out.println("Correo institucional: " + Estudiante.getCorreoInst());
                        System.out.println("Correo Personal: " + Estudiante.getCorreoPersonal());
                        System.out.println("Celular: " + Estudiante.getCelular());
                        System.out.println("Fijo: " + Estudiante.getFijo());
                        System.out.println("Programa Academico: " + Estudiante.getPrograma());
                        System.out.println("******************************");
                    }
                    break;
                case 5: // Consultar un estudiante por su correo institucional
                    try {
                        EstudianteBo consultarCorreo = new EstudianteBo();
                        System.out.println("Ingrese el correo del estudiante: ");
                        String correo = leer.readLine();
                        EstudianteVo Estudiante = consultarCorreo.consultarCorreo(correo);
                        
                        System.out.println("Nombres: " + Estudiante.getNombres());
                        System.out.println("Apellidos: " +Estudiante.getApellidos());
                        System.out.println("Fecha de nacimiento: " + Estudiante.getNacimiento());
                        System.out.println("Correo institucional: " + Estudiante.getCorreoInst());
                        System.out.println("Correo Personal: " + Estudiante.getCorreoPersonal());
                        System.out.println("Celular: " + Estudiante.getCelular());
                        System.out.println("Fijo: " + Estudiante.getFijo());
                        System.out.println("Programa Academico: " + Estudiante.getPrograma());
                } catch (Exception e) {
                        System.out.println("El error es: " + e);
                }
                    break;
                case 6: // Consultar un estudiante por su apellido
                    try {
                        EstudianteBo consultarApellido = new EstudianteBo();
                        System.out.println("Ingrese el apellido de los estudiantes: ");
                        String Apellido = leer.readLine();
                        for (EstudianteVo Estudiante : consultarApellido.consultarApellido(Apellido)) {
                            System.out.println("Nombres: " + Estudiante.getNombres());
                            System.out.println("Apellidos: " +Estudiante.getApellidos());
                            System.out.println("Fecha de nacimiento: " + Estudiante.getNacimiento());
                            System.out.println("Correo institucional: " + Estudiante.getCorreoInst());
                            System.out.println("Correo Personal: " + Estudiante.getCorreoPersonal());
                            System.out.println("Celular: " + Estudiante.getCelular());
                            System.out.println("Fijo: " + Estudiante.getFijo());
                            System.out.println("Programa Academico: " + Estudiante.getPrograma());
                        }
                } catch (Exception e) {
                        System.out.println("El error es: ");
                }
                    break;
                case 7: // Consultar un estudiante por su programa academico
                    try {
                        EstudianteBo consultarporPrograma = new EstudianteBo();
                        System.out.println("Ingrese el programa de los estudiantes: ");
                        String Programa = leer.readLine();
                        for (EstudianteVo Estudiante : consultarporPrograma.consultarPrograma(Programa)) {
                            System.out.println("Nombres: " + Estudiante.getNombres());
                            System.out.println("Apellidos: " + Estudiante.getApellidos());
                            
                        }
                } catch (Exception e) {
                        System.out.println("El error es: " + e);
                }
                    break;
                case 8: // Consultar cantidad de estudiantes
                    try {
                        EstudianteBo cantidad = new EstudianteBo();
                        System.out.println("Que programa quiere ver cuantos hay");
                        String Programa = leer.readLine();
                        System.out.println("La cantidad de estudiantes son: " + cantidad.cantidadEstudiante(Programa));

                } catch (Exception e) {
                        System.out.println("El error es: " + e);
                }
                    break;
                case 9: // Consultar un estudiante por su fecha de nacimiento
                    try {
                        EstudianteBo consultarNacimiento = new EstudianteBo();
                        System.out.println("Ingrese La fecha de nacimiento del estudiante: ");
                        String Nacimiento = leer.readLine();
                        for (EstudianteVo Estudiante : consultarNacimiento.consultarFecha(Nacimiento)) {
                            System.out.println("Nombres: " + Estudiante.getNombres());
                            System.out.println("Apellidos: " +Estudiante.getApellidos());
                            System.out.println("Fecha de nacimiento: " + Estudiante.getNacimiento());
                            System.out.println("Correo institucional: " + Estudiante.getCorreoInst());
                            System.out.println("Correo Personal: " + Estudiante.getCorreoPersonal());
                            System.out.println("Celular: " + Estudiante.getCelular());
                            System.out.println("Fijo: " + Estudiante.getFijo());
                            System.out.println("Programa Academico: " + Estudiante.getPrograma());
                            System.out.println("******************************");
                        }
                } catch (Exception e) {
                        System.out.println("El error es: " + e);
                }
                    break;
                case 10: // Consultar un estudiante por su celular
                    try {
                        EstudianteBo consultarCelular = new EstudianteBo();
                        System.out.println("Ingrese el celular de los estudiantes: ");
                        long celular = Long.parseLong(leer.readLine());
                        for (EstudianteVo Estudiante : consultarCelular.consultarCelular(celular)) {
                            System.out.println("Nombres: " + Estudiante.getNombres());
                            System.out.println("Apellidos: " +Estudiante.getApellidos());
                            System.out.println("Fecha de nacimiento: " + Estudiante.getNacimiento());
                            System.out.println("Correo institucional: " + Estudiante.getCorreoInst());
                            System.out.println("Correo Personal: " + Estudiante.getCorreoPersonal());
                            System.out.println("Celular: " + Estudiante.getCelular());
                            System.out.println("Fijo: " + Estudiante.getFijo());
                            System.out.println("Programa Academico: " + Estudiante.getPrograma());
                            System.out.println("******************************");
                        }
                } catch (Exception e) {
                        System.out.println("El error es: " + e);
                }
                    break;
                case 11:
                    System.exit(0);
                    break;
                
                default:
                    System.out.println("opcion no valida");
                    break;
                  
            }
        }
    }
    
}
