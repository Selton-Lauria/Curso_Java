import java.util.Scanner;
public class menu {
    public static void main(String[] args) {
        String r = "S";
        Scanner teclado = new Scanner(System.in);
        double saldo = 500.00;
        do {
            System.out.println("O que você quer fazer? [1]Consultar saldo/ [2]Depositar/ [3]Sacar/ [0]Encerrar ");
            int x = teclado.nextInt();
            switch (x) {
                case 1:
                    System.out.printf("Saldo atual: %.2f \n", saldo);
                    break;
                case 2:
                    System.out.print("Quanto quer depositar? ");
                    double depos = teclado.nextDouble();
                    saldo += depos;
                    System.out.println("Valor depositado...");
                    break;
                case 3:
                    System.out.print("Quanto quer sacar? ");
                    double saque = teclado.nextDouble();
                    if (saque > saldo) {
                        System.out.println("Saldo insuficiente para o saque... tente novamente!");
                    } else {
                        saldo -= saque;
                        System.out.println("Dinheiro sacado!");
                    }
                    break;
                case 0:
                    System.out.print("Fechando Programa...");
                    r = "N";
            }
        } while (r.equalsIgnoreCase("S"));
        teclado.close();
    }
}

