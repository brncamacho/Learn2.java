
package pkg0816_t01;

import javax.swing.JOptionPane;


public class Ex001 {

 
    public static void main(String[] args) {
       // Solicitar a password
       String password = JOptionPane.showInputDialog("Insira a palavra-passe:");
        
       // Solicitar 2 n�meros do tipo double
       String input1 = JOptionPane.showInputDialog("Insira o primeiro n�mero(com casas decimais):");
       String input2 = JOptionPane.showInputDialog("Insira o segundo n�mero(com casas decimais):"); 
               
       // Converte o input string para double
       double num1 = Double.parseDouble(input1);
       double num2 = Double.parseDouble(input2);
       
       // Faz a divis�o
       double result = num1 / num2;
       
       // Confirmar a password
       String confirmPassword = JOptionPane.showInputDialog("Confirme a palavra-passe para obter o resultado:");
       
       // Verifica se a pass est� correta
       if (password.equals(confirmPassword)) {
       // Exibe o resultado da divis�o
       JOptionPane.showMessageDialog(null, "O resultado da divis�o �:" + result);
       } else {
       // Output da mensagem de erro
       JOptionPane.showMessageDialog(null, "A palavra-passe est� incorreta!");
       }
    }

}
