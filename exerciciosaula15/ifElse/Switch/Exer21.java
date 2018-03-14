/* Um posto está vendendo combustíveis com a seguinte tabela de descontos:
. Álcool:
a. até 20 litros, desconto de 3% por litro
b. acima de 20 litros, desconto de 5% por litro
Gasolina:
c. até 20 litros, desconto de 4% por litro
d. acima de 20 litros, desconto de 6% por litro
Escreva um algoritmo que leia o número de litros vendidos, o tipo de combustível (codificado da seguinte forma: A-álcool, Ggasolina),
calcule e imprima o valor a ser pago pelo cliente. */


package br.com.exerciciosaula15.ifElse.Switch;

import java.util.Scanner;

public class Exer21 {

    

    public static void main(String[] args){

        

        Scanner scan = new Scanner(System.in);

        

        System.out.println("Entre com a qtd de litros vendidos");

        double litros = scan.nextDouble();

        

        System.out.println("Entre com o tipode combustível");

        String tipo = scan.next();

        

        double precoGas = 2.5;

        double precoAlc = 1.9;

        int percDesconto = 0;

        double total = 0;

        double totalDesc = 0;

        

        if (tipo.equalsIgnoreCase("a")){

            

            if (litros <= 20){

                percDesconto = 3;

            } else {

                percDesconto = 5;

            }

            

            total = litros * precoAlc;

            

        } else if (tipo.equalsIgnoreCase("g")){

            

            if (litros <= 20){

                percDesconto = 4;

            } else {

                percDesconto = 6;

            }

            

            total = litros * precoGas;

        }

        

        totalDesc = (total / 100) * percDesconto;

        

        double precoAPagar = total - totalDesc;

        

        System.out.println("Valor a ser pago: " + precoAPagar);

    }

}
