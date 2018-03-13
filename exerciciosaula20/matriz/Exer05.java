/*Fa�a um programa para armazenar em uma matriz os compromissos de uma agenda pessoal. Cada dia do m�s deve
conter 24 horas, onde para cada uma destas 24 horas podemos associar um tarefa espec�fica (compromisso agendado). O
programa deve ter um menu onde o usu�rio indica o dia do m�s que deseja alterar e a hora, entrando em seguida com o
compromisso, ou ent�o, o usu�rio pode tamb�m consultar a agenda, fornecendo o dia e a hora para obter o compromisso armazenado.
5. Modifique o programa anterior de maneira a guardar os compromissos de todo o ano, organizados por m�s, dia e hora (s� 8 horas por dia). */

package br.com.exerciciosaula20.matriz;

import java.util.Scanner;

public class Exer05 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		String[][][] compromissos = new String[12][31][8];

		boolean sair = false;

		byte opcao;

		while (!sair) {

			System.out.println("Digite 1 para adicionar compromisso.");

			System.out.println("Digite 2 para verificar compromisso.");

			System.out.println("Digite 0 para sair.");

			opcao = scan.nextByte();

			if (opcao == 1) { // adicionar compromisso

				boolean mesValido = false;

				int mes = 0;

				while (!mesValido) {

					System.out.println("Entre com o m�s");

					mes = scan.nextInt();

					if (mes > 0 && mes <= 12) {

						mesValido = true;

					} else {

						System.out.println("M�s inv�lido, digite novamente");

					}

				}

				boolean diaValido = false;

				int dia = 0;

				while (!diaValido) {

					System.out.println("Entre com o dia do m�s");

					dia = scan.nextInt();

					if (dia > 0 && dia <= 31) {

						diaValido = true;

					} else {

						System.out.println("Dia inv�lido, digite novamente");

					}

				}

				boolean horaValida = false;

				int hora = 0;

				while (!horaValida) {

					System.out.println("Entre com a hora do compromisso");

					hora = scan.nextInt();

					if (hora >= 0 && hora <= 8) {

						horaValida = true;

					} else {

						System.out.println("Hora inv�lida, digite novamente");

					}

				}

				 mes--;

				 dia--;

				System.out.println("Digite o compromisso");

				compromissos[mes][dia][hora] = scan.next();

			} else if (opcao == 2) { // verificar compromisso

				boolean mesValido = false;

				int mes = 0;

				while (!mesValido) {

					System.out.println("Entre com o m�s");

					mes = scan.nextInt();

					if (mes > 0 && mes <= 12) {

						mesValido = true;

					} else {

						System.out.println("M�s inv�lido, digite novamente");

					}

				}

				boolean diaValido = false;

				int dia = 0;

				while (!diaValido) {

					System.out.println("Entre com o dia do m�s");

					dia = scan.nextInt();

					if (dia > 0 && dia <= 31) {

						diaValido = true;

					} else {

						System.out.println("Dia inv�lido, digite novamente");

					}

				}

				boolean horaValida = false;

				int hora = 0;

				while (!horaValida) {

					System.out.println("Entre coma hora do compromisso");

					hora = scan.nextInt();

					if (hora >= 0 && hora <= 24) {

						horaValida = true;

					} else {

						System.out.println("Hora inv�lida, digite novamente");

					}

				}

				 mes--;

				 dia--;

				System.out.println("O compromisso agendado �:");

				System.out.println(compromissos[mes][dia][hora]);

			} else if (opcao == 0) {

				sair = true;

			} else {

				System.out.println("Op��o inv�lida, digite novamente");

			}

		}

	}

}
