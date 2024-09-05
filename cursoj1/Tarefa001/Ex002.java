
package pkg0816_t01;

import javax.swing.JOptionPane;


public class Ex002 {

 
    public static void main(String[] args) {
      // Solicitar ao utilizador a quantidade de bananas(Kg)
      String InputBananas = JOptionPane.showInputDialog("Qual � a quantidade de bananas (Em Kg)?");
      double quantidadeBananas = Double.parseDouble(InputBananas);
      
      // Solicitar ao utilizador a quantidade de peras(Kg)
      String InputPeras = JOptionPane.showInputDialog("Qual � a quantidade de peras (Em Kg)?");
      double quantidadePeras = Double.parseDouble(InputPeras);
      
      /* PRE�OS 
      Bananas:
        At� 5 Kg: 2,50 ?/Kg
        Acima de 5 Kg: 2,20 ?/Kg

      Peras:
        At� 5 Kg: 1,80 ?/Kg
        Acima de 5 Kg: 1,50 ?/Kg
      
        Se o cliente comprar:
        4 Kg de bananas o pre�o � 2,50 ?/Kg (porque � < 5 Kg)
        6 Kg de peras o pre�o � 1,50 ?/Kg (porque � > 5 Kg)
      */
      
      /* Pre�o por Kg
         ? valor_se_verdadeiro : valor_se_falso, - 
         uma maneira mais curta de escrever uma instru��o if-else
      */
      double precoBananas = (quantidadeBananas <= 5) ? 2.50 : 2.20;
      double precoPeras = (quantidadePeras <= 5) ? 1.80 : 1.50;
      
      // Calcular o custo total por produto
      double totalBananas = quantidadeBananas * precoBananas;
      double totalPeras = quantidadePeras * precoPeras;
      
      // Calcular o total da compra:
      double totalCompra = totalBananas + totalPeras;
      double totalKg = quantidadeBananas + quantidadePeras;
      
      // Verificar se se aplica desconto
      if (totalKg > 8 || totalCompra > 25.00) {
      // Para aplicar um desconto de 10%, o cliente deve pagar 90% do valor.
          totalCompra *= 0.90; // 10% desconto
      }
      
      // Output do total a pagar
      JOptionPane.showMessageDialog(null, "O valor total a pagar �: " + String.format("%.2f", totalCompra) + "Eur");
    }

}
