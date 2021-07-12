/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herenciaconstructor;

/**
 *
 * @author leale
 */
public class Tiempo_Completo extends Docente {
    private double Salario;
    
    public Tiempo_Completo(String Cedula, String Nombre, String Profesion, int Edad, double Salario) {
        // Uso de clausula super para enviar los datos de la superclase
        super(Cedula, Nombre, Profesion, Edad);
        this.Salario = Salario;
    }
    public double getSalario() {
        return Salario;
    }

    public void setSalario(double Salario) {
        this.Salario = Salario;
    }
    
}
