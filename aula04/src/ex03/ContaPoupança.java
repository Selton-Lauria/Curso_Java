package ex03;

public class ContaPoupança extends Conta implements Rendimentavel {
    private int diaRendimento;
    private double taxaRendimento, total;

    public int getDiaRendimento() {
        return diaRendimento;
    }

    public void setDiaRendimento(int diaRendimento) {
        this.diaRendimento = diaRendimento;
    }

    public double getTaxaRendimento() {
        return taxaRendimento;
    }

    public void setTaxaRendimento(double taxaRendimento) {
        this.taxaRendimento = taxaRendimento;
    }

    @Override
    public void calcularRendimento() {
        total = taxaRendimento / 100;
        System.out.println("Seu saldo aumentará " + total + " por dia.");

    }

    @Override
    public void aplicarRendimento() {
        saldo += taxaRendimento / 100;
        System.out.println("Amanhã, seu saldo será de R$" + saldo);
    }
}
