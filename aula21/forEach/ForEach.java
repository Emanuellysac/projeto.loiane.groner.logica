package br.com.aula21.forEach;

import java.util.Random;

public class ForEach {

	public static void main(String[] args) {

		int[] notas = new int[10];

		Random random = new Random(); // Gera números aleatórios.

		for (int i = 0; i < notas.length; i++) {
			notas[i] = random.nextInt(10);
		}

		for (int i = 0; i < notas.length; i++) { // *.
			int nota = notas[i];
			System.out.println(nota);
		}

		System.out.println("Usando o for each!");

		for (int nota : notas) { // Este for é semelhante ao contexto do for acima //*.
			System.out.println(nota);
			// O for each não funciona para fazer leitura de teclado com tipos primitivos.
			// Funciona bem para output. Para setar/entrada de valor usar o for normal.
		}

		// Exemplo 02
		System.out.println("Exemplo com arrays multidimensionais.");
		double[][] notasAlunos = new double[2][4];

		notasAlunos[0][0] = 10;
		notasAlunos[0][1] = 7;
		notasAlunos[0][2] = 9;
		notasAlunos[0][3] = 9.5;

		notasAlunos[1][0] = 9;
		notasAlunos[1][1] = 8;
		notasAlunos[1][2] = 7;
		notasAlunos[1][3] = 9;

		for (double[] notasAluno : notasAlunos) {// Acesso ao array de notas de cada aluno.
			for (double nota : notasAluno) {
				System.out.print(nota + " ");
			}
			System.out.println();

		}
	}
}
