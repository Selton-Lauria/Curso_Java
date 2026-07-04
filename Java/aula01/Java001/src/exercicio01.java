import java.util.Scanner;

public class exercicio01 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite seu nome: ");
        String nome = teclado.nextLine();

        System.out.print("Digite seu RG: ");
        String rg = teclado.next();

        System.out.print("Digite seu CPF: ");
        String cpf = teclado.next();

        System.out.print("Digite seu telefone: ");
        String tel = teclado.next();

        Scanner teclado2 = new Scanner(System.in);

        System.out.print("Digite seu endereço: ");
        String endereco = teclado2.nextLine();

        System.out.print("Digite seu email: ");
        String email = teclado.next();

        System.out.printf("Nome: %s, RG: %s, CPF: %s, Telefone: %s, Endereço: %s, Email: %s, ", nome,rg,cpf,tel,endereco,email);

        teclado.close();
        teclado2.close();
    }
}
