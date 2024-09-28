
package programa;
import java.util.Scanner;
public class Programa1 {
 public static void main(String[] args){
  Scanner lectura = new Scanner (System.in);  
int x;

       
        do {
            System.out.print("Ingresa un número (ingresa un número negativo para salir): ");
            x = lectura.nextInt();  

            if (x >= 0) {
                System.out.println("Resultado: " + (x * 10));  // Muestra el resultado de la multiplicación
            }
        } while (x >= 0);  

        System.out.println("Programa finalizado.");
       
    }
    
}
