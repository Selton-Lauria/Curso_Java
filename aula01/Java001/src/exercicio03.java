import java.util.Scanner;
public class exercicio03 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Qual o nome do produto? ");
        String nome = teclado.nextLine();

        System.out.printf("Qual a quantidade de %s? ", nome);
        int quant = teclado.nextInt();

        System.out.print("Qual o preço do produto? ");
        double preco = teclado.nextDouble();

        double total = quant * preco;
         if (total > 500) {
             total *= 0.85;
             System.out.printf("O preço será de R$ %.2f \n", total);
         } else {
             System.out.printf("O preço será de R$ %.2f \n", total);
         }
         System.out.print("Digite seu pagamento: ");
         double pag = teclado.nextDouble();

         if (pag > total) {
             double troco = pag - total;
             System.out.printf("O troco será de R$ %.2f ", troco);
         } else if (pag < total) {
             double div = total - pag;
             System.out.printf("Falta ainda R$ %.2f, pague por favor.", div);
         } else {
             System.out.print("Pagamento realizado! Obrigado pela compra!");
         }
         teclado.close();
    }
}
