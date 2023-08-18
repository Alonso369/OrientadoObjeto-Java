package br.edu.utfpr.lista1;

import javax.swing.JOptionPane;

/*
 * Escreva um programa que calcule o índice de massa corpórea(IMC) de uma pessoa.(Utilize a classe
 * JOptionPane).
 */

public class Exercicio05 {

	public static void mian(String[] args) {
		
		float altura = Float.parseFloat(JOptionPane.showInputDialog("Informe o a sua altura: "));
		float peso = Float.parseFloat(JOptionPane.showInputDialog("Informe o seu peso: "));
		
		float imc = peso / (altura / altura);
		
		
		if(imc < 20) {
			JOptionPane.showMessageDialog(null, "Altura: " + altura + "\n" + "Peso: " + peso + "\n" + "Resulado do IMC: " + imc + "\n" + "Usuário: Magro");
		}
		else if(imc > 20 && imc < 24) {
			JOptionPane.showMessageDialog(null, "Altura: " + altura + "\n" + "Peso: " + peso + "\n" + "Resulado do IMC: " + imc + "\n" + "Usuário: Normal");
		}
		else if(imc > 24 && imc < 29){
			JOptionPane.showMessageDialog(null, "Altura: " + altura + "\n" + "Peso: " + peso + "\n" + "Resulado do IMC: " + imc + "\n" + "Usuário: Acima do peso");
		}
		else if(imc > 29 && imc < 34) {
			JOptionPane.showMessageDialog(null, "Altura: " + altura + "\n" + "Peso: " + peso + "\n" + "Resulado do IMC: " + imc + "\n" + "Usuário: Obeso");
		}
		else {
			JOptionPane.showMessageDialog(null, "Altura: " + altura + "\n" + "Peso: " + peso + "\n" + "Resulado do IMC: " + imc + "\n" + "Usuário: Muito Obeso");
		}
	}
}
