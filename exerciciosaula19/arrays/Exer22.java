/*Gerar aleatoriamente um vetor A com 10 elementos inteiros e iguais a 0 e 1,
sugestão: A[i] = (int)Math.round(Math.random() * 1); Pede-se para implementar um programa que determine o percentual de
números 0's e 1's existentes no vetor A. */

package br.com.exerciciosaula19.arrays;

public class Exer22 {

	public static void main(String[] args) {
		
		int[] vetorA = new int[10];
		int num0 = 0;
		int num1 = 0;
		
			for(int i=0; i<vetorA.length; i++) {
				vetorA[i] = (int)Math.round(Math.random() * 1);
					if(vetorA[i] == 0) {
						++num0;	
					}else {
						++num1;
					}
					System.out.println(vetorA[i]);
			}
			
			System.out.println("Zeros: " + num0);
			System.out.println("Ums: " + num1);
			System.out.println("% de Zeros: " + (num0*100)/10 );
			System.out.println("% de Ums: " + (num1*100)/10 );
			
	}
}
