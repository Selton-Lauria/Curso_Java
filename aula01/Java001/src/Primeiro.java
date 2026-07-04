import java.util.Scanner;

public class Primeiro {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite o nome: ");
        String nome = teclado.nextLine();

        System.out.print("Digite a idade: ");
        int idade = teclado.nextInt();

        System.out.print("Digite o salário: ");
        double sal = teclado.nextDouble();

        System.out.printf("Nome: %s idade: %d Salário: R$ %.2f",nome,idade,sal);

        teclado.close();
    }
}
