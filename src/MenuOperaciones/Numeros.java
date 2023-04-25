/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MenuOperaciones;
import java.util.Scanner;

/**
 *
 * @author LENOVO
 */
public class Numeros {

    Scanner entrada = new Scanner(System.in);

    int opcion;
    double num1, num2;

    Funciones Ope = new Funciones();

    public void Menu() {
        System.out.println("Seleccione una opcion del siguiente menu:"
                + "\n\t" + "1) Suma"
                + "\n\t" + "2) Resta"
                + "\n\t" + "3) Multiplicación"
                + "\n\t" + "4) División");
        opcion = entrada.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("\n Ingrese el primer número");
                    num1 = entrada.nextInt();
                    System.out.println("\nIngrese el segundo número");
                    num2 = entrada.nextInt();
                    Ope.Suma(num1, num2);
                    break;
                case 2:
                    System.out.println("\n Ingrese el primer número");
                    num1 = entrada.nextInt();
                    System.out.println("\nIngrese el segundo número");
                    num2 = entrada.nextInt();
                    Ope.Resta(num1, num2);
                    break;
                case 3:
                    System.out.println("\n Ingrese el primer número");
                    num1 = entrada.nextInt();
                    System.out.println("\nIngrese el segundo número");
                    num2 = entrada.nextInt();
                    Ope.Multiplicacion(num1, num2);
                    break;
                case 4:
                    System.out.println("\n Ingrese el primer número");
                    num1 = entrada.nextInt();
                    System.out.println("\nIngrese el segundo número");
                    num2 = entrada.nextInt();
                    Ope.Division(num1, num2);
                    break;
                default:
                    System.out.println("El número " + opcion + " no es un número válido");

            }
            Ope.Resultado();

        

    }
}