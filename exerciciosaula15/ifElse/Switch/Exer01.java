/* Faça um Programa que peça dois números e imprima o maior deles. */


package br.com.exerciciosaula15.ifElse.Switch;
	import java.util.Scanner;

	public class Exer01 {
	    
	    public static void main(String[] args){
	        
	        Scanner scan = new Scanner(System.in);
	        
	        System.out.println("Entre com o primeiro número");
	        int num1 = scan.nextInt();
	        
	        System.out.println("Entre com o segundo número");
	        int num2 = scan.nextInt(); 
	        
	        if (num1 > num2){
	            System.out.println("O num1 é maior: " + num1);
	        } else {
	            System.out.println("O num2 é maior: " + num2);
	        }
	    }
	}

