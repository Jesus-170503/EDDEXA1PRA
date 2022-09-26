/*
 *Toma 15 valores el arreglo, solo impl¿rime los pares en las 25 posiciones y no se deben de repetir
 */
package eva1_examen_practico_jap;

/**
 *
 * @author Ana Paulina Villegas Treviño
 *         Iran America Chavarria Monge
 *         Jesus Alberto Jacquez Fabela
 */
public class PRINCIPIANTES_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     
        int [] numeros = new int[15];

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = (int) ((Math.random()*100)+1);
           if(numeros[i]%2==0){
                   numeros[i] = numeros[i]; 
               }else{
              numeros[i]=numeros[i]-1;
           } 
            for (int j = 0; j < i; j++) {
                if(numeros[i]==numeros[j]){
                    i--;
           }
        }
     }
        
       for (int i = 0; i < numeros.length; i++) {
           System.out.print(" " + numeros[i] + " ");
        }

    }
    
}
