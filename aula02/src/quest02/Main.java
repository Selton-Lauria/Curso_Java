package quest02;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Produto d = new Produto();
        System.out.print("Qual o nome do produto? ");
        d.setProduto(sc.nextLine());
        System.out.printf("Qual a quantidade de %s? ", d.getProduto());
        d.setQuant(sc.nextInt());
        System.out.print("Qual o preço do produto? R$");
        d.setPreco(sc.nextDouble());

        d.calcularSubtotal();

        System.out.printf("\n Valor da compra: R$ %.2f%n", d.getTotal());

        if (d.getTotal() > 500) {
            d.setTotal(d.getTotal() * 0.85);
        }
        System.out.printf("O preço será de R$ %.2f \n", d.getTotal());
        System.out.print("Digite seu pagamento: ");
        double pag = sc.nextDouble();

        if (pag > d.getTotal()) {
            double troco = pag - d.getTotal();
            System.out.printf("O troco será de R$ %.2f ", troco);
        } else if (pag < d.getTotal()) {
            double div = d.getTotal() - pag;
            System.out.printf("Falta ainda R$ %.2f, pague por favor.", div);
        } else {
            System.out.print("Pagamento realizado! Obrigado pela compra!");
        }


        sc.close();
    }
}
