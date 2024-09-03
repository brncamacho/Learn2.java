
package Aula001;

import javax.swing.JOptionPane;

/*
showInputDialog - É a caixa de diálogo para a leitura - JOptionPane
showMessageDialog - Usado para escrita
try...catch - 
*/

public class ex002 {

 
    public static void main(String[] args) {
        int x = 0; // Inicializa as variáveis fora dos blocos try
        int y = 0;
        boolean validInput = true;

        try {
            x = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o 1º número"));
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "Deve inserir um número", "Erro", JOptionPane.ERROR_MESSAGE);
            validInput = false; // Marca a entrada como inválida
        }

        try {
            y = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o 2º número"));
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "Deve inserir um número", "Erro", JOptionPane.ERROR_MESSAGE);
            validInput = false; // Marca a entrada como inválida
        }

        if (validInput) {
            JOptionPane.showMessageDialog(null, "A soma é " + (x + y), "Soma de 2 números", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "Não foi possível calcular a soma devido a entrada inválida.", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }
}