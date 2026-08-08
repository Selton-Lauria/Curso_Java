package ex02;

import java.util.Scanner;

public class Main {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Qual veiculo deseja utilizar? ");
        System.out.println("[1] Carro / [2] Avião / [3] Bicicleta");
        int x = sc.nextInt();
        switch (x) {
            case 1:
                Carro c = new Carro();
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
                c.ligar();
                c.desligar();
                c.abrirPortaMalas();
                break;
            case 2:
                Avião a = new Avião();
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
                System.out.println("Motores: ");
                a.setMotores(sc.nextInt());
                System.out.println("Altitude: ");
                a.setAltitude(sc.nextInt());
                a.ligar();
                a.acelerar();
                a.decolar();
                a.abrirTremPouso();
                a.pousar();
                a.frear();
                a.desligar();
                break;
            case 3:
                Bicicleta b = new Bicicleta();
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
                b.pedalar();
                b.acelerar();
                b.tocarCampainha();
                b.frear();
                break;
            default:
                System.out.println("Inválido");
                break;
        }
        sc.close();
    }
}
