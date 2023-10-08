/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio02;

/**
 *
 * @author Sistemas
 */
public class Estudiante {
    private double promedio;
    private String categoria;

    public double getPromedio() {
        return promedio;
    }

    public void setPromedio(double promedio) {
        this.promedio = promedio;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public Estudiante(double promedio, String categoria) {
        this.promedio = promedio;
        this.categoria = categoria;
    }

   

   
    
    public double obtenerDescuento(){
        
        if(  promedio>=18 && promedio<=20){
            return 15;
        }else{
            if(promedio>=16 && promedio<18){
                return 12;
            }else{
                if(promedio>=14 && promedio<16){
                    return 10;
                }else{
                    return 0;
                }
            }
        }
    }
    public double obtenerPension(){
        switch(categoria) {
            case "A":
                return 550;
            case "B":
                return 500;
            case "C":
                return 460;
            case "D":
                return 400;
            default:
                throw new AssertionError();
        }
    }
    public double obtenerNuevaPension(){
        return (this.obtenerPension())*((100-this.obtenerDescuento())/100);
    }
    
}
    
