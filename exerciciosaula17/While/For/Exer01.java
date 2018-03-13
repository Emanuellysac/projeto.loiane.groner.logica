 /*1. Faça um programa que peça uma nota, entre zero e dez.
Mostre uma mensagem caso o valor seja inválido e continue pedindo até que o usuário informe um valor válido.*/


package br.com.exerciciosaula17.While.For;

import java.util.Scanner;

public class Exer01 {
		
	public static void main(String[] args){
			
		Scanner scan = new Scanner (System.in);
		
		boolean notaValida = false; 
	
		do { 
			System.out.println("Digite a nota: ");
		
			int nota = scan.nextInt();
			
			if (nota >=0 && nota <= 10) {
				notaValida = true;
				System.out.println("Nota registrada com sucesso!");
			}else {
				
				System.out.println("Nota inválida; Digite novamente!");
			}
					
		} while (notaValida == false);
			
	}	

}
