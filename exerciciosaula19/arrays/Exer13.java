/*Criar um vetor A com 10 elementos inteiros. Implementar um programa
que determine a soma dos elementos armazenados neste vetor que são múltiplos de 5. */

package br.com.exerciciosaula19.arrays;

import java.util.Scanner;

public class Exer13 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int[] vetorA = new int[10];
		int soma = 0;
		
		for(int i=0; i<vetorA.length; i++) {
			
			System.out.println("Entre com um número da posição: " + i);
			vetorA[i] = scan.nextInt();
			
				if(vetorA[i]%5 == 0) {
					soma += vetorA[i];
				}	
		}
		
		System.out.print("Vetor A: ");	
		for(int i=0; i<vetorA.length; i++) {
			System.out.print(vetorA[i] + " ");	
		}
		
		System.out.println();
		System.out.println("Soma dos múltiplus de 10: " + soma);
		
	}

}
