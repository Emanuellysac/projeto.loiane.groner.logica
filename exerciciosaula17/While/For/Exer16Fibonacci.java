//A s�rie de Fibonacci � formada pela seq��ncia 0,1,1,2,3,5,8,13,21,34,55,...
//Fa�a um programa que gere a s�rie at� que o valor seja maior que 500.

package br.com.exerciciosaula17.While.For;

public class Exer16Fibonacci {

	public static void main(String[] args) {
		
		int primeiro = 1;
		int segundo = 1;
		int proximo = 0;
		
		System.out.println(primeiro);
		System.out.println(segundo);
		
		while (proximo <= 500) {
			
			proximo = primeiro + segundo;
			primeiro = segundo;
			segundo = proximo;
			
			System.out.println(proximo);
		}
		
	}
	
}




	


