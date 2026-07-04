import java.util.Scanner;
public class switchCase {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        int num1 = teclado.nextInt();

        System.out.print("Digite o segundo número: ");
        int num2 = teclado.nextInt();

        System.out.println("Digite 1 para adição e 2 para subtração: ");
        int x = teclado.nextInt();
        switch (x) {
            case 1:
                int total = num1 + num2;
                System.out.printf("A adição dos números é: %d", total);
                break;
            case 2:
                if (num1 > num2) {
                    total = num1 - num2;
                    System.out.printf("A subtração do maior número pelo menor é igual a: %d", total);
                } else if (num1 < num2) {
                    total = num2 - num1;
                    System.out.printf("A subtração do maior número pelo menor é igual a: %d", total);
                } else {
                    total = num1 - num2;
                    System.out.printf("A subtração dos números é igual a: %d", total);
                }
                break;
            default:
                System.out.println("Opção inválida");
                break;
        }
        teclado.close();
    }
}
