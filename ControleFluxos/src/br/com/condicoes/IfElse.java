package br.com.condicoes;

import java.util.Scanner;

public class IfElse {
    public static void main(String[] args) {
        Scanner verifica = new Scanner(System.in);

        System.out.println("Qual Sua Idade");
        int idade = verifica.nextInt() ;

        String IdadePessoa = verificaIdade(idade);
    }
    public static String verificaIdade(int idade){
        if(idade < 10){
            System.out.println("Somente acompanhado dos Pais");
        } else if (idade >= 10 && idade <= 15) {
            System.out.println("Necessita de uma declaracao dos Pais");
        } else if (idade > 15) {
            System.out.println("Entrada liberada para sua Idade");
        }else {
            System.out.println("Digite a idade VALIDA");
        }
        return null;
    }
}
