package herança;

import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Carro> carros = new ArrayList<>();
        ArrayList<Avião> avioes = new ArrayList<>();
        ArrayList<Bicicleta> bicicletas = new ArrayList<>();

        System.out.println("Quantos carros deseja cadastrar?");
        int qtdeCarros = sc.nextInt();

        for (int i = 0; i < qtdeCarros; i++) {
            Carro c = new Carro();
            System.out.println("\nCarro " + (i + 1));
            System.out.println("Marca: ");
            c.setMarca(sc.next());
            System.out.println("Modelo: ");
            c.setModelo(sc.next());
            System.out.println("Cor: ");
            c.setCor(sc.next());
            System.out.println("Placa: ");
            c.setPlaca(sc.next());
            System.out.println("Velocidade: ");
            c.setVelocidade(sc.nextInt());
            System.out.println("Quantidade de Portas: ");
            c.setPortas(sc.nextInt());
            carros.add(c);
        }
        System.out.println("Quantos aviões deseja cadastrar? ");
        int qtdeAviao = sc.nextInt();

        for (int i = 0; i < qtdeAviao; i++) {
            Avião a = new Avião();
            System.out.println("\nAvião " + (i + 1));
            System.out.println("Marca: ");
            a.setMarca(sc.next());
            System.out.println("Modelo: ");
            a.setModelo(sc.next());
            System.out.println("Cor: ");
            a.setCor(sc.next());
            System.out.println("Companhia: ");
            a.setCompanhia(sc.next());
            System.out.println("Velocidade: ");
            a.setVelocidade(sc.nextInt());
            System.out.println("Quantidade de Portas: ");
            a.setMotores(sc.nextInt());
            System.out.println("Altitude: ");
            a.setAltitude(sc.nextInt());
            avioes.add(a);
        }
        System.out.println("Quantas bicicletas deseja cadastrar?");
        int qtdeBicicletas = sc.nextInt();

        for (int i = 0; i < qtdeBicicletas; i++) {
            Bicicleta b = new Bicicleta();
            System.out.println("\nBicicleta " + (i + 1));
            System.out.println("Marca: ");
            b.setMarca(sc.next());
            System.out.println("Modelo: ");
            b.setModelo(sc.next());
            System.out.println("Cor: ");
            b.setCor(sc.next());
            System.out.println("Tipo do freio: ");
            b.setTipoFreio(sc.next());
            System.out.println("Velocidade: ");
            b.setVelocidade(sc.nextInt());
            System.out.println("Marchas: ");
            b.setMarchas(sc.nextInt());
            System.out.println("Possui Cesta? ");
            b.setPossuiCesta(sc.nextBoolean());
            bicicletas.add(b);
        }
        System.out.println(carros);
        System.out.println(avioes);
        System.out.println(bicicletas);
    }
}
