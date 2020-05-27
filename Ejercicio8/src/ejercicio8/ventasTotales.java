// La media aritmetica
package ejercicio8;

import java.util.Scanner; // importo el paquete util que está dentro del 
                          // paquete Java, para utilizar la clase Scanner

/* creo la clase pública, que se llama como el paquete (puede q no)*/
public class ventasTotales { 

 public static void main(String[] args) { // la clase Scanner es estática
     double valorKiloManzana=2.35;
     double valorKiloPera=1.95;
     Scanner sc = new Scanner(System.in); // Creación del Scanner
     
     //Ingreso de kilos vendidos en el primer trimestre
     System.out.println("Ingrese la cantidad en kilos de MANZANAS vendidas en el PRIMER trimestre");
     int kilosManzana1;                        
     kilosManzana1= sc.nextInt();            
     System.out.println("Ingrese la cantidad en kilos de Peras vendidas en el PRIMER trimestre");
     int kilosPeras1;                        
     kilosPeras1= sc.nextInt();
     
     //Ingreso de kilos vendidos en el segundo trimestre
     System.out.println("Ingrese la cantidad en kilos de MANZANAS vendidas en el SEGUNDO trimestre");
     int kilosManzana2;                        
     kilosManzana2= sc.nextInt();            
     System.out.println("Ingrese la cantidad en kilos de Peras vendidas en el SEGUNDO trimestre");
     int kilosPeras2;                        
     kilosPeras2= sc.nextInt();
     
     //Ingreso de kilos vendidos en el tercer trimestre
     System.out.println("Ingrese la cantidad en kilos de MANZANAS vendidas en el TERCER trimestre");
     int kilosManzana3;                        
     kilosManzana3= sc.nextInt();            
     System.out.println("Ingrese la cantidad en kilos de Peras vendidas en el TERCER trimestre");
     int kilosPeras3;                        
     kilosPeras3= sc.nextInt();
     
     //Ingreso de kilos vendidos en el cuarto trimestre
     System.out.println("Ingrese la cantidad en kilos de MANZANAS vendidas en el CUARTO trimestre");
     int kilosManzana4;                        
     kilosManzana4= sc.nextInt();            
     System.out.println("Ingrese la cantidad en kilos de Peras vendidas en el CUARTO trimestre");
     int kilosPeras4;                        
     kilosPeras4= sc.nextInt();
     
     double gananciaBruta;
     gananciaBruta=((kilosPeras1+kilosPeras2+kilosPeras3+kilosPeras4)*valorKiloPera)+((kilosManzana1+kilosManzana2+kilosManzana3+kilosManzana4)*valorKiloManzana);
     
     
     System.out.println("La ganancia bruta total del año por peras y manzanas es "+gananciaBruta);
    }
    
}
