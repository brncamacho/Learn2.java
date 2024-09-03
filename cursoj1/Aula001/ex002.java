
package Aula001;

import javax.swing.JOptionPane;

/*
showInputDialog - � a caixa de di�logo para a leitura - JOptionPane
showMessageDialog - Usado para escrita
try...catch - 
*/

public class ex002 {

 
    public static void main(String[] args) {
        int x = 0; // Inicializa as vari�veis fora dos blocos try
        int y = 0;
        boolean validInput = true;

        try {
            x = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o 1� n�mero"));
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "Deve inserir um n�mero", "Erro", JOptionPane.ERROR_MESSAGE);
            validInput = false; // Marca a entrada como inv�lida
        }

        try {
            y = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o 2� n�mero"));
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "Deve inserir um n�mero", "Erro", JOptionPane.ERROR_MESSAGE);
            validInput = false; // Marca a entrada como inv�lida
        }

        if (validInput) {
            JOptionPane.showMessageDialog(null, "A soma � " + (x + y), "Soma de 2 n�meros", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "N�o foi poss�vel calcular a soma devido a entrada inv�lida.", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }
}