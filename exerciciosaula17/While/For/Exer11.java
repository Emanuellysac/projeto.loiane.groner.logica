/*Altere o programa anterior para mostrar no final a soma dos n�meros.*/

package br.com.exerciciosaula17.While.For;

import java.util.Scanner;

public class Exer11 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		
		int soma = 0;
		
		System.out.println("Inrforme o primeiro n�mero: ");
		int num1 = scan.nextInt(); 
		System.out.println("Inrforme o segundo n�mero: ");
		int num2 = scan.nextInt(); 
		
			if (num1<num2) {
		
				for (int i=num1; i<num2; i++) {
					System.out.println(i);
					soma += i;
					
				}
			} else if (num1>num2) {
				
				for (int i=num2; i<num1; i++) {
					System.out.println(i);
					soma += i;
				
				}
			}
			
			System.out.println(soma);
		}
	}
