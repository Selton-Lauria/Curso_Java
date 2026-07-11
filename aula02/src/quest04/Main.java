package quest04;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Produto produto = new Produto(50, 85.90);
        System.out.println("Qual o nome do produto? ");
        produto.setNome(sc.nextLine());
        produto.calcular();

        System.out.printf("\n Valor da compra: R$ %.2f%n", produto.getTotal());

        if (produto.getTotal() > 500) {
            produto.setTotal(produto.getTotal() * 0.85);
        }
        System.out.printf("O preço será de R$ %.2f \n", produto.getTotal());
        System.out.print("Digite seu pagamento: ");
        double pag = sc.nextDouble();

        if (pag > produto.getTotal()) {
            double troco = pag - produto.getTotal();
            System.out.printf("O troco será de R$ %.2f ", troco);
        } else if (pag < produto.getTotal()) {
            double div = produto.getTotal() - pag;
            System.out.printf("Falta ainda R$ %.2f, pague por favor.", div);
        } else {
            System.out.print("Pagamento realizado! Obrigado pela compra!");
        }


        sc.close();
    }
}