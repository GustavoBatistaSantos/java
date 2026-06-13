package testes;

import java.util.Scanner;

public class conversor {
    public static void main(String[] args) {
        final double CAMBIO_ATUAL = 5.4;
        Scanner s = new Scanner(System.in);
        System.out.println("Qual e o valor em Dolares?");
        double valorEmDolar = s.nextDouble();
        double valorEmReal = valorEmDolar*CAMBIO_ATUAL;
    System.out.println("Valor em real: R$" + valorEmReal);
    }
}
