package br.edu.utfpr.lista1;

import java.util.Scanner;

/*
 * Escreva um programa que calcule a média salarial dos funcionários de uma empresa.
 * O usuário deverá informar o número de funcionários e os valores dos salários de cada funcionário.
 * (Utilize a classe Scanner).
 */

public class Exercicio03 {

	public static void main(String[] args)
	{
		
		float salario;
		float aux = 0;
		
		Scanner dados = new Scanner(System.in);
		
		System.out.println("Informe o número de funcionários: ");
		int funcionario = dados.nextInt();
		
		for(int i = 0; i < funcionario; i++) {
			System.out.println("Informe o salario do funcionario " + i + ": ");
			salario = dados.nextFloat();
			aux += salario;
		}
		
		float media = aux / (float) funcionario;
		
		System.out.println("A media salarial dos funcionários é de: R$" + media);
		
	}
	
}
