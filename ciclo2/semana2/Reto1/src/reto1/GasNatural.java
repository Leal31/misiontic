/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reto1;

/**
 *
 * @author master
 */
public class GasNatural {
    private int metroCubico;
    private int precioConsumo = 5234;
    private int estrato;
    private double totalPago;
    private double descuento;

    public int getMetroCubico() {
        return metroCubico;
    }

    public void setMetroCubico(int metroCubico) {
        this.metroCubico = metroCubico;
    }

    public int getPrecioConsumo() {
        return precioConsumo;
    }

    public void setPrecioConsumo(int precioConsumo) {
        this.precioConsumo = precioConsumo;
    }

    public int getEstrato() {
        return estrato;
    }

    public void setEstrato(int estrato) {
        this.estrato = estrato;
    }

    public double getTotalPago() {
        return totalPago;
    }

    public void setTotalPago(double totalPago) {
        this.totalPago = totalPago;
    }
    
    public double TotalPagarGas() {
        if (estrato >= 1 && estrato <= 2)
            totalPago = ((precioConsumo * metroCubico) - ((precioConsumo * metroCubico) * 0.5));
        else if (estrato >= 3 && estrato <= 4)
            totalPago = ((precioConsumo * metroCubico) - ((precioConsumo * metroCubico) * 0.1));
        else if (estrato >= 5 && estrato <= 6)
            totalPago = (precioConsumo * metroCubico) + ((precioConsumo * metroCubico) * 0.25);
        else
            System.out.println("No es un estrato valido");
        totalPago = totalPago + this.impuesto();
        return totalPago;
    }
    
    public double impuesto() {
        
        return this.totalPagar() * 0.01;
    }
    
     public double totalPagar() {
        
        
        return precioConsumo * metroCubico;
    }

    public double getDescuento() {
        return descuento;
    }

    public void setDescuento(double descuento) {
        this.descuento = descuento;
    }
    
    public double sacarDescuento() {
        if (estrato >= 1 && estrato <= 2) 
            descuento = -(precioConsumo * metroCubico) * 0.5;
        else if (estrato >= 3 && estrato <= 4)
            descuento = -(precioConsumo * metroCubico) * 0.1;
        else if (estrato >= 5 && estrato <= 6)
            descuento = (precioConsumo * metroCubico) * 0.25;
        else
            System.out.println("No es un estrato valido");
        
        return descuento;
    }
    
}
