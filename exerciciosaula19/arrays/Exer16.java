/*Criar um vetor A com 10 elementos inteiros. Escrever um programa que calcule e escreva:
a) a soma de elementos armazenados neste vetor que s�o inferiores a 15;
b) a quantidade de elementos armazenados no vetor que s�o iguais a 15;
c) a m�dia dos elementos armazenados no vetor que s�o superiores a 15. */

package br.com.exerciciosaula19.arrays;

import java.util.Scanner;

public class Exer16 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int somaInf15= 0;
		int quantIgual15= 0;
		int somaSup15 = 0;
		int quantMaior15 = 0;
				
		int[] vetorA = new int[10];
		
		for(int i=0; i<vetorA.length; i++) {
			System.out.println("Entre com o n�mero da posi��o: " + i);
			vetorA[i] = scan.nextInt();
			
				if(vetorA[i]< 15) {
					somaInf15 += vetorA[i];
					}
				if(vetorA[i]== 15) {
					++quantIgual15;
				}
				if(vetorA[i]>15) {
					somaSup15 += vetorA[i];
					++quantMaior15;
				}
		}
		
		System.out.print("Vetor A: ");	
		for(int i=0; i<vetorA.length; i++) {
			System.out.print(vetorA[i] + " ");	
		}
		
		System.out.println();
		System.out.println("Soma dos elementos inferiores a 15: " + somaInf15);
		System.out.println("Quantidade dos elementos iguais a 15: " + quantIgual15);
		System.out.println("M�dia dos elementos superiores a 15: " + somaSup15/quantMaior15);
		
	}

}
