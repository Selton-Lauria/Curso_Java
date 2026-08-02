package prac01;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        ArrayList<Cliente> clientes = new ArrayList<>();

        String res = "S";
        System.out.println("Quantos clientes deseja cadastrar?");
        int qtde = sc.nextInt();
        for (int i = 0; i < qtde; i++) {
            Cliente c = new Cliente();
            c.setId(i + 1);
            System.out.println("Nome:");
            c.setNome(sc.nextLine());
            System.out.println("RG:");
            c.setRg(sc.next());
            System.out.println("CPF:");
            c.setCpf(sc.next());
            System.out.println("Telefone:");
            c.setTelefone(sc.next());
            System.out.println("Endereço:");
            c.setEndereco(sc2.nextLine());
            System.out.println("Email:");
            c.setEmail(sc.next());
            clientes.add(c);
            System.out.println(c);
        }
        do {
            System.out.println("Solicite seu próximo passo: [1]Clientes / [2]Atualizar / [3]Remover / [4] Sair");
            int x = sc.nextInt();
            switch (x) {
                case 1:
                    System.out.println(clientes);
                    break;
                case 2:
                    System.out.println("Qual o Id do cliente que deseja atualizar?");
                    int att = sc.nextInt() -1;
                    if (att >= 0 && att < clientes.size()) {
                        Cliente c = clientes.get(att);
                        System.out.println("Novo nome:");
                        c.setNome(sc.nextLine());
                        System.out.println("Novo RG:");
                        c.setRg(sc.next());
                        System.out.println("Novo CPF:");
                        c.setCpf(sc.next());
                        System.out.println("Novo Telefone:");
                        c.setTelefone(sc.next());
                        System.out.println("Novo Endereço:");
                        c.setEndereco(sc2.nextLine());
                        System.out.println("Novo Email:");
                        c.setEmail(sc.next());
                        System.out.println("Atualização concluída!");
                    } else {
                        System.out.println("Id Inválido");
                    }
                    break;
                case 3:

            }
        } while (res.equalsIgnoreCase("S"));

        sc.close();
        sc2.close();
    }
}
