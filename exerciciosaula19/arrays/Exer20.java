/*20. Implementar um programa que obtenha a cota��o do d�lar (U$) em rela��o ao real (R$) e a seguir armazene em vetor A com 20
elementos as seguintes convers�es:
21. A[i] = cota��o do dolar * i, para todo i variando de 1 at� 20. */

package br.com.exerciciosaula19.arrays;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exer20 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		DecimalFormat df = new DecimalFormat("###,###.##");
				
		double[] vetorA = new double[20];
		double cotacao = 0;
		
		System.out.println("Entre com a cota��o do d�lar: ");
		cotacao = scan.nextDouble();
		
		for(int i=0; i<vetorA.length; i++) {
			vetorA[i] = cotacao * (i+1);
		}
		
		System.out.println("Vetor A: ");	
		for(int i=0; i<vetorA.length; i++) {
			System.out.println(df.format(vetorA[i]) + " ");
			
			
		}
	
	}

}
