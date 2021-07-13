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
public class Luz {
    private int KiloWats;
    private int precioConsumo = 6200;
    private int estrato;
    private double totalPago;
    private double descuento;

    public int getKiloWats() {
        return KiloWats;
    }

    public void setKiloWats(int KiloWats) {
        this.KiloWats = KiloWats;
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
    
    public double totalPagarLuz() {
       
        if (estrato >= 1 && estrato <= 2)
            totalPago = ((precioConsumo * KiloWats) - ((precioConsumo * KiloWats) * 0.5));
        else if (estrato >= 3 && estrato <= 4)
            totalPago = ((precioConsumo * KiloWats) - ((precioConsumo * KiloWats) * 0.1));
        else if (estrato >= 5 && estrato <= 6)
            totalPago = (precioConsumo * KiloWats) + ((precioConsumo * KiloWats) * 0.25);
        else
            System.out.println("No es un estrato valido");
        totalPago = totalPago + this.impuesto();
        return totalPago;
    }
    
    public double sacarDescuento() {
        if (estrato >= 1 && estrato <= 2) 
            descuento = -(precioConsumo * KiloWats) * 0.5;
        else if (estrato >= 3 && estrato <= 4)
            descuento = -(precioConsumo * KiloWats) * 0.1;
        else if (estrato >= 5 && estrato <= 6)
            descuento = (precioConsumo * KiloWats) * 0.25;
        else
            System.out.println("No es un estrato valido");
        
        return descuento;
    }
    
     public double totalPagar() {
        
        
        return precioConsumo * KiloWats;
    }
     
    public double impuesto() {
        
        return this.totalPagar() * 0.01;
    }
}
