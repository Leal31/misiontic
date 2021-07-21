/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bo;

import Vo.EmpleadoVo;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author leale
 */
public class EmpleadoBo {
    // Crear lista empleado
    List<EmpleadoVo> empleados;
    
    // metodo constructor para llenar la lista
    public EmpleadoBo() {
        empleados = new ArrayList<>();
        
        EmpleadoVo empleado1 = new EmpleadoVo(0, "Emanuel", "Leal");
        EmpleadoVo empleado2 = new EmpleadoVo(1, "Diego", "Castro");
        EmpleadoVo empleado3 = new EmpleadoVo(2, "Pedro", "Leal");
        EmpleadoVo empleado4 = new EmpleadoVo(3, "Ana", "Arce");
        EmpleadoVo empleado5 = new EmpleadoVo(4, "Brenda", "Giraldo");
        
        empleados.add(empleado1);
        empleados.add(empleado2);
        empleados.add(empleado3);
        empleados.add(empleado4);
        empleados.add(empleado5);
        
        
    }
    public List<EmpleadoVo> obtenerEmpleados() {
        return empleados;
    }
    // obtener empleado usando el id
    
    public EmpleadoVo obtenerEmpleado(int id) {
        return empleados.get(id);
    }
    
    public void actualizarEmpleado(EmpleadoVo empleado) {
        empleados.get(empleado.getId()).setNombre(empleado.getNombre());
        empleados.get(empleado.getId()).setApellido(empleado.getApellido());
        System.out.println("El empleado con el id: " + empleado.getId() + " se actualizo satisfactoriamente");
    }
    // eliminar o borrar un empleado
    public void EliminarEmpleado(EmpleadoVo empleado) {
        
        empleados.remove(empleado.getId());
        System.out.println("El empleado con id: " + empleado.getId() + " se removio satisfactoriamente");
    }
}
