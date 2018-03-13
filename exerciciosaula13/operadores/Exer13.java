/*Fa�a um Programa que pergunte quanto voc� ganha por hora e o n�mero de horas trabalhadas no m�s. Calcule e mostre o total do seu
sal�rio no referido m�s, sabendo-se que s�o descontados 11% para o Imposto de Renda, 8% para o INSS e 5% para o sindicato, fa�a um
programa que nos d�:
. sal�rio bruto.
a. quanto pagou ao INSS.
b. quanto pagou ao sindicato.
c. o sal�rio l�quido.
d. calcule os descontos e o sal�rio l�quido, conforme a tabela
abaixo:
+ Sal�rio Bruto : R$ - IR (11%) : R$ - INSS
(8%) : R$ - Sindicato ( 5%) : R$ = Sal�rio
Liquido : R$
Obs.: Sal�rio Bruto - Descontos = Sal�rio L�quido. */

package br.com.exerciciosaula13.operadores;

import java.util.Scanner;

public class Exer13 {

	public static void main(String[] args) {
		
		 Scanner scan = new Scanner(System.in);

	        System.out.println("Entre com o valor/hora: ");
	        double valorHora = scan.nextDouble();

	        System.out.println("Entre com a quantidade de horas trabalhadas no m�s: ");
	        double horas = scan.nextDouble();

	        double salarioBruto = valorHora * horas;
	        double inss = (salarioBruto / 100) * 8;
	        double sindicato = (salarioBruto / 100) * 5;
	        double ir = (salarioBruto / 100) * 11;
	        double totalDescontos = inss + sindicato + ir;
	        double salarioLiquido = salarioBruto - totalDescontos;
	        
	        System.out.println("Sal�rio bruto: " + salarioBruto);
	        System.out.println("INSS: " + inss);
	        System.out.println("Sindicato: " + sindicato);
	        System.out.println("IR: " + ir);
	        System.out.println("Total descontos: " + totalDescontos);
	        System.out.println("Sal�rio l�quido: " + salarioLiquido);

	}

}
