/*Fa�a um programa que receba dois n�meros inteiros e gere os n�meros inteiros que est�o no intervalo compreendido por eles. */


package br.com.exerciciosaula17.While.For;

import java.util.Scanner;

public class Exer10 {

	public static void main(String[] args) {
		
	Scanner scan = new Scanner (System.in);
	
	System.out.println("Inrforme o primeiro n�mero: ");
	int num1 = scan.nextInt(); 
	System.out.println("Inrforme o segundo n�mero: ");
	int num2 = scan.nextInt(); 
	
		if (num1<num2) {
	
			for (int i=num1; i<num2; i++) {
				System.out.println(i);
				
			}
		} else if (num1>num2) {
			
			for (int i=num2; i<num1; i++) {
				System.out.println(i);
			
			}
			 
		}
		 
	}
	
}



