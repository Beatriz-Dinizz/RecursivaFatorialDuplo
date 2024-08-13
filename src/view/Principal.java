package view;

import controller.FatorialDuplo;

public class Principal {

	public static void main(String[] args) {
		FatorialDuplo fatorialDuplo = new FatorialDuplo();
		
		int n = 5;
		
		if(n > 0 && n % 2 != 0) {
			int resultado = fatorialDuplo.calcularFatorialDuplo(n);
			System.out.println("O fatorial duplo de " + n + " é: " + resultado);
		} else {
			System.out.println("Número inválido! O número deve ser inteiro positivo ímpar.");
		}
	}
}
