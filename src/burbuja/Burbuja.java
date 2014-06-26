
package burbuja;

/**
 *
 * @author Pablo
 */
public class Burbuja {

  
    public static void main(String[] args) {
       
       
    }
    
     public static int[] ordenar(int arreglo[]){
        for(int i = 0; i< arreglo.length;i++){
            for(int j = 1+1;j<arreglo.length;j++){
                if(arreglo[i]> arreglo[j]){
                    int aux = arreglo[i];
                    arreglo[i] = arreglo[j];
                    arreglo[j] = aux;
                    
                }
            }
        }
        return arreglo;
        }
    /**
 *
 * Esto es una prueba de modificacion 
 * de comentarios
 */
}
