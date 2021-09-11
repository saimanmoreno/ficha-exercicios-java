package pa.pkg05;

import java.util.Scanner;

/**
 *
 * @author pc
 */
public class PA05 {

    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in);
        int n, a;
        
        do {            
            System.out.print("Informe um numero: ");
            n = ler.nextInt();
            
            a = (int) (0 + Math.random() * n);
            if (a > 1 && primo(a)) {
                System.out.println("Numero Primo Aleatorio: " + a);
            } else {
                System.out.println("Numero não Primo Aleatorio: " + a);
                System.out.println("Informe um outro numero!");
            }
        } while (!primo(a));
    }
    
    public static boolean primo(int n){
        for(int i=2; i<n; i++){
                if(n%i==0) return false;
        }
        return true;
    }
    
}
