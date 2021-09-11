package pa.pkg04;

import java.util.Scanner;
import static javafx.application.Platform.exit;

/**
 *
 * @author Simão Moreno
 */
public class PA04 {

    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in);
        String nome, senha, nomeTeste, senhaTeste; 
        int chances=0, op=0;
        System.out.println("Cadastro de usuario:");
        System.out.print("Usuario: "); nome = ler.next();
        do {            
            System.out.print("Senha: ");senha = ler.next();
        } while (senha.length()>6);
        
        System.out.println("Senha Cadastrada com Sucesso!\n\n");
        
        do {   
            chances++;
            System.out.println("Login:");
            System.out.print("Usuario: ");
            nomeTeste = ler.next();            
            System.out.print("Senha: ");
            senhaTeste = ler.next();
            
            if (nome.equals(nomeTeste) && senha.equals(senhaTeste)) {
                break;
            }else if(chances==3){
                exit();
            }
        } while (true);
        
        System.out.println("\n\nMenu");
        System.out.println("1 - Voltar ao menu principal\n"
                + "2 - Encerrar o programa (Sair)");
        op=ler.nextInt();
        
        switch(op){
            case 2:break;
        }
    }
}
