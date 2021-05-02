package br.com.localizeominimo;

import java.util.Scanner;

/**
 * Programa em Java que localiza o valor mínimo
 * @author Erick Freire
 * @version 1 - Criado em 02-05-2021 as 16:02
 */

public class LocalizeOMinimo {

	public static void main(String[] args) {
		
		double numero1;
		double numero2;
		double numero3;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Programa que localiza o menor valor: ");
		
		System.out.print("Informe o primeiro valor: ");
		numero1 = entrada.nextDouble();
		System.out.print("Informe o segundo valor: ");
		numero2 = entrada.nextDouble();
		System.out.print("Informe o terceiro valor: ");
		numero3 = entrada.nextDouble();
		
		verificaMenorValor(numero1, numero2, numero3);

	}
	
	public static void verificaMenorValor(double n1, double n2, double n3) {
		
		double men = Math.min(n1, Math.min(n2, n3));
		
		System.out.printf("%n%nO menor valor é: %f%n", men);
		
	}

}
