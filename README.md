# Curso_Java
## Aluno:
Selton Lira Lauria

package ex1;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Carro c = new Carro();
        System.out.print("Marca: ");
        c.marca = sc.next();
        System.out.print("Modelo: ");
        c.modelo = sc.next();
        System.out.print("Cor: ");
        c.cor = sc.next();

        c.ligar();
        c.desligar();
        c.acelerar();
        c.frear();
        sc.close();

        System.out.println("A marca é " + c.marca);
        System.out.println("c.modelo);
        System.out.println(c.cor);
    }
}
