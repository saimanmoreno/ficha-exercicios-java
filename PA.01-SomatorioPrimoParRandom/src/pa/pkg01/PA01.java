package pa.pkg01;

import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Simão Moreno
 */
public class PA01 {

    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in);
        int cont=0, a, n;
        ArrayList <Integer> par = new ArrayList<>();
        ArrayList <Integer> primo = new ArrayList<>();
        
        System.out.print("Introduza um numero positivo:"); n=ler.nextInt();
        
        for(int i=1; i<n; i++){
            cont+=i;
            if(i%2==0) par.add(i);
            if(i>1 && primo(i)) primo.add(i);
        }
        
        a = (int) (0 + Math.random()*n);
        
        System.out.println("\n\nNumero Escolhido: "+n+"\n"
                + "Soma de todos os inteiros menor que "+n+" e maior que 0: "+cont+"\n"
                + "Numeros pares entre 0 e "+n+": "+par+"\n"
                + "Numeros primos entre 0 e "+n+": "+primo+"\n"
                + "Um numero aleatorio: "+a);
    }
    
    public static boolean primo(int n){
        for(int i=2; i<n; i++){
                if(n%i==0) return false;
        }
        return true;
    }
}
