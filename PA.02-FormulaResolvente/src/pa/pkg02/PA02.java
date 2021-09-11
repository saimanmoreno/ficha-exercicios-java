package pa.pkg02;

import static java.lang.Math.sqrt;
import java.util.Scanner;

/**
 *
 * @author Simão Moreno
 */
public class PA02 {

    public static void main(String[] args) {
        
        Scanner ler = new Scanner (System.in);
        int a, b, c;
        double x1, x2, delta;
        System.out.print("Introduza o coeficiente ax^2 >> ");a = ler.nextInt();
        System.out.print("Introduza o coeficiente bx >> ");b = ler.nextInt();
        System.out.print("Introduza o coeficiente c >> ");c = ler.nextInt();
        
        delta = b*b+4*a*c;
        
        if (delta>0){
            System.out.println("\n\nEquação: "+a+"x^2 + "+b+"x + "+c);
            System.out.println("Delta = "+delta);
            x1 = (double) (-b + sqrt(delta))/ 2*a;
            x2 = (double) (-b - sqrt(delta))/ 2*a;
            System.out.printf("As raizes são x1 = %.2f e x2 = %.2f\n\n", x1, x2);
        }else if(delta == 0){
            System.out.println("\n\nEquação: "+a+"x^2 + "+b+"x + "+c);
            x1 = (double) (-b + sqrt(delta))/ 2*a;
            System.out.println("Delta = 0");
            System.out.printf("A raiz é x1 = %.2f\n\n", x1);
        }else{
            System.out.println("\n\nEquação: "+a+"x^2 + "+b+"x + "+c);
            System.out.println("\n\nImpossivel em R\n\n");
            
        }
    }
}

