/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio.pkg14;
import java.util.Scanner;
/**
 * Pide un número por teclado e indica si es un número primo o no. Un 
número primo es aquel solo puede dividirse entre 1 y si mismo. Por 
ejemplo: 25 no es primo, ya que 25 es divisible entre 5, sin embargo, 17 
si es primo.
Un buen truco para calcular la raíz cuadrada del numero e ir 
comprobando que si es divisible desde ese numero hasta 1.
NOTA: Si se introduce un numero menor o igual que 1, directamente es 
no prim
 * @author fabya
 */
public class Ejercicio14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int numero;
      int contador = 0; 
        Scanner teclado = new Scanner (System.in);
        do  { 
            System.out.println("ingresa un numero");
            numero = teclado.nextInt();
        }while (numero <= 1);
       
                
    for (int i = 1;  i <=numero; i++) {
        if (numero%i == 0) {
             contador++;
            }
       
        }
    if (contador == 2 ){
        System.out.println( "es primo");
    }else if (contador != 2){
        System.out.println("no es primo");
    }
    
    }

   
    
}
