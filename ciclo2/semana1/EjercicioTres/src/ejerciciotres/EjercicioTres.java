/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciotres;
import java.util.Scanner;
/**
 *
 * @author master
 */
public class EjercicioTres {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner lectura = new Scanner(System.in);
        String CedulaMedico, NombreMedico, Salario;
        String CedulaPaciente, NombrePaciente, Direccion;
        
        System.out.println("Ingrese el numero de cedula del medico: ");
        CedulaMedico = lectura.nextLine();
        System.out.println("Ingrese el nombre del medico: ");
        NombreMedico = lectura.nextLine();
        System.out.println("Ingrese el salario del medico: ");
        Salario = lectura.nextLine();
        System.out.println("Ingrese la cedula del paciente: ");
        CedulaPaciente = lectura.nextLine();
        System.out.println("Ingrese el nombre del paciente: ");
        NombrePaciente = lectura.nextLine();
        System.out.println("Ingrese la direccion del paciente: ");
        Direccion = lectura.nextLine();
        
        Medico objetoMedico = new Medico();
        Paciente objetoPaciente = new Paciente();
        
        objetoMedico.setCedula(CedulaMedico);
        objetoMedico.setNombre(NombreMedico);
        objetoMedico.setSalario(Salario);
        objetoPaciente.setCedula(CedulaPaciente);
        objetoPaciente.setNombre(NombrePaciente);
        objetoPaciente.setDireccion(Direccion);
        
        System.out.println("Nombre Del Doctor: " + objetoMedico.getNombre());
        System.out.println("Cedula del Doctor: " + objetoMedico.getCedula());
        System.out.println("Salario del Doctor: " + objetoMedico.getSalario());
        System.out.println("Nombre del paciente: " + objetoPaciente.getNombre());
        System.out.println("Cedula del paciente: " + objetoPaciente.getCedula());
        System.out.println("Direccion del paciente: " + objetoPaciente.getDireccion());
    }
    
}
