
package Aula001;

import java.util.Scanner;


public class ex001 {

 
    public static void main(String[] args) {
        // Linha de coment�rio
        /*
        1 Linha
        2 Linhas
        */
        
        /* A classe scanner � uma classe interna no Java usada 
        para leitura
        */
        int x=0, y=0;
        
       // Criar um objeto da classe Scanner para ler x e y
       Scanner Ler=new Scanner(System.in);
       System.out.print("Digite o 1� n�mero: ");
       x=Ler.nextInt();
       System.out.print("Digite o 2� n�mero: ");
       y=Ler.nextInt();
       System.out.println("A soma dos n�meros �: "+(x+y));
    
    }

}
