// La media aritmetica
package ejercicio6;

import java.util.Scanner; // importo el paquete util que está dentro del 
                          // paquete Java, para utilizar la clase Scanner

/* creo la clase pública, que se llama como el paquete (puede q no)*/
public class mediaArEntera { 

 public static void main(String[] args) { // la clase Scanner es estática
     
     System.out.println("Ingrese la primer Nota ");
     Scanner sc = new Scanner(System.in); // Creación del Scanner
     int nota1;                         // declaracion de variable entera
     nota1= sc.nextInt();            // ingresamos por teclado el valor entero
     
     System.out.println("Ingrese la segunda Nota ");
     int nota2;                         // declaracion de variable entera
     nota2= sc.nextInt();
     
     System.out.println("Ingrese la tercera Nota ");
     int nota3;                         // declaracion de variable entera
     nota3= sc.nextInt();
     
     int mediaAri;
     mediaAri=(nota1+nota2+nota3)/3;
     
     System.out.println("La parte entera de la media aritmética es "+mediaAri);
    }
    
}
