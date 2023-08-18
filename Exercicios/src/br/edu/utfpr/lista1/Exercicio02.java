package br.edu.utfpr.lista1;

import java.util.Scanner;

public class Exercicio02 {

	/*
	 * 2 - Escreva um programa que calcule o volume de uma caixa.
	 * O usuário deverá usar a classe Scanner, informar os valores;
	 */
	
	public static void main(String[] args) {
		
		Scanner dados = new Scanner(System.in);
		
		System.out.println("Informe o valor da altura da caixa: ");
		float altura = dados.nextFloat();
		
		System.out.println("Informe a largura da caixa: ");
		float largura = dados.nextFloat();
		
		System.out.println("Informe o comprimento da caixa: ");
		float comprimento = dados.nextFloat();
		
		float volume = altura * largura * comprimento;
		
		System.out.println("O volume da caixa eh: " + volume);
	}
}
