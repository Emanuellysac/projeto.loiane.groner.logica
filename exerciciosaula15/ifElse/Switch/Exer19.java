/* Faça um Programa que leia 2 números e em seguida pergunte ao usuário qual operação ele deseja realizar. O resultado da operação
deve ser acompanhado de uma frase que diga se o número é: par ou ímpar; positivo ou negativo; */


package br.com.exerciciosaula15.ifElse.Switch;

import java.util.Scanner;

public class Exer19 {

    

    public static void main(String[] args){

        

        Scanner scan = new Scanner(System.in);

        

        System.out.println("Entre com o primeiro número:");

        int num1 = scan.nextInt();

        

        System.out.println("Entre com o segundo número:");

        int num2 = scan.nextInt();

        

        System.out.println("Entre com a operação (+ - / *): ");

        String operacao = scan.next();

        

        double resultado = 0;

        boolean valida = true;

        

        switch(operacao){

            case "+": resultado = num1 + num2; break; 

            case "-": resultado = num1 - num2; break;

            case "*": resultado = num1 * num2; break;

            case "/": resultado = num1 / num2; break;

            default: 

                System.out.println("Operação inválida"); 

                valida = false;

        }

        

        if (valida){

            

            System.out.println("Resultado: " + resultado);

            

            if (resultado >=0){

                System.out.println("resultado positivo");

            } else {

                System.out.println("resultado negativo");

            }

            

            if (resultado % 2 == 0){

                System.out.println("resultado par");

            }else {

                System.out.println("resultado ímpar");

            }

        }

    }

}
