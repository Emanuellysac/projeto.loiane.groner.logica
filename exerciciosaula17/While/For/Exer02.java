/*Fa�a um programa que leia um nome de usu�rio e a sua senha e n�o aceite a senha igual ao nome do usu�rio,
mostrando uma mensagem de erro e voltando a pedir as informa��es. */

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
					System.out.println("\\Usu�rio e senha n�o podem serem iguais//");
				} else {
					usuario = true;
					System.out.println("Usu�rio salvo com sucesso!");
						}	
		   } while (usuario == false);

	}

}
