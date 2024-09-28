
package programa;
import java.util.Scanner;
public class Programa2 {
 public static void main(String[] args){
     int contador = 0;
        double suma = 0;
        double numero;
        double min = Double.MAX_VALUE;
        double max = Double.MIN_VALUE;
  Scanner lectura = new Scanner (System.in);  
     do {
      System.out.print("Ingresa un número (o un número negativo para salir): ");
       numero = lectura.nextDouble();

            if (numero >= 0) {
                suma += numero;
                contador++;

                if (numero < min) {
                    min = numero;
                }
                
                if (numero > max) {
                    max = numero;
                }
            }
        } while (numero >= 0);

        if (contador > 0) {
            double promedio = suma / contador;
            System.out.println("\nResultados estadísticos:");
            System.out.println("Cantidad de números ingresados: " + contador);
            System.out.println("Suma de los números: " + suma);
            System.out.println("Promedio: " + promedio);
            System.out.println("Valor mínimo: " + min);
            System.out.println("Valor máximo: " + max);
        } else {
            System.out.println("No se ingresaron números válidos.");
        }
 }   
}
