package tostring;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Carro> carros = new ArrayList();

        System.out.println("Quantos quer cadastrar?");
        int qtde = sc.nextInt();
        for (int i = 0; i < qtde; i++) {
            Carro c = new Carro();
            c.setId(i + 1);
            System.out.println("Marca:");
            c.setMarca(sc.next());
            System.out.println("Modelo:");
            c.setModelo(sc.next());
            System.out.println("Cor:");
            c.setCor(sc.next());
            System.out.println("Velocidade:");
            c.setVelocidade(sc.nextInt());
            System.out.println("Cadastro finalizado...");
            carros.add(c);
            System.out.println(c);
        }
        System.out.println(carros);
        sc.close();
    }
}
