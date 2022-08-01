package br.comCondicaoFor;

import java.util.Scanner;

public class For {
    public static void main(String[] args) {
        Scanner verifica = new Scanner(System.in);

        int num = 0 ;
        System.out.println("Entre com o numero a ser calculado");
        num = verifica.nextInt();

        for (int i = 0 ; i <= 10 ; i ++){
            System.out.println(num + " X " + i + " = " + num * i);
        }

    }
}
