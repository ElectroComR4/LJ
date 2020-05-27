// La edad actual del usuario
package ejercicio3;

import java.util.Scanner; // importo el paquete util que está dentro del 
                          // paquete Java, para utilizar la clase Scanner

// creo la clase pública
public class calculaEdad { 

 public static void main(String[] args) { // la clase Scanner es estática
     
     Scanner sc = new Scanner(System.in); // Creación del Scanner
     
     System.out.println("Ingrese el año actual");
     int año;                         // declaracion de variable entera
     año= sc.nextInt();            // ingresamos por teclado el valor entero
     
     System.out.println("Ingrese el año en que usted nació");
     int nacimiento;                         // declaracion de variable entera
     nacimiento= sc.nextInt();            // ingresamos por teclado el valor entero
     
     int edad;
     edad= año-nacimiento;
     
     System.out.println("Su edad actual es " + edad+" años");
     

    }
    
}