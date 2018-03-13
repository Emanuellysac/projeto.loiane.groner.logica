/*15. A s�rie de Fibonacci � formada pela sequ�ncia 1,1,2,3,5,8,13,21,34,55,... Fa�a um programa capaz de gerar a s�rie at� o n-�simo termo. */

package br.com.exerciciosaula17.While.For;

import java.util.Scanner;

public class Exer15Fibonacci {

	public static void main(String[] args) {

		Scanner scan = new Scanner (System.in);
		
		System.out.println("Entre com o n-�simo termo da s�rie fibonacci:");
		int n = scan.nextInt();
	
		int primeiro = 1;
		int segundo = 1;
		int proximo;
		
		System.out.println(primeiro);
		System.out.println(segundo);
		
		for (int i=3; i<=n; i++) {
			
			proximo = primeiro + segundo;
			primeiro = segundo;
			segundo = proximo;
			
			System.out.println(proximo);
		}
		
	}
	
}


