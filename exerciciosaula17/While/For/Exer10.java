/*Faça um programa que receba dois números inteiros e gere os números inteiros que estão no intervalo compreendido por eles. */


package br.com.exerciciosaula17.While.For;

import java.util.Scanner;

public class Exer10 {

	public static void main(String[] args) {
		
	Scanner scan = new Scanner (System.in);
	
	System.out.println("Inrforme o primeiro número: ");
	int num1 = scan.nextInt(); 
	System.out.println("Inrforme o segundo número: ");
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



