
package Aula001;

import javax.swing.JOptionPane;

/*
Solicitar ao utilizador 2 nomes e verificar se s�o iguais
*/

public class ex003 {

 
    public static void main(String[] args) {
        
        String nome1=JOptionPane.showInputDialog(null, "Digite o 1� nome");
        String nome2=JOptionPane.showInputDialog(null, "Digite o 2� nome");
        
         if(nome1.toUpperCase().equals(nome2.toUpperCase())){
            JOptionPane.showMessageDialog(null, "Os nomes coincidem.", "Nomes", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "Os nomes n�o coincidem.", "Nomes", JOptionPane.INFORMATION_MESSAGE);
        }
    }
}
