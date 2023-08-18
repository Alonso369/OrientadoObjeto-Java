package br.edu.utfpr.lista1;

import javax.swing.JOptionPane;

/*
  * 4 - Escreva um programa que calcule o valor do produto de acordo com a taxa de aumento(%).
  * Solicite ao usuário que informe o valor do produto e a taxa de aumento. E o programa deve
  * retornar o novo valor do produto;  
  */

public class Exercicio04 {

	public static void main(String[] args) {
		
		float valorProduto = Float.parseFloat(JOptionPane.showInputDialog("Informe o valor do produto: "));
		float taxa = Float.parseFloat(JOptionPane.showInputDialog("Informe a taxa de aumento: "));
		
		float aumento = (taxa * valorProduto) / 100;
		
		float valorFinal = aumento + valorProduto;
		
		JOptionPane.showMessageDialog(null, "O valor final do produto é de: " + valorFinal);
	
	}
}
