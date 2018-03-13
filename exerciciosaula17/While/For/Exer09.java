/*Faça um programa que imprima na tela apenas os números ímpares entre 1 e 50. */

package br.com.exerciciosaula17.While.For;

public class Exer09 {

	public static void main(String[] args) {
		
		for (int cont = 1; cont <= 50; cont++) {
			
			if (cont % 2 != 0) {
				
				System.out.println(cont);
				
			}
					
			
		}

	}

}
