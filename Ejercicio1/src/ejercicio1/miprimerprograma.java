/**
 * Este es mi primer programa en Java realizado el 25/5/2020
 * Solicita y toma un numero por teclado, en este caso la edad del usuario.
 * Luego, lo muestra por pantalla.
 */
package ejercicio1; // El paquete de clases que creo se 
                         //  llama miprimerprograma 

import java.util.Scanner; // importo el paquete util que está dentro del 
                          // paquete Java, para utilizar la clase Scanner

/* creo la clase pública, que se llama como el paquete (puede q no)*/
public class miprimerprograma { 

 public static void main(String[] args) { // la clase Scanner es estática
     
     System.out.println("Ingrese su edad");
     Scanner sc = new Scanner(System.in); // Creación del Scanner
     int edad;                         // declaracion de variable entera
     edad= sc.nextInt();            // ingresamos por teclado el valor entero
     
     System.out.println("Su edad es "+edad+" años");
     
     

    }
}