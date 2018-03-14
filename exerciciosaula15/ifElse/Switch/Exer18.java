/* Faça um Programa que peça um número inteiro e determine se ele é par ou impar. Dica: utilize o operador módulo (resto da divisão). */


package br.com.exerciciosaula15.ifElse.Switch;

	import java.util.Scanner;

	public class Exer18 {

	    
	    public static void main(String[] args){
  

	        Scanner scan = new Scanner(System.in);

	        

	        System.out.println("Entre com um número");

	        int num = scan.nextInt();

	        

	        if (num % 2 == 0){

	            System.out.println("par");

	        } else {

	            System.out.println("ímpar");

	        }

	    }

	}


