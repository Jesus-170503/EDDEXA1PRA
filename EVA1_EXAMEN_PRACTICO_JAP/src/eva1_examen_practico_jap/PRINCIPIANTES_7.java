/*
 * de un arreglo de 20 posiciones random, imprimir la parte de inicio hasta el final
   que el usuario quiera, y de esa parte ver cuales son pares y esos imprimirlos
 */
package eva1_examen_practico_jap;

import java.util.Scanner;

/**
 *
 * @author Ana Paulina Villegas Treviño
 *         Iran America Chavarria Monge
 *         Jesus Alberto Jacquez Fabela
 */
public class PRINCIPIANTES_7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        
        int [] numeros = new int [20];
        int [] posiciones;
        
        
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = (int) ((Math.random()*20)+1);
        }
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("[" + numeros[i] + "] ");
        }
      
        System.out.println("");
        
        System.out.println("Ingresa la posicion inicial entre las posiciones 0-19");
        int x = input.nextInt();
        
        System.out.println("Ingresa la posicion final entre las posiciones 0-19");
        int y = input.nextInt();
        y=y+1;
        
        int diferencia = 20-y;
        System.out.println("");
        
        int c = 0;
        
        for (int i = x; i < numeros.length-diferencia; i++) {
              if (numeros[i]%2==0) {
                c++;
            }
        }
        posiciones = new int [c];
        
        int a = 0;
        for (int i = x; i < numeros.length-diferencia; i++) {
              if (numeros[i]%2==0) {
                posiciones[a]=numeros[i];
                  System.out.print("[" + posiciones[a] + "] ");
            }
        }
       
    }
    
}
