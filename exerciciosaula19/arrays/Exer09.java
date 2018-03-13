/*Criar dois vetores A e B cada um com 10 elementos inteiros.
Construir um vetor C, onde cada elemento de C é a divisão dos respectivos
elementos em A e B, ou seja: C[i] = A[i] / float(B[i]). */

package br.com.exerciciosaula19.arrays;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exer09 {

		public static void main(String[] args) {
			
			Scanner scan = new Scanner(System.in);
			
			int[] vetorA = new int[10];
			double[] vetorB = new double[vetorA.length];
			double[] vetorC = new double[vetorA.length];
			
			for(int i=0; i<vetorA.length; i++) {
			
				System.out.println("Entre com o valor da posição: A" + i);
				vetorA[i] = scan.nextInt();
				
				System.out.println("Entre com o valor da posição: B" + i);
				vetorB[i] = scan.nextInt();
				
				vetorC[i]= vetorA[i] / vetorB[i]; 	
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
			
			DecimalFormat df = new DecimalFormat("###,###.##");
			
			System.out.println();
			System.out.print("Vetor C: ");	
			for(int i=0; i<vetorC.length; i++) {
				System.out.print(df.format(vetorC[i]) + " ");
			
			}	
		}
	}