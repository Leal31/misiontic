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
public class Notas {
    private String Nombre;
    private String Carrera;
    private float nota1;
    private float nota2;
    private float nota3;
    private float definitiva;
    private double beca;

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getCarrera() {
        return Carrera;
    }

    public void setCarrera(String Carrera) {
        this.Carrera = Carrera;
    }

    public float getNota1() {
        return nota1;
    }

    public void setNota1(float nota1) {
        this.nota1 = nota1;
    }

    public float getNota2() {
        return nota2;
    }

    public void setNota2(float nota2) {
        this.nota2 = nota2;
    }

    public float getNota3() {
        return nota3;
    }

    public void setNota3(float nota3) {
        this.nota3 = nota3;
    }

    public float getDefinitiva() {
        return definitiva;
    }

    public void setDefinitiva(float definitiva) {
        this.definitiva = definitiva;
    }

    public double getBeca() {
        return beca;
    }

    public void setBeca(float beca) {
        this.beca = beca;
    }
    public void totalBeca() {
      
        definitiva = (nota1 + nota2 + nota3) / 3;
        
        if (Carrera.equalsIgnoreCase("Sistemas") && (definitiva >= 4.0 && definitiva <= 5.0))
            beca = 1450000;
        else if (Carrera.equalsIgnoreCase("Electronica") && (definitiva >= 4.2 && definitiva <= 5.0)) 
            beca = 1480000;
        else if (Carrera.equalsIgnoreCase("Contaduria") && (definitiva >= 4.5 && definitiva <= 5.0)) 
            beca = 1500000;
        else if (Carrera.equalsIgnoreCase("Arquitectura") && (definitiva == 5.0)) 
            beca = 1700000;
        else 
            beca = 0;
                
        System.out.println("El/La Estudiante " + Nombre + " de la carrera " + Carrera 
                        + " con una nota definitiva de " + definitiva + " tiene una beca de " + beca + " pesos");
    
    }
}

