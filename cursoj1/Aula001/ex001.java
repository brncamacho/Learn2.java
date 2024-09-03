
package Aula001;

import java.util.Scanner;


public class ex001 {

 
    public static void main(String[] args) {
        // Linha de comentário
        /*
        1 Linha
        2 Linhas
        */
        
        /* A classe scanner é uma classe interna no Java usada 
        para leitura
        */
        int x=0, y=0;
        
       // Criar um objeto da classe Scanner para ler x e y
       Scanner Ler=new Scanner(System.in);
       System.out.print("Digite o 1º número: ");
       x=Ler.nextInt();
       System.out.print("Digite o 2º número: ");
       y=Ler.nextInt();
       System.out.println("A soma dos números é: "+(x+y));
    
    }

}
