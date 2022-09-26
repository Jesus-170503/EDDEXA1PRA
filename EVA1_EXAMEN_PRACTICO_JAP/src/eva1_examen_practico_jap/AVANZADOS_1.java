/*
 * Realizar el juego de el ahorcado con un arreglo multidimensional de caracteres,
 * de los cuales sean al menos 5 palabras las que esten en el juego
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
public class AVANZADOS_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
    Scanner input = new Scanner(System.in);
        
        char [][] letras =
        {{'p', 'a', 'n'},
        {'c', 'h', 'i', 'c', 'l', 'e'},
        {'c', 'a', 'j', 'a'},
        {'m', 'e', 'n', 't', 'a'},
        {'l', 'a', 'm', 'p', 'a', 'r', 'a'}};
       
        int intentosT = 0, a = 0, x = 0, vidas = 0; 
        String res = "", acumuladas = "";
        char letra = ' '; 

        do{
            
            System.out.println("****************************");
            System.out.println("********* AHORCADO *********");
            System.out.println("****************************");
            
            while(intentosT <= 4){
                int m = (int) (Math.random() * 4); 
                acumuladas += res; 
                System.out.println(m); 
                char[] palabra = letras[m]; 
                for(int i = 0; i < palabra.length; i++){ 
                    System.out.print("[]");
                }
                System.out.println("\n¿Sabes cual es la palabra?: \nSi, oprime 1  No, oprime 0");
                x = input.nextInt(); 

                switch (x){ 
                    case 1:
                        System.out.print("Escribe por favor la palabra completa\n ");
                        res = input.next(); 
                       
                        if(Arrays.equals(palabra, res.toCharArray())) { 
                           System.out.println("****************************");
                           System.out.println("********** YOU WON *********");
                           System.out.println("****************************");
                        }else{ 
                           System.out.println("****************************");
                           System.out.println("********* GAME OVER ********");
                           System.out.println("****************************");
                            break;
                        }
                        break;

                    case 0: 
                        do{
                            System.out.print("¿Que letra crees que valla?: ");
                            res = input.next(); 
                            letra = res.charAt(0);  
                           
                            for(int i = 0; i < palabra.length; i++){
                                if(palabra[i] == letra){ 
                                    System.out.print("[" + letra + "]"); 
                                }else{
                                    System.out.print("[]"); 
                                }
                            }
                           
                            
                            if(acumuladas.toCharArray().equals(Arrays.toString(palabra))) { 
                                System.out.println("\nAdivinaste la palabra");
                            }else if(Arrays.toString(palabra).contains(res)){ 
                                System.out.println(acumuladas);
                            }else{ 
                                System.out.println("\nEsa letra no se encuentra");
                                intentosT++; 
                                vidas = 4 - intentosT; 
                                System.out.println("Te quedan " + (vidas) + " oportunidades aun por jugar");
                            }
                        }while(vidas > 0); 
                        break;
                    default:
                        System.out.println("Oprime por favor 1 y 0");
                        break;
                }
            }

            System.out.println("¿Quieres seguir jugando? \n1.Si   0.No");
            a=input.nextInt(); 
        }while(a > 0); 
        
        
    }
}
