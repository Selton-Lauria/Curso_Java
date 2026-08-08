package ex01;

import java.util.Scanner;

public class Main {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Emprestimo e = new Emprestimo();

        System.out.println("Qual é o valor do empréstimo? ");
        e.setValorEmp(sc.nextInt());
        System.out.println("Qual a quantidade de parcelas? ");
        e.setQtdePar(sc.nextInt());
        System.out.println("Qual a taxa de juros? ");
        e.setTaxa(sc.nextInt());

        e.calcularValorFinal();

        System.out.println(e);

        System.out.println("O total com os juros é: R$" + e.getTotal());
        sc.close();
    }
}
