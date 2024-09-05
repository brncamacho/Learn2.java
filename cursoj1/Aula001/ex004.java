
package Aula001;

import java.text.DecimalFormat;
import javax.swing.JOptionPane;

/*
Solicitar ao utilizador um valor em polegadas e converter em milimetros
sabendo que 1 pol = 25,4mm.
DecimalFormat;
# - digito opcional
0 - digito obrigat�rio 
*/

public class Ex004 {

 
    public static void main(String[] args) {
                DecimalFormat F = new DecimalFormat("0.00 mm");
        float polegadas = 0;
        try {
            polegadas = Float.parseFloat(JOptionPane.showInputDialog(null, "Digite o valor em polegadas"));
            JOptionPane.showMessageDialog(null, "O valor em mil�metros � " + F.format(polegadas * 25.4), "Polegadas em mil�metros", JOptionPane.INFORMATION_MESSAGE);
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "Deve digitar um n�mero", "ERRO", JOptionPane.ERROR_MESSAGE);
        }
    }

}

