/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioclases;
/**
 *
 * @author leale
 */
public class Fruteria {
    private int cantidadManzana;
    private double precioManzana = 2000;
    private double totalPago = 0;

    public int getCantidadManzana() {
        return cantidadManzana;
    }

    public void setCantidadManzana(int cantidadManzana) {
        this.cantidadManzana = cantidadManzana;
    }

    public double getPrecioManzana() {
        return precioManzana;
    }

    public void setPrecioManzana(double precioManzana) {
        this.precioManzana = precioManzana;
    }

    public double getTotalPago() {
        return totalPago;
    }

    public void setTotalPago(double totalPago) {
        this.totalPago = totalPago;
    }
    
    public double manzanas() {
        if (cantidadManzana >= 0 && cantidadManzana <= 2)     
            totalPago = (cantidadManzana * precioManzana) - ((cantidadManzana * precioManzana) * 0);
        else if (cantidadManzana >= 3 && cantidadManzana <= 5)     
            totalPago = (cantidadManzana * precioManzana) - ((cantidadManzana * precioManzana) * 0.1);
        else if (cantidadManzana >= 6 && cantidadManzana <= 10) 
            totalPago = (cantidadManzana * precioManzana) - ((cantidadManzana * precioManzana) * 0.15);
        else if (cantidadManzana >= 11) 
            totalPago = (cantidadManzana * precioManzana) - ((cantidadManzana * precioManzana) * 0.2);
        else 
            System.out.println("Valor no valido");
    return totalPago;
    }
}
