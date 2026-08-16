package ex03;

import java.util.Arrays;
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
        String res = "Continuar";
        do {
            System.out.println("O que deseja fazer? ");
            System.out.println("[1] Depositar / [2] Sacar / [3] Consultar saldo / [4] Acessar outras contas / [5] Sair");
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
                    c.sacar(s);
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
                            System.out.println("Qual a taxa de manutenção? ");
                            cc.setTaxaManutencao(sc.nextDouble());
                            System.out.println("Dados coletados!");
                            System.out.println("Limite: R$" + cc.getLimite());
                            System.out.println("Taxa de Manutenção: R$" + cc.getTaxaManutencao());
                            break;
                        case 2:
                            ContaPoupança cp = new ContaPoupança();
                            cp.saldo = c.getSaldo();
                            System.out.println("Qual a taxa de rendimento? ");
                            cp.setTaxaRendimento(sc.nextDouble());
                            System.out.println("Qual é o rendimento do dia? ");
                            cp.setDiaRendimento(sc.nextInt());
                            System.out.println("Dados coletados");
                            cp.calcularRendimento();
                            cp.aplicarRendimento();
                            break;
                        case 3:
                            ContaInvestimento ci = new ContaInvestimento();
                            ci.saldo = c.getSaldo();
                            System.out.println("Qual o tipo do investimento? ");
                            ci.setTipoInvestimento(sc.next());
                            System.out.println("Qual a sua rentabilidade anual? ");
                            ci.setRentabilidadeAnual(sc.nextDouble());
                            System.out.println("Dados coletados!");
                            System.out.println("Com o " + ci.getTipoInvestimento() + " como tipo de investimento.");
                            ci.calcularRendimento();
                            ci.aplicarRendimento();
                            break;
                        default:
                            System.out.println("Inválido! Tente novamente!");
                            break;
                    }
                    break;
                case 5:
                    System.out.println("Saindo...");
                    res = "Sair";
                    break;
            }
        } while (res.equalsIgnoreCase("Continuar"));
        System.out.println("O titular da conta é: " + c.getTitular());
        System.out.println("O número da conta é: " + c.getNumero());
        System.out.println("O saldo da conta atualmente é: " + c.getSaldo());
        sc.close();
    }
}
