//12. Tendo como dados de entrada a altura de uma pessoa, construa um algoritmo que calcule seu peso ideal, usando a seguinte fórmula:
//(72.7*altura) - 58

package br.com.exerciciosaula13.operadores;

import java.util.Scanner;

public class Exer12 {

	public static void main(String[] args) {
		
		 Scanner scan = new Scanner(System.in);

	        System.out.println("Entre com a altura: ");
	        double altura = scan.nextDouble();

	        double pesoIdeal = (72.7 * altura) - 58;
	        System.out.println("O peso ideal é : " + pesoIdeal);
		
	}

}
