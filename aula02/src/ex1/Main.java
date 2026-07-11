package ex1;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Carro c = new Carro();
        System.out.println("Digite o ano do veículo: ");
        c.setAno(sc.nextInt());
        System.out.print("Marca: ");
        c.setMarca(sc.next());
        System.out.print("Modelo: ");
        c.setModelo(sc.next());
        System.out.print("Cor: ");
        c.setCor(sc.next());

        c.ligar();
        c.desligar();
        c.acelerar();
        c.frear();
        sc.close();

        System.out.println("Ano: " + c.getAno());
        System.out.println("A marca é " + c.getMarca());
        System.out.println("O modelo é " + c.getModelo());
        System.out.println("A cor é " + c.getCor());
        System.out.print("A placa é " + c.getPlaca());
    }
}