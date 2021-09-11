package pa.pkg06;

import java.util.Scanner;

/**
 *
 * @author Simão Moreno
 */
public class PA06 {

    //Algoritmo de Euclides iterativo para calcular MDC
    public static int mdc(int a, int b){        
        while(b != 0){
            int r = a % b;
            a = b;
            b = r;
        }
        return a;
    }
    
    //Calcula o MDC de uma lista de números
    public static int mdcLista(int[] numberList){
        if(numberList.length < 2){
            throw new IllegalArgumentException("A lista deve conter pelo 2 numeros");
        }
        int mdcResultado = numberList[0];
        for(int i = 1; i < numberList.length; i++){
            mdcResultado = mdc(mdcResultado, numberList[i]);
        }
        return mdcResultado;
    }
    
    //código de testes
    public static void main(String[] args) {
        
        Scanner ler = new Scanner (System.in);
        int []v; int n;
        System.out.print("Introduza a qtidade de numeros a ser introduzidos >> ");n = ler.nextInt();
        v = new int[n];
        for(int i=0;i<n;i++){
            System.out.print("Introduza o "+(i+1)+"º numero >> ");v[i]=ler.nextInt();
        }
        
        System.out.print("\n\nNumeros Escolhidos:");
        for(int i=0;i<n;i++){
            System.out.print(" "+v[i]);
            if(i!=(n-1)){
                System.out.print(", ");
            }
        }
        System.out.println("\n\nMDC entre os numeros introduzidos = " + mdcLista(v));
    } 
    
}
