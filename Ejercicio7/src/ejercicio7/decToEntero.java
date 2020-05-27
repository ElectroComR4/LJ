// La media aritmetica
package ejercicio7;

import java.util.Scanner; // importo el paquete util que está dentro del 
                          // paquete Java, para utilizar la clase Scanner

/* creo la clase pública, que se llama como el paquete (puede q no)*/
public class decToEntero { 

 public static void main(String[] args) { // la clase Scanner es estática
     
     System.out.println("Ingrese un numero decimal ");
     Scanner sc = new Scanner(System.in); // Creación del Scanner
     double decimal;                         // declaracion de variable entera
     decimal= sc.nextDouble();            // ingresamos por teclado el valor entero
     
     int redondeo;
     redondeo =(int) (decimal + 0.5);
     
     System.out.println("El decimal dedondeado es "+redondeo);
    }
    
}
