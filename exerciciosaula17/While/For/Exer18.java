//Fa�a um programa que pe�a um n�mero inteiro e determine se ele � ou n�o um n�mero primo.
//Um n�mero primo � aquele que � divis�vel somente por ele mesmo e por 1.

package br.com.exerciciosaula17.While.For;

import java.util.Scanner;

public class Exer18 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe um n�mero: ");
		int num = scan.nextInt();
		
		boolean primo = true;
		
			for (int i=2; i<num; i++) {
				if (num % i == 0) {
			
				System.out.println("N�o � primo! - divis�vel por: " + i);
				primo = false;	
				//break;
			}
		}	
			if (primo) {
					System.out.println("� primo!");	
					
			}
		}
	}

