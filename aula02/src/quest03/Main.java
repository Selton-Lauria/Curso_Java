package quest03;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Cliente cliente = new Cliente("Ana", "123", "456", "(83)99999-9999", "rua ABCD", "ana@uniesp.edu.br");

        System.out.println(cliente.getNome());
        System.out.println(cliente.getRg());
        System.out.println(cliente.getCpf());
        System.out.println(cliente.getTelefone());
        System.out.println(cliente.getEndereco());
        System.out.println(cliente.getEmail());
        sc.close();
    }
}
