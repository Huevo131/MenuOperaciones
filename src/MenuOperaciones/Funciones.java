/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MenuOperaciones;

/**
 *
 * @author SAC-7
 */
public class Funciones {
    double resultado;
    
    public void Suma(double num1, double num2){
        resultado = num1 + num2;
    }
    
    public void Resta(double num1, double num2){
        resultado = num1 - num2;
    }
    
    public void Multiplicacion(double num1, double num2){
        resultado = num1 * num2;
    }
    
    public void Division(double num1, double num2){
        if(num2==0){
            System.out.println("\nNo es posible dividir entre 0, pruebe con otro numero");
        }
        resultado = num1 / num2;
    }
    
    public void Resultado(){
        System.out.printf("\nResultado : " + "%5.5f", resultado);
    }
}
