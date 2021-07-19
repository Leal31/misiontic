/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listaarreglos;

import java.util.ArrayList;

/**
 *
 * @author leale
 */
public class ListaArreglos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // Crear arreglo con la clase ArrayList
        ArrayList Arreglo = new ArrayList();
        // Verificar tamaño
        System.out.println("El tamaño inicial del array es: " + Arreglo.size());
        
        // llenar o agregar datos al arreglo
        Arreglo.add("Emanuel");
        Arreglo.add("Pedro");
        Arreglo.add("Ana");
        Arreglo.add("Brenda");
        System.out.println("El tamaño actual del array es: " + Arreglo.size());
        System.out.println("Imprimir objetos del arreglo");
        
        System.out.println("El arreglo contiene: " + Arreglo);
        
        // borrar o eliminar un objeto del arreglo
        System.out.println("El objeto " + Arreglo.get(1) + " se eliminó?: " + Arreglo.remove("Pedro"));
        
        System.out.println("El tamaño del arreglo es: " + Arreglo.size());
        // comprobar si existe un objeto en el arreglo
        System.out.println("La lista contiene a: " + Arreglo.get(1) + " = " + Arreglo.contains("Ana"));
        System.out.println("La lista contitne: " + Arreglo);
        System.out.println("Acualizar elemento: " + Arreglo.set(1, "Ana Milena"));
        System.out.println("La lista contiene: " + Arreglo);
    }
    
}
