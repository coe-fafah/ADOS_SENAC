package com.mycompany.exercicios_em_aula;
import java.util.Scanner;
public class Calculadora {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
       
        System.out.println("Escolha um número: ");
        double n1 = input.nextDouble();
        System.out.println("Escolha outro número: ");
        double n2 = input.nextDouble();
        
        System.out.println("Escolha a operação: ");
        
        System.out.println("A: Adição \n"
                + "B: Subtração \n"
                + "C: Divisão \n"
                + "D: Multiplicação");
        
        char x = input.next().charAt(0);
        
        switch(x){
            case 'A','a':
                double soma = n1+n2;
                System.out.println("Resultado: " + soma);
                break;
            case 'B', 'b': 
                double subtracao = n1-n2;
                System.out.println("Resultado: " + subtracao);
                break;
            case 'C','c':
                double divisao = n1/n2;
                System.out.println("Resultado: " + divisao);
                break;
            case 'D','d':
                double multiplicacao = n1*n2;
                System.out.println("Resultado: " + multiplicacao);
                break;
            default:
                System.out.println("Opção Inválida!");
                break;
        }
       }   
    }
