/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reto1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Emanuel Leal Arce
 */
public class Reto1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        // Se crea la variable de lectura por leer datos
        BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));
        // se definen distintas variables que se les pediran al usuario en todo caso
        int opcion = 1;
        int estrato = 0;
        int Gasto;
        
        // se inicia un ciclo con objetivo de repetir un menu
        while (opcion >= 1) {
            System.out.println("PAGO DE SERVICIOS PUBLICOS");
            System.out.println("Seleccione el servicio publico:");
            System.out.println("1. Energia");
            System.out.println("2. Acueducto");
            System.out.println("3. Gas Natural");
            System.out.println("4. Salir");
            System.out.println("Opcion:"); // pedimos una de las opciones planteadas
            opcion = parseInt(leer.readLine()); // leemos por teclado 
            
            // switch para tratar todos los casos
            switch (opcion) {
                case 1: // caso uno agua
                     Luz objetoLuz = new Luz(); // se crea el objeto para luz
                    System.out.println("Estrato del inmueble:"); // se piden datos al usuario
                    estrato = leer.nextInt();
                    System.out.println("Consumo del inmueble:");
                    Gasto = leer.nextInt();
                    // se añaden dichos datos en la clase
                    objetoLuz.setEstrato(estrato);
                    objetoLuz.setKiloWats(Gasto);
                    // se retorna el total
                    System.out.println("El consumo fue: " + objetoLuz.getKiloWats());
                    System.out.println("Valor unidad: " + objetoLuz.getPrecioConsumo());
                    System.out.println("Estrato del inmueble: " + objetoLuz.getEstrato());
                    System.out.println("Costo total: " + objetoLuz.totalPagar());
                    System.out.println("Descuento o sobrecosto: " + objetoLuz.sacarDescuento());
                    System.out.println("Impuesto por infraestructura: " + objetoLuz.impuesto());
                    System.out.println("TOTAL A PAGAR: " + objetoLuz.totalPagarLuz());
                    
                    break;
                case 2: // caso 2 gas
                    
                    Agua objetoAgua = new Agua(); // se inventa un objeto para la clase agua
                    // se ingresan por teclado las variables definidas
                    System.out.println("Estrato del inmueble:");
                    estrato = leer.nextInt();
                    System.out.println("Consumo del inmueble:");
                    Gasto = leer.nextInt();
                    // se guardan en la clase
                    objetoAgua.setEstrato(estrato);
                    objetoAgua.setMetroCubico(Gasto);
                    // se retorna el total
                    System.out.println("El consumo fue: " + objetoAgua.getMetroCubico());
                    System.out.println("Valor unidad: " + objetoAgua.getPrecioConsumo());
                    System.out.println("Estrato del inmueble: " + objetoAgua.getEstrato());
                    System.out.println("Costo total: " + objetoAgua.totalPagar());
                    System.out.println("Descuento o sobrecosto: " + objetoAgua.sacarDescuento());
                    System.out.println("Impuesto por infraestructura: " + objetoAgua.impuesto());
                    System.out.println("TOTAL A PAGAR: " + objetoAgua.TotalPagoAgua());
                    break;
                case 3: // caso 3 luz
                   
                    
                    GasNatural objetoGas = new GasNatural(); // se crea el objeto para gas natural
                    System.out.println("Estrato del inmueble:"); // se piden datos al usuario
                    estrato = leer.nextInt();
                    System.out.println("Consumo del inmueble:");
                    Gasto = leer.nextInt();
                    // se añaden dichos datos a la clase
                    objetoGas.setEstrato(estrato);
                    objetoGas.setMetroCubico(Gasto);
                    // se retorna el total
                    System.out.println("El consumo fue: " + objetoGas.getMetroCubico());
                    System.out.println("Valor unidad: " + objetoGas.getPrecioConsumo());
                    System.out.println("Estrato del inmueble: " + objetoGas.getEstrato());
                    System.out.println("Costo total: " + objetoGas.totalPagar());
                    System.out.println("Descuento o sobrecosto: " + objetoGas.sacarDescuento());
                    System.out.println("Impuesto por infraestructura: " + objetoGas.impuesto());
                    System.out.println("TOTAL A PAGAR: " + objetoGas.TotalPagarGas());
                    break;
                case 4: // caso 4 salir
                    System.exit(0);
                    break;
                default: // default en caso de equivocarse de valor
                    System.out.println("No es una opcion valida: ");
                    break;
            }
        }
            
        
    }
    
}
