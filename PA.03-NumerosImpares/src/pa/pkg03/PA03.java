package pa.pkg03;

import java.util.Scanner;

/**
 *
 * @author Simão Moreno
 */
public class PA03 {

    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in);
        
        int n;
        
        System.out.print("Introduza um numero inteiro: "); n=ler.nextInt();
        
        if(n>=0){
            System.out.println("\n\nNumeros Impares de "+n+" a "+n*2+" :");
            for(int i=n; i<2*n; i++){
                if(i%2!=0) System.out.print(i + ",");
            }
        }else{
            System.out.println("Numeros Impares de "+n*2+" a "+n+" :");
            for(int i=2*n; i<n; i++){
                if(i%2!=0) System.out.print(i + ",");
            }
        }
        System.out.println("\n\n");
    } 
}
