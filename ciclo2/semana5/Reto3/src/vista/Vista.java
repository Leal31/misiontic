package vista;

import controlador.EstudianteBo;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import modelo.EstudianteVo;

public class Vista {
    public void Menu() {
    try {
        BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));
        int opcion = 1;

        EstudianteBo estudiante = new EstudianteBo();
        
        while (opcion >= 1  && opcion <= 6) {
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
                    agregar.setNacimiento(leer.readLine());
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
                        System.out.println("Fecha nacimiento: " + estudianteEncontrado.getNacimiento());
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
                    EstudianteVo actualizar = new EstudianteVo();
                    System.out.println("Mofidicar estudiante");
                    System.out.println("Ingresar correo institucional: ");
                    CorreoInst = leer.readLine();
                    actualizar = estudiante.consultarEstudiante(CorreoInst);
                    System.out.println("Ingresar correo personal: ");
                    actualizar.setCorreoPersonal(leer.readLine());
                    System.out.println("Ingresar número de celular: ");
                    actualizar.setCelular(Long.parseLong(leer.readLine()));
                    System.out.println("Ingresar número fijo: ");
                    actualizar.setFijo(Long.parseLong(leer.readLine()));
                    System.out.println("Ingresar programa: ");
                    actualizar.setProgramaAcademico(leer.readLine());
                    estudiante.actualizarEstudiante(actualizar);
                    System.out.println("Se modificó el estudiante");
                    break;
                case 4:
                    System.out.println("Eliminar estudiante");
                    System.out.println("Ingrese el correo institucional: ");
                    CorreoInst = leer.readLine();
                    EstudianteVo estudianteBorrar = estudiante.consultarEstudiante(CorreoInst);
                    estudiante.eliminarEstudiante(estudianteBorrar);
                    System.out.println("Se eliminó el estudiante");
                    break;
                case 5:
                    System.out.println("El directorio de los estudiantes");
                    for (EstudianteVo estudiantes : estudiante.obtenerEstudiante()) {
                        System.out.println("Nombres: " + estudiantes.getNombres());
                        System.out.println("Apellidos: " + estudiantes.getApellidos());
                        System.out.println("Fecha nacimiento: " + estudiantes.getNacimiento());
                        System.out.println("Correo institucional: " + estudiantes.getCorreoInst());
                        System.out.println("Correo personal: " + estudiantes.getCorreoPersonal());
                        System.out.println("Número de teléfono celular: " + estudiantes.getCelular());
                        System.out.println("Número de teléfono fijo: " + estudiantes.getFijo());
                        System.out.println("Programa academico: " + estudiantes.getProgramaAcademico());
                    }
                    break;
                case 6:
                    System.out.println("Hasta pronto");
                    System.exit(0);
                    break;
            }
            
            
        }
        } catch (Exception e) {
            System.out.println("La excepcion es: " + e);
            
        } finally {
            System.out.println("Programa finalizado");
        }
}
}
