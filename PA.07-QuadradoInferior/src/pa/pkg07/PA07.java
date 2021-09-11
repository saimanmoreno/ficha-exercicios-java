package pa.pkg07;

import java.util.Scanner;

/**
 *
 * @author pc
 */
public class PA07 {

    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in);
        int n;
        
        do {            
            System.out.print("Informe um numero: ");
            n = ler.nextInt();
        } while (n<1);
        
        for(int i=n+1;i<(n*n)*3;i++){
            System.out.printf("Quadrado de %d >> %d\n", i, i*i);
        }
    }
}
