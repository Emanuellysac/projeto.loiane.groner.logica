/*Faça um programa que leia um nome de usuário e a sua senha e não aceite a senha igual ao nome do usuário,
mostrando uma mensagem de erro e voltando a pedir as informações. */

package br.com.exerciciosaula17.While.For;

import java.util.Scanner;

public class Exer02 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		boolean usuario = false; 
		String nome, senha;
	
		do {
			System.out.println("Informe o nome: ");
			nome = scan.next();
			System.out.println("Informe a senha: ");
			senha = scan.next();
				if (nome.equalsIgnoreCase(senha)) {
					System.out.println("\\Usuário e senha não podem serem iguais//");
				} else {
					usuario = true;
					System.out.println("Usuário salvo com sucesso!");
						}	
		   } while (usuario == false);

	}

}
