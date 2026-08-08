package ex03;

import java.util.Scanner;

public class Main {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Conta c = new Conta();

        System.out.println("Quem é o titular da conta? ");
        c.setTitular(sc.nextLine());
        System.out.println("Qual o número da sua conta? ");
        c.setNumero(sc.next());
        System.out.println("Qual o saldo da sua conta? ");
        c.setSaldo(sc.nextDouble());
        String res = "Sair";
        do {
        System.out.println("O que deseja fazer? ");
        System.out.println("[1] Depositar / [2] Sacar / [3] Consultar saldo / [4] Acessar outras contas");
        int y = sc.nextInt();
        switch (y) {
            case 1:
                System.out.println("Quanto deseja depositar? ");
                int d = sc.nextInt();
                c.depositar(d);
                System.out.println(c.saldo);
                break;
            case 2:
                System.out.println("Quanto deseja sacar? ");
                int s = sc.nextInt();
                c.depositar(s);
                System.out.println(c.saldo);
                break;
            case 3:
                System.out.println(c.saldo);
                break;
            case 4:
                System.out.println("Qual conta deseja acessar? ");
                System.out.println("[1] Conta Corrente / [2] Conta Poupança / [3] Conta Investimento");
                int x = sc.nextInt();
                switch (x) {
                    case 1:
                        ContaCorrente cc = new ContaCorrente();
                        System.out.println("Qual o limite da conta? ");
                        cc.setLimite(sc.nextDouble());




                }

        }
        } while
    }
}
