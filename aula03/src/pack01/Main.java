package pack01;

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
            System.out.println("CADASTRO:");
            System.out.println("Marca:");
            c.setMarca(sc.next());
            System.out.println("Modelo:");
            c.setModelo(sc.next());
            System.out.println("Cor:");
            c.setCor(sc.next());
            System.out.println("Velocidade:");
            c.setVelocidade(sc.nextInt());
            System.out.println("Cadastro do carro finalizado...");
            carros.add(c);
        }
        for (int i = 0; i < carros.size(); i++) {
            Carro c = carros.get(i);
            System.out.println("Id: " + c.getId());
            System.out.println("Marca: " + c.getMarca());
            System.out.println("Modelo: " + c.getModelo());
            System.out.println("Cor: " + c.getCor());
            System.out.println("Velocidade: " + c.getVelocidade() + "Km/h");
            System.out.println("-------------------------------------------------------");
        }
        System.out.println("Deseja remover algum carro do cadastro? ");
        String perg = sc.next();
        if (perg.equals("S") || perg.equals("Sim")) {
            System.out.println("Digite o ID do carro que deseja remover:");
            int idRemover = sc.nextInt() - 1;

            if (idRemover >= 0 && idRemover < carros.size()) {
                carros.remove(idRemover);
                for (int i = 0; i < carros.size(); i++) {
                    carros.get(i).setId(i + 1);
                }
                System.out.println("Carro removido com sucesso!");
            } else {
                System.out.println("Id Inválido...");
            }
            for (Carro c : carros) {
                System.out.println("Id: " + c.getId());
                System.out.println("Marca: " + c.getMarca());
                System.out.println("Modelo: " + c.getModelo());
                System.out.println("Cor: " + c.getCor());
                System.out.println("Velocidade: " + c.getVelocidade() + "Km/h");
                System.out.println("-------------------------------------------------------");
            }
        } else {
            System.out.println("Programa finalizado...");
        }


        sc.close();
    }
}
