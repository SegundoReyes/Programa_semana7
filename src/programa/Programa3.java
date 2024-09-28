
package programa;
import java.util.Scanner;
public class Programa3 {
 public static void main(String[] args){
    int numeroInicio;
        int numeroFin;    
  Scanner lectura = new Scanner (System.in);  
             
        System.out.print("Ingresa el número inicial del rango: ");
        numeroInicio = lectura.nextInt(); 
      
        System.out.print("Ingresa el número final del rango: ");
        numeroFin = lectura.nextInt();       
        int contadorMultiplos = 0;       
        int numeroActual = numeroInicio; 
        System.out.println("\nNúmeros múltiplos de 3 entre " + numeroInicio + " y " + numeroFin + ":");
     
        do {
           
            if (numeroActual % 3 == 0) {
                
                System.out.println(numeroActual);
                
                contadorMultiplos++;
            }
           
            numeroActual++;
        } while (numeroActual <= numeroFin); 
        System.out.println("\nCantidad total de múltiplos de 3: " + contadorMultiplos);

     
      
       
}
}