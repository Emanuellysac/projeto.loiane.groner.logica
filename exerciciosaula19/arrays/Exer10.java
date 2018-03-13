/*10. Criar um vetor A com 10 elementos inteiros.
Construir um vetor B de mesmo tipo e tamanho, sendo que cada elemento do vetor B dever�
ser o resto da divis�o do respectivo elemento de A por 2 (dois), ou seja: B[i] := A[i] % 2. */

package br.com.exerciciosaula19.arrays;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exer10 {

	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		
		int[] vetorA = new int[10];
		int[] vetorB = new int[vetorA.length];
				
		for(int i=0; i<vetorA.length; i++) {
		
			System.out.println("Entre com o valor da posi��o: " + i);
			vetorA[i] = scan.nextInt();
				
			vetorB[i]= vetorA[i] % 2; //A opera��o de m�dulo sempre retorna um inteiro.
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
		
	}	
	
}

	