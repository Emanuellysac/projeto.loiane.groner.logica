/*Criar dois vetores A e B cada um com 10 elementos inteiros.
Construir um vetor C, onde cada elemento de C é a soma dos respectivos elementos em A e B, ou seja:
C[i] = A[i] + B[i]. */

package br.com.exerciciosaula19.arrays;

import java.util.Scanner;

public class Exer06 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int[] vetorA = new int[10];
		int[] vetorB = new int[vetorA.length];
		int[] vetorC = new int[vetorA.length];
		
		for(int i=0; i<vetorA.length; i++) {
		
			System.out.println("Entre com o valor da posição: A" + i);
			vetorA[i] = scan.nextInt();
			
			System.out.println("Entre com o valor da posição: B" + i);
			vetorB[i] = scan.nextInt();
			
			//vetorC[i]= vetorA[i] + vetorB[i]; 	
		}
		
		for(int i=0; i<vetorC.length; i++) {
			vetorC[i]= vetorA[i] + vetorB[i]; 
			
		}
		
		System.out.print("Vetor A: ");	
		for(int i=0; i<vetorA.length; i++) {
			System.out.print(vetorA[i] + " ");	
		}
		
		System.out.println();
		System.out.print("Vetor B: ");	
		for(int i=0; i<vetorB.length; i++) {
			System.out.print(vetorB[i] + " ");
		}
		
		System.out.println();
		System.out.print("Vetor C: ");	
		for(int i=0; i<vetorC.length; i++) {
			System.out.print(vetorC[i] + " ");
		
		}
		
	}

}
