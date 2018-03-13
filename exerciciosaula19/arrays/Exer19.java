/*Ler as duas notas bimestrais para um conjunto de 10 alunos. Armazenar as notas informadas em dois vetores “Nota1” e “Nota2” do
tipo real. Escreva um programa que calcule a média aritmética simples das notas informadas armazenando o resultado em um vetor “Result”
de mesmo tipo e tamanho. Ao mostrar os resultados exibir a situação de cada aluno. Se a média calculada for superior ou igual a 7 o aluno
estará “aprovado”, caso contrário, a situação do aluno será “reprovado”. */

package br.com.exerciciosaula19.arrays;

import java.util.Scanner;

public class Exer19 {

	public static void main(String[] args) {
	
		double[] notas1 = new double[10];
		double[] notas2 = new double[notas1.length];
		double[] result = new double[notas1.length];
		
		Scanner sacn = new Scanner(System.in);
		
		for(int i=0; i<notas1.length; i++) {
			System.out.println("Entre com a nota 1 do " + (1+i) + " º aluno:");
			notas1[i] = sacn.nextInt();
			
			System.out.println("Entre com a nota 2 do " + (1+i) + " º aluno:");
			notas2[i] = sacn.nextInt();
			
			result[i] = (notas1[i] + notas2[i]) /2;
		}
		
		System.out.println();
		System.out.println("Notas: ");	
		for(int i=0; i<notas1.length; i++) {
			
		
				
					if(result[i] >= 7) {
						System.out.println((i+1) + "º " + "aluno: " + notas1[i] + " , " + notas2[i] + " Média: " + result[i]);
						System.out.println("Aluno aprovado!");
				
					}else {
						System.out.println((i+1) + "º " + "aluno: " + notas1[i] + " , " + notas2[i] + " Média: " + result[i]);
						System.out.println("Aluno reprovado!");
						
			}	
		
		}
	}
}
