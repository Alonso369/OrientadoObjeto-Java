package br.edu.utfpr.lista1;

import java.util.Scanner;

public class Exercicio01 {

	/*Escreva um programa que calcule os números pares situados na faixa de dois valores infomrados
	 * pelo usuário. (UTILIZE A CLASSE SCANNER*/

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Informe um numero inicial: ");
		int num1 = ler.nextInt();
		
		System.out.println("Informe um numero final: ");
		int num2 = ler.nextInt();
		
		for(int i = 0; i <= num2; i++) {
			if(i % 2 == 0) {
				System.out.println(i);
			}
		}
	}
}
