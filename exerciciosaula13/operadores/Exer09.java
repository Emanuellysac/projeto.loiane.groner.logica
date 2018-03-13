//Faça um Programa que peça a temperatura em graus Farenheit, transforme e mostre a temperatura em graus Celsius. o C = (5 * (F-32) / 9).

package br.com.exerciciosaula13.operadores;

import java.util.Scanner;

public class Exer09 {

	public static void main(String[] args) {
		
		  Scanner scan = new Scanner(System.in);

	        System.out.println("Entre com a temperatura em Farenheit:");
	        double f = scan.nextDouble();

	        double c = (5 * (f-32) / 9);
	        System.out.println("A temperatura " + f + " F é igual a " + c + " C");

	}

}
