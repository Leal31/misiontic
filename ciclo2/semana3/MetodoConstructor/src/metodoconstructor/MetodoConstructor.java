/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodoconstructor;
import java.util.Scanner;
/**
 *
 * @author leale
 */
public class MetodoConstructor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*
        Scanner leer = new Scanner(System.in);
        
        String Cedula;
        String Nombre;
        double Salario;
        
        System.out.println("Ingrese la cedula: ");
        Cedula = leer.nextLine();
        System.out.println("Ingrese su nombre: ");
        Nombre = leer.nextLine();
        System.out.println("Ingrese su salario: ");
        Salario = leer.nextDouble();
        
        Empleado objetoEm = new Empleado(Cedula, Nombre, Salario);
        
        System.out.println("El Empleado " + objetoEm.getNombre() + " Con cedula de: " + objetoEm.getCedula()
         + " Tiene un salario de: " + objetoEm.getSalario());
         */
        Empleado objetoEm1 = new Empleado("1110283134", "Emanuel Leal", 2500000);
        
        System.out.println("El empleado: " + objetoEm1.getNombre() + " Identificado con la cedula: "
         + objetoEm1.getCedula() + "  Tiene un salario de: " + objetoEm1.getSalario());
        
        objetoEm1.setCedula("1110283132");
        objetoEm1.setNombre("Emanuel");
        objetoEm1.setSalario(1590000);
        
        System.out.println("El empleado: " + objetoEm1.getNombre() + " Identificado con la cedula: "
         + objetoEm1.getCedula() + "  Tiene un salario de: " + objetoEm1.getSalario());

    }
    
}
