//Fa�a um programa que calcule o fatorial de um n�mero inteiro fornecido pelo usu�rio. Ex.: 5!=5.4.3.2.1=120

package br.com.exerciciosaula17.While.For;

import java.util.Scanner;

public class Exer17Fatorial {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Digite um n�mero:");
		int num = scan.nextInt();
		
		int fatorial = 1;
			
		for (int i=num; i>0; i--) {
			fatorial *= i;	
			
			System.out.println(i + " * " );
		}
		
			System.out.println("Resultado " + fatorial);
		
	}

}
