/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patrondto1;

import Bo.EmpleadoBo;
import Vo.EmpleadoVo;

/**
 *
 * @author leale
 */
public class PatronDTO1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        // instanciar el objeto de negocios
        EmpleadoBo empleadobo = new EmpleadoBo();
        // obtener la lista empleados
        empleadobo.obtenerEmpleados().forEach(System.out::println);
        // actualizar un empleado
        System.out.println("Actualizar");
        EmpleadoVo empleado = empleadobo.obtenerEmpleado(0);
        empleado.setNombre("Mario");
        empleadobo.actualizarEmpleado(empleado);
        
        // obtener o consultar un empleado
        System.out.println("Consultar");
        empleado = empleadobo.obtenerEmpleado(1);
        System.out.println(empleado);
        
        // eliminar un empleado
        System.out.println("Eliminar");
        empleado = empleadobo.obtenerEmpleado(1);
        empleadobo.EliminarEmpleado(empleado);
        empleadobo.obtenerEmpleados().forEach(System.out::println);
    }
    
}
