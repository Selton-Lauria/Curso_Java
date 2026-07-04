import java.util.Scanner;
public class processar {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int num1 = teclado.nextInt();

        System.out.print("Digite outro número: ");
        int num2 = teclado.nextInt();

        int total = num1 + num2;
        System.out.println("O total é: " + total);
        teclado.close();

        if (num1 > num2) {
            System.out.print("O primeiro número é maior");
        } else if (num1 < num2) {
            System.out.print("O segundo número é maior");
        } else {
            System.out.print("Os números são iguais");
        }
    }
}
