package ex01;

import java.util.Scanner;

public class Main {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Qual forma de pagamento deseja utilizar? ");
        System.out.println("[1] Cartão / [2] Pix / [3] Boleto");
        int x = sc.nextInt();
        switch (x) {
            case 1:
                PagamentoCartao pc = new PagamentoCartao();
                System.out.println("Qual o número de cartão? ");
                pc.setNumeroCartao(sc.next());
                System.out.println("Qual o valor? ");
                pc.setValor(sc.nextDouble());
                System.out.println("Qual a quantidade de parcelas que deseja? ");
                pc.setParcelas(sc.nextInt());
                System.out.println("Qual a data? ");
                pc.setData(sc.next());
                System.out.println("Qual o status? ");
                pc.setStatus(sc.next());
                pc.calcularTaxa();
                pc.processarPagamento();
                pc.emitirComprovante();
                System.out.println("A taxa será de " + pc.getTotal());
                break;
            case 2:
                PagamentoPix px = new PagamentoPix();
                System.out.println("Qual a chave pix? ");
                px.setChavePix(sc.next());
                System.out.println("Qual o valor? ");
                px.setValor(sc.nextDouble());
                System.out.println("Qual o seu banco? ");
                px.setBanco(sc.next());
                System.out.println("Qual a data? ");
                px.setData(sc.next());
                System.out.println("Qual o status? ");
                px.setStatus(sc.next());
                px.calcularTaxa();
                px.processarPagamento();
                px.emitirComprovante();
                break;
            case 3:
                PagamentoBoleto pb = new PagamentoBoleto();
                System.out.println("Qual o código de barras? ");
                pb.setCodigoBarras(sc.next());
                System.out.println("Qual o valor? ");
                pb.setValor(sc.nextDouble());
                System.out.println("Qual a data de vencimento? ");
                pb.setDataVencimento(sc.next());
                System.out.println("Qual a data? ");
                pb.setData(sc.next());
                System.out.println("Qual o status? ");
                pb.setStatus(sc.next());
                pb.calcularTaxa();
                pb.processarPagamento();
                pb.emitirComprovante();
                break;
            default:
                System.out.println("Opção inválida");
        }

    }
}
