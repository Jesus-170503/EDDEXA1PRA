/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
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
public class PRINCIPIANTES_6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        
        int [][] matriz = new int [4][4];
        int [] arre1 = new int [4];
        int [] arre2 = new int [4];
        
        
        
        for (int i = 0; i < matriz.length; i++) {
            System.out.println("Digite los valores de la fila numero " + (i+1));
            for (int j = 0; j < matriz[i].length; j++) {
                matriz [i][j] = input.nextInt();
            }
        }
        System.out.println("");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print("[" + matriz[i][j] + "]");
            }
            System.out.println("");
        }
        
        
        //Sumar los valores de cada fila
        for (int i = 0; i < matriz.length; i++) {
            int suma = 0;
            for (int j = 0; j < matriz[i].length ; j++) {
                suma += matriz[i][j]; 
            }
            System.out.print(suma/4 +" ");
            arre1[i] = suma/4;
        }
        
        System.out.println("");
        
         for (int j = 0; j < matriz[0].length; j++) {
            int suma = 0;
            for (int i = 0; i < matriz.length ; i++) {
                suma += matriz[i][j]; 
            }
            System.out.print(suma/4 +" ");
            arre2[j] = suma/4;
        }
         
        System.out.println("");
        System.out.println("digite el numero de fila para comparar el promedio");
        int x = input.nextInt();
        System.out.println("digite el numero de columna para comparar el promedio");
        int y = input.nextInt();
        
        if(arre1[x]==arre2[y]){
        System.out.println("Los promedios son iguales");
        }else{
        System.out.println("Los promedios diferentes");  
        }
        
         
         
         
    }
    
}
