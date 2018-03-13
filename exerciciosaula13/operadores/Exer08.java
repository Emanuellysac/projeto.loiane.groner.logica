//Faça um Programa que pergunte quanto você ganha por hora e o número de horas trabalhadas no mês.
//Calcule e mostre o total do seu salário no referido mês.

package br.com.exerciciosaula13.operadores;

import java.util.Scanner;

public class Exer08 {

	public static void main(String[] args) {
		
Scanner scan = new Scanner(System.in);

        System.out.println("Entre com o valor/hora: ");
        double valorHora = scan.nextDouble();

        System.out.println("Entre com a quantidade de horas trabalhadas no mês:");
        double horas = scan.nextDouble();

        double salario = valorHora * horas;
        System.out.println("O salário é de: " + salario);
		
	}

}
