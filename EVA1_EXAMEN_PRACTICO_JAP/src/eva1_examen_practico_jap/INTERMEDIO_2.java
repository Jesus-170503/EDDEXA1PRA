/*
 quitar una posicion de el arreglo

 */
package eva1_examen_practico_jap;


import java.util.Scanner;

/**
 *
 * @author Ana Paulina Villegas Treviño
 *         Iran America Chavarria Monge
 *         Jesus Alberto Jacquez Fabela
 */
public class INTERMEDIO_2 {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        
        int [] numeros = new int[15];
        int [] copia;
        
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = (int) ((Math.random()*100)+1);
        }
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("[" + numeros[i] + "] ");
        }
        System.out.println("");
        
        System.out.println("Ingrese el numero que desea buscar");
        int x = input.nextInt();
        
        for (int i = 0; i < numeros.length; i++) {
            if(numeros[i]==x){ 
              copia = new int[numeros.length - 1]; //cambiar tamaño del arreglo
              
               for(int index = 0; index < i; index++){
                    copia[index] = numeros[index];
                    System.out.print("[" + copia[index] + "] "); // Este imprime las posiciones del numero antes del numero que quitamos hacia la IZQUIERDA
                }
              for(int j = i; j < numeros.length - 1; j++){ // se le resta -1 para "brincar" la posicion de el numero a eliminar
                    copia[j] = numeros[j+1];
                    System.out.print("[" + copia[j] + "] ");  // Este imprime las posiciones del numero apartir del numero que quitamos hacia la DERECHA
                }
            
               }
           }

    } 
}
