/*Fa�a um programa que leia e valide as seguintes informa��es:
a. Nome: maior que 3 caracteres;
b. Idade: entre 0 e 150;
c. Sal�rio: maior que zero;
d. Sexo: 'f' ou 'm';
e. Estado Civil: 's', 'c', 'v', 'd';*/

package br.com.exerciciosaula17.While.For;

import java.util.Scanner;

public class Exer03 {

	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		
		boolean infoValida = false;
		
		String nome, sexo, estadoCivil;
		int idade;
		double salario;
		 
		do {
			System.out.println("Informe o nome: ");
			nome = scan.next();
				if (nome.length() > 3) {
					infoValida = true;
				} else {
						System.out.println("Nome inv�lido! O nome precisa ter mais de tr�s caracteres.");
						}
		} while (!infoValida);
		
		
		infoValida = false;
		do {
			System.out.println("Digite a idade: ");
			idade = scan.nextInt();
				if (idade >= 0 && idade <= 150) {
					infoValida = true;
				} else {
						System.out.println("Idade inv�lida! Idade precisa estar entre 0 e 150.");
						}
		} while (!infoValida);
		
		
		infoValida = false;
		do {
			System.out.println("Digite o sal�rio: ");
			salario = scan.nextDouble();
					if (salario > 0) {
					infoValida = true;
					} else {
							System.out.println("Sal�rio inv�lido! Sal�rio precisa ser maior que zero.");
							}
		} while (!infoValida);
		
		
		infoValida = false;
		do {
			System.out.println("Digite o sexo: ");
			sexo = scan.next();
					if (sexo.equalsIgnoreCase("F") || sexo.equalsIgnoreCase("M")) {
					infoValida = true;
					} else {
							System.out.println("Sexo inv�lido! Escolher 'F' ou 'M'.");
							}
		} while (!infoValida);
		
		
		infoValida = false;
		do {
			System.out.println("Digite o estado civil: ");
			estadoCivil = scan.next();
				if (estadoCivil.equalsIgnoreCase("S") ||
						estadoCivil.equalsIgnoreCase("C") ||
							estadoCivil.equalsIgnoreCase("V") ||
								estadoCivil.equalsIgnoreCase("D")) {
					infoValida = true;
				} else {
						System.out.println("Estado Civil inv�lido! Escolher 'S' ou 'C' ou 'V' ou 'D'.");
						}
		} while (!infoValida);
		
		System.out.println("Dados gravados com sucesso!");
							
	}						
		
}

	
	
