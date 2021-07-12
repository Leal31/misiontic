/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reto1;
import java.util.Scanner;
/**
 *
 * @author Emanuel Leal Arce
 */
public class Reto1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // Se crea la variable de lectura por leer datos
        Scanner leer = new Scanner(System.in);
        // se definen distintas variables que se les pediran al usuario en todo caso
        int opcion = 1;
        int estrato = 0;
        float Gasto;
        
        // se inicia un ciclo con objetivo de repetir un menu
        while (opcion >= 1) {
            System.out.println("**********MENU DE PAGO**********");
            System.out.println("1. Agua");
            System.out.println("2. Gas Natural");
            System.out.println("3. Luz");
            System.out.println("4. Salir");
            System.out.println("Ingresa una decision: "); // pedimos una de las opciones planteadas
            opcion = leer.nextInt(); // leemos por teclado 
            
            // switch para tratar todos los casos
            switch (opcion) {
                case 1: // caso uno agua
                    Agua objetoAgua = new Agua(); // se inventa un objeto para la clase agua
                    // se ingresan por teclado las variables definidas
                    System.out.println("Ingrese el estrato economico: ");
                    estrato = leer.nextInt();
                    System.out.println("Cuantos metros cubicos se han usado: ");
                    Gasto = leer.nextFloat();
                    // se guardan en la clase
                    objetoAgua.setEstrato(estrato);
                    objetoAgua.setMetroCubico(Gasto);
                    // se retorna el total
                    System.out.println("El total a pagar por su consumo de agua es: " + objetoAgua.TotalPagoAgua());
                    
                    break;
                case 2: // caso 2 gas
                    GasNatural objetoGas = new GasNatural(); // se crea el objeto para gas natural
                    System.out.println("Ingrese el estrato economico: "); // se piden datos al usuario
                    estrato = leer.nextInt();
                    System.out.println("Cuantos metros cubcicos se han usado: ");
                    Gasto = leer.nextFloat();
                    // se añaden dichos datos a la clase
                    objetoGas.setEstrato(estrato);
                    objetoGas.setMetroCubico(Gasto);
                    // se retorna el total
                    System.out.println("El total a pagar por su consumo de gas natural es: " + objetoGas.TotalPagarGas());
                    break;
                case 3: // caso 3 luz
                    Luz objetoLuz = new Luz(); // se crea el objeto para luz
                    System.out.println("Ingrese el estrato economico: "); // se piden datos al usuario
                    estrato = leer.nextInt();
                    System.out.println("Cuantos kiloWats se han usado: ");
                    Gasto = leer.nextFloat();
                    // se añaden dichos datos en la clase
                    objetoLuz.setEstrato(estrato);
                    objetoLuz.setKiloWats(Gasto);
                    // se retorna el total
                    System.out.println("El total a pagar por su consumo de luz es: " + objetoLuz.totalPagarLuz());
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
