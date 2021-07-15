/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodoabstracto;

/**
 *
 * @author leale
 */
public class Tiempo_Completo extends Docente  {
    private double Salario;
    private double total;
    
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
    
    @Override
    public double CalcularTotal() {
        total = Salario;
        return total;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }
}
