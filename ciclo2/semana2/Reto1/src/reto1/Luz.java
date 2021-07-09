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
    private float KiloWats;
    private float precioConsumo = 6200;
    private int estrato;
    private double totalPago;

    public float getKiloWats() {
        return KiloWats;
    }

    public void setKiloWats(float KiloWats) {
        this.KiloWats = KiloWats;
    }

    public float getPrecioConsumo() {
        return precioConsumo;
    }

    public void setPrecioConsumo(float precioConsumo) {
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
        totalPago = totalPago + (totalPago * 0.01);
        return totalPago;
    }
}
