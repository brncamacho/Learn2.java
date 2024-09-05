
package pkg0816_t01;

import javax.swing.JOptionPane;


public class Ex001 {

 
    public static void main(String[] args) {
       // Solicitar a password
       String password = JOptionPane.showInputDialog("Insira a palavra-passe:");
        
       // Solicitar 2 números do tipo double
       String input1 = JOptionPane.showInputDialog("Insira o primeiro número(com casas decimais):");
       String input2 = JOptionPane.showInputDialog("Insira o segundo número(com casas decimais):"); 
               
       // Converte o input string para double
       double num1 = Double.parseDouble(input1);
       double num2 = Double.parseDouble(input2);
       
       // Faz a divisão
       double result = num1 / num2;
       
       // Confirmar a password
       String confirmPassword = JOptionPane.showInputDialog("Confirme a palavra-passe para obter o resultado:");
       
       // Verifica se a pass está correta
       if (password.equals(confirmPassword)) {
       // Exibe o resultado da divisão
       JOptionPane.showMessageDialog(null, "O resultado da divisão é:" + result);
       } else {
       // Output da mensagem de erro
       JOptionPane.showMessageDialog(null, "A palavra-passe está incorreta!");
       }
    }

}
