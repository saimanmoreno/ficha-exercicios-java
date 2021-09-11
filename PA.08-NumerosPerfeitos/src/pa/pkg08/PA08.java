package pa.pkg08;

import java.util.Scanner;

/**
 *
 * @author pc
 */
public class PA08 {

    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in);
        int n;
        
        System.out.print("Informe um numero: "); n = ler.nextInt();
        
        System.out.printf("Numeros perfeitos até %d:\n", n);
        for(int i=0; i<=n; i++){
            if(perfeito(i)) System.out.printf("%d\n",i);
        }
        System.out.println("");
    }
    
    public static boolean perfeito(int n){
        int soma=1;
        double raiz = Math.sqrt(n);
        
        for(int i=2 ; i<raiz ; ++i){
            if(n%i==0) soma += i+n/i;
            if(raiz == (int) raiz) soma += (int) raiz;
        }
        
        return n==soma;
    }
    
}
