import java.util.Scanner;
public class condicao {
    public static void main(String[] args) {
        String r;
        Scanner teclado = new Scanner(System.in);
        do {
            System.out.print("Digite o primeiro número: ");
            int num1 = teclado.nextInt();

            System.out.print("Digite o segundo número: ");
            int num2 = teclado.nextInt();

            System.out.println("Digite 1 para adição e 2 para subtração: ");
            int x = teclado.nextInt();
            switch (x) {
                case 1:
                    int total = num1 + num2;
                    System.out.printf("A adição dos números é: %d \n", total);
                    break;
                case 2:
                    if (num1 > num2) {
                        total = num1 - num2;
                        System.out.printf("A subtração do maior número pelo menor é igual a: %d \n", total);
                    } else if (num1 < num2) {
                        total = num2 - num1;
                        System.out.printf("A subtração do maior número pelo menor é igual a: %d \n", total);
                    } else {
                        total = num1 - num2;
                        System.out.printf("A subtração dos números é igual a: %d \n", total);
                    }
                    break;
                default:
                    System.out.println("Opção inválida");
                    break;
            }
            System.out.println("Para ver novamente, digite S");
            r = teclado.next();
        } while (r.equalsIgnoreCase("S"));
        System.out.print("Fechando programa...");
        teclado.close();
    }
}
