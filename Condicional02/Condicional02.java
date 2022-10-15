package Condicional02;

import java.util.Scanner;

public class Condicional02 {

    public static void main(String[] args) {
        int nota;
        int percentual;

        Scanner input = new Scanner(System.in);

        System.out.print("Digite a nota do estudante: ");
        nota = input.nextInt();
        System.out.print("Digite o percentual de faltas: ");
        percentual = input.nextInt();

        if ((nota >= 70) && (percentual < 25)) {
            System.out.println("O aluno foi aprovado");
        } else {
            System.out.println("O aluno não foi aprovado");

        }
    }
}