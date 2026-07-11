package ex2;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Carro c1 = new Carro();
        Carro c2 = new Carro();
        Carro carro = new Carro("Fiat","Uno","cinza","ABC123");

        System.out.print("Qual o ano do carro? ");
        c1.setAno(sc.nextInt());
        System.out.print("Qual a velocidade do carro? ");
        c1.setVelocidade(sc.nextInt());

        System.out.println(carro.getMarca());
        System.out.println(carro.getModelo());
        System.out.println(carro.getCor());
        System.out.println(carro.getPlaca());
        System.out.println(c1.getAno());
        System.out.println(c1.getVelocidade());

        sc.close();
    }
}
