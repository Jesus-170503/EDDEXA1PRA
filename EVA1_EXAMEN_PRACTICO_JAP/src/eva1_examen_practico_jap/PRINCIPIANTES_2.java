/*
 * Compara 2 arreglos para ver si son iguales o diferentes
 */
package eva1_examen_practico_jap;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Ana Paulina Villegas Treviño
 *         Iran America Chavarria Monge
 *         Jesus Alberto Jacquez Fabela
 */
public class PRINCIPIANTES_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int [] arr1 = new int[10];
        int [] arr2 = new int [10];
        
        System.out.println("Ingresa los 10 valores del primer arreglo" );
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = input.nextInt();
        }
        
        System.out.println("Ingresa los 10 valores del segundo arreglo");
        for (int j = 0; j< arr2.length; j++) {
            arr2[j] = input.nextInt(); 
        }
        
        if (Arrays.equals(arr1, arr2)){ 
            System.out.println("Ambos arreglos son iguales"); 
            
            for (int i = 0; i < arr1.length; i++) {
            System.out.print("[" + arr1[i] + "] ");
            }
             System.out.println("");
             
             for (int j = 0; j< arr2.length; j++) {
             System.out.print("[" + arr2[j] + "] ");
            }
        }else{
            System.out.println("Los arreglos NO son iguales"); 
            
            for (int i = 0; i < arr1.length; i++) {
            System.out.print("[" + arr1[i] + "] ");
            }
            System.out.println("");
            
            for (int j = 0; j< arr2.length; j++) {
            System.out.print("[" + arr2[j] + "] ");
            }
        }
        
    }
    
 
    
    
}
