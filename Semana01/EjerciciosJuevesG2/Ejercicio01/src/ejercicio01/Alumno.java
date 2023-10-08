/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio01;

/**
 *
 * @author Sistemas
 */
public class Alumno {
    private double nota1;
    private double nota2;
    private double nota3;

    public Alumno(double nota1, double nota2, double nota3) {
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
    }

    
    
    
    public double getNota1() {
        return nota1;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public double getNota2() {
        return nota2;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }

    public double getNota3() {
        return nota3;
    }

    public void setNota3(double nota3) {
        this.nota3 = nota3;
    }
    public double obtenerPromedio(){
        double promedio;
        promedio=(nota1+nota2+nota3)/3;
        return promedio;
    }
    public String obtenerClasificacion(){
        double p=obtenerPromedio();
        if(p>=16 && p<=20){
            return "Bueno";  
        }else{
            if(p<=15 && p>=11){
                return "Regular";
            }else{
                if(p>=6 && p<=10){
                    return "Deficiente";
                }else{
                    return "Pesimo";
                }
            }
        }
    }
    
    
    
}
