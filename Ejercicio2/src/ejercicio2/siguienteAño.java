// La edad del proximo año
package ejercicio2;

import java.util.Scanner; // importo el paquete util que está dentro del 
                          // paquete Java, para utilizar la clase Scanner

/* creo la clase pública, que se llama como el paquete (puede q no)*/
public class siguienteAño { 

 public static void main(String[] args) { // la clase Scanner es estática
     
     System.out.println("Ingrese su edad");
     Scanner sc = new Scanner(System.in); // Creación del Scanner
     int edad;                         // declaracion de variable entera
     edad= sc.nextInt();            // ingresamos por teclado el valor entero
     edad= edad + 1;
     System.out.println("Su edad el siguiente año será de "+edad+" años");
     
     
     
    }
    
}
