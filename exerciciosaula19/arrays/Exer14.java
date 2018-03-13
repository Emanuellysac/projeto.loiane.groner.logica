/*Criar um vetor A com 10 elementos inteiros. Implementar um programa
que defina e escreva a m�dia aritm�tica simples dos elementos �mpares armazenados neste vetor.*/

package br.com.exerciciosaula19.arrays;

import java.util.Scanner;

public class Exer14 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int[] vetorA = new int[10];
		int quantImpar = 0;
		int somaImpar= 0;
		
		for(int i=0; i<vetorA.length; i++) {
			
			System.out.println("Entre com um n�mero da posi��o: "+ i);
			vetorA[i] = scan.nextInt();
			
				if(vetorA[i] % 2 != 0) {
					somaImpar += vetorA[i];
					++quantImpar;
				}	
		}
		
		System.out.print("Vetor A: ");	
		for(int i=0; i<vetorA.length; i++) {
			System.out.print(vetorA[i] + " ");	
		}
		
		System.out.println();
		System.out.println("Soma dos n�meros impares: " + somaImpar);
		System.out.println("M�dia dos n�meros �mpares: " + somaImpar/quantImpar);

	}

}
