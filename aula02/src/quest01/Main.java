package quest01;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Cliente c = new Cliente();
        System.out.print("Qual é o nome do cliente? ");
        c.setNome(sc.nextLine());
        System.out.print("Qual o rg do cliente? ");
        c.setRg(sc.next());
        System.out.print("Qual o cpf do cliente? ");
        c.setCpf(sc.next());
        System.out.print("Qual o telefone do cliente? ");
        c.setTelefone(sc.next());
        Scanner sc2 = new Scanner(System.in);
        System.out.print("Qual o endereço do cliente? ");
        c.setEndereco(sc2.nextLine());
        System.out.print("Qual o email do cliente? ");
        c.setEmail(sc.next());

        System.out.println("O nome do cliente é " + c.getNome());
        System.out.println("O RG do cliente é " + c.getRg());
        System.out.println("O CPF do cliente é " + c.getCpf());
        System.out.println("O Telefone do cliente é " + c.getTelefone());
        System.out.println("O endereço do cliente é " + c.getEndereco());
        System.out.println("O email do cliente é " + c.getEmail());

        sc.close();
        sc2.close();
    }
}
