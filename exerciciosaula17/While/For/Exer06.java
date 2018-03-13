/*Faça um programa que imprima na tela os números de 1 a 20, um abaixo do outro.
Depois modifique o programa para que ele mostre os números um ao lado do outro. */

package br.com.exerciciosaula17.While.For;

public class Exer06 {

	public static void main(String[] args) {
		
		
		int cont1 = 1;
		int cont2 = 1;
		
		while (cont1 <= 20 ) {
			System.out.println(cont1);
			cont1++;
		} do {
			System.out.print(cont2 + " ");
			cont2++;	
					
		} while 
			(cont2 <= 20 );
		
		
		System.out.println();
				
		for (int cont3 = 1; cont3 <=20; cont3++) {
			System.out.print(cont3 + " ");
			
		}
		
		
	}

}


