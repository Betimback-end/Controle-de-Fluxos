package br.CondicaoBreack;

public class Breack {
    public static void main(String[] args) {
        int condicao = 0 ;
        for (condicao = 0 ; condicao < 1000; condicao ++ ){
            System.out.println("Valor da Condicao" + condicao);
            if (condicao == 5){
                break;
            }
        }
    }
}
