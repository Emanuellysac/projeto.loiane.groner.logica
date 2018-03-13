/*11. Criar um vetor A com 10 elementos inteiros. Implementar um programa
que defina e escreva a quantidade de elementos armazenados neste vetor que são pares. */

package br.com.exerciciosaula19.arrays;

import java.util.Scanner;

public class Exer11 {

	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		
		int[] vetorA = new int[10];
		
		int par= 0;
		
		for(int i=0; i<vetorA.length; i++ ) {
			
			System.out.println("Escreva um número: ");
			vetorA[i] = scan.nextInt();
			
				if(vetorA[i]%2 == 0) {
					par = ++par;
					
					System.out.println("Par: " + vetorA[i]);
					
				}			
		}
		
		System.out.print("Vetor A: ");	
		for(int i=0; i<vetorA.length; i++) {
			System.out.print(vetorA[i] + " ");	
		}
		
		System.out.println();
		System.out.println("Quantidade de números pares: " + par);

	}

}
