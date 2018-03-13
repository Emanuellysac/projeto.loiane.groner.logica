/*Criar um vetor A com 10 elementos inteiros. Desenvolver um programa
que defina o percentual de elementos pares e ímpares, respectivamente, armazenados neste vetor. */

package br.com.exerciciosaula19.arrays;

import java.util.Scanner;

public class Exer15 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int[] vetorA = new int[10];
		double par = 0;
		double impar = 0;
		
		for(int i=0; i<vetorA.length; i++) {
			
			System.out.println("Entre com um número da posição: " + i);
			vetorA[i] = scan.nextInt();
			
				if(vetorA[i]%2 == 0) {
					++par;
				}else {
					++impar;
				}	
		}
		
		System.out.print("Vetor A: ");	
		for(int i=0; i<vetorA.length; i++) {
			System.out.print(vetorA[i] + " ");	
		}
		
		System.out.println();
		System.out.println("% dos números pares: " + (par*100)/vetorA.length + " %");
		System.out.println("% dos números ímpares: " + (impar*100)/vetorA.length + " %");

	}

}


