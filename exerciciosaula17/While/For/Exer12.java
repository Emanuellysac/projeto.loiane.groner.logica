/*Desenvolva um gerador de tabuada, capaz de gerar a tabuada de qualquer número inteiro entre 1 a 10. 
O usuário deve informar de qual numero ele deseja ver a tabuada. */

package br.com.exerciciosaula17.While.For;

import java.util.Scanner;

public class Exer12 {

	public static void main(String[] args) {
		
	Scanner scan = new Scanner(System.in);
	
	System.out.println("Informe o número para a tabuada: ");
	int num = scan.nextInt();
	
	System.out.println("Tabuada de: " + num);
	
		for (int i = 1; i<=10; i++) {
			System.out.println(num + " x " + i + "= " + (num * i));
	
		}	
		
	}

}
