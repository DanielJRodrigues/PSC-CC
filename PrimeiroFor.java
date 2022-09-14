package primeiroFor;

/**
 *
 * @author Daniel J Rodrigues
 * Usando o
 *for imprima os números pares de 1 a 50, o contador deve ser
 *inicializado com o valor 1 é incrementado 1 ao contador a cada repetição
 *do bloco de código
 */
public class PrimeiroFor {

    
    public static void main(String[] args) {
        
        for (int n = 1; n <=50; n++) {
            System.out.println(n);
            if (n % 2 == 0 ) {
                System.out.println(n);
            } 
        }
     
   
        
    }
}
    
   