 /*1. Fa�a um programa que pe�a uma nota, entre zero e dez.
Mostre uma mensagem caso o valor seja inv�lido e continue pedindo at� que o usu�rio informe um valor v�lido.*/


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
				
				System.out.println("Nota inv�lida; Digite novamente!");
			}
					
		} while (notaValida == false);
			
	}	

}
