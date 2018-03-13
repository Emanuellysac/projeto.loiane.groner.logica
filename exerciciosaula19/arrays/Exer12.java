/*Criar um vetor A com 10 elementos inteiros. Implementar um programa
que defina e escreva a soma de todos os elementos armazenados neste vetor. */

package br.com.exerciciosaula19.arrays;

import java.util.Scanner;

public class Exer12 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
	
			int[] vetorA = new int[10];
			
			int soma = 0;
			
			for(int i=0; i<vetorA.length; i++) {
				
				System.out.println("Informe um número: ");
				vetorA[i] = scan.nextInt();
			}
			
			for(int i=0; i<vetorA.length; i++) {
				
				soma += vetorA[i]; 
			}
			
			System.out.print("Vetor A: ");	
			for(int i=0; i<vetorA.length; i++) {
				System.out.print(vetorA[i] + " ");	
			}
			
			System.out.println();
			System.out.println("Soma: " + soma);
			
	}

}
