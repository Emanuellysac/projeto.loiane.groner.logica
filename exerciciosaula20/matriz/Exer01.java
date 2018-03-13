/*Gere e imprima uma matriz M 4x4 com valores aleatórios entre 0-9.
Após isso determine o maior número da matriz e a sua posição (linha, coluna). */

package br.com.exerciciosaula20.matriz;

import java.util.Random;

public class Exer01 {

	public static void main(String[] args) {
		
		int[][] numerosAleatorios = new int[4][4];
		
		int maior=Integer.MIN_VALUE;
		int linha=0;
		int coluna=0;
		
		Random numeroRandom = new Random();
				
		for(int i=0; i<numerosAleatorios.length; i++) {
			for(int j=0; j<numerosAleatorios[i].length; j++) {
				numerosAleatorios[i][j]= numeroRandom.nextInt(10);
				
				if(numerosAleatorios[i][j]>maior) {
					maior= numerosAleatorios[i][j];
					linha = i;
					coluna = j;
				}
				System.out.print(numerosAleatorios[i][j] + " ");
			}
				System.out.println();
		}
		
		System.out.println("Maior valor: " + maior + " posição de linha: " + linha + " coluna: " + coluna);
	}

}
