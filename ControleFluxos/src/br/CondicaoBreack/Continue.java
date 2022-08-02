package br.CondicaoBreack;

public class Continue {
    public static void main(String[] args) {

        for (int i = 1; i < 50; i++) {
            if (i %3!= 0) { // Para saber quando o número é divisível, usa dessa maneira.
                continue;
            }
            System.out.println("Numeror multiplos por 3 e"  + " = "  + i);
        }

    }
}
