 /*Altere o programa anterior permitindo ao usu�rio informar as popula��es e as taxas de crescimento iniciais.
Valide a entrada e permita repetir a opera��o. */


package br.com.exerciciosaula17.While.For;

import java.util.Scanner;

public class Exer05 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		double popA, popB, taxaA, taxaB;
		
		boolean infValido = false;
						
		do {
			System.out.println("Inrforme a popula��o de 'A': ");
			popA = scan.nextDouble();  
				if (popA > 0) {
					infValido = true;	
				} else {
					System.out.println("Popula��o inv�lida! Valor precisa ser maior que zero.");	
				} 						
		} while (infValido = false);
		
		
		infValido = false;
		do {
			System.out.println("Inrforme a taxa de crescimento de 'A': ");
			taxaA = scan.nextDouble();  
				if (taxaA > 0) {
					infValido = true;	
				} else {
					System.out.println("Taxa inv�lida! Valor precisa ser maior que zero.");
				}	
		} while (infValido = false);	
		
		
		infValido = false;
		do {
			System.out.println("Inrforme a popula��o de 'B': ");
			popB = scan.nextDouble();  
				if (popB > 0) {
					infValido = true;	
				} else {
					System.out.println("Popula��o inv�lida! Valor precisa ser maior que zero.");	
				} 						
		} while (infValido = false);
		
		
		infValido = false;
		do {
			System.out.println("Inrforme a taxa de crescimento de 'B': ");
			taxaB = scan.nextDouble();  
				if (taxaB > 0) {
					infValido = true;	
				} else {
					System.out.println("Popula��o inv�lida! Valor precisa ser maior que zero.");	
				} 						
		} while (infValido = false);
		
		int cont = 0;
		
		while 
			(popA < popB) {
			
				popA += (popA/100)* taxaA;
				popB += (popB/100)* taxaB;	
				cont++;

			
		}
					
			System.out.println("Popula��o de 'A': " + popA);
			System.out.println("Popula��o de 'B': " + popB);
			System.out.println("Quantidade de anos: " + cont);
			
				
		}
			
	}


