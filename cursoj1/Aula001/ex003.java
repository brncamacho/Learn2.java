
package Aula001;

import javax.swing.JOptionPane;

/*
Solicitar ao utilizador 2 nomes e verificar se são iguais
*/

public class ex003 {

 
    public static void main(String[] args) {
        
        String nome1=JOptionPane.showInputDialog(null, "Digite o 1º nome");
        String nome2=JOptionPane.showInputDialog(null, "Digite o 2º nome");
        
         if(nome1.toUpperCase().equals(nome2.toUpperCase())){
            JOptionPane.showMessageDialog(null, "Os nomes coincidem.", "Nomes", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "Os nomes não coincidem.", "Nomes", JOptionPane.INFORMATION_MESSAGE);
        }
    }
}
