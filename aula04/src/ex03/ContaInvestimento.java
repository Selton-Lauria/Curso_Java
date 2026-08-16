package ex03;

public class ContaInvestimento extends Conta implements Rendimentavel {
    private String tipoInvestimento;
    private double rentabilidadeAnual, total;

    public String getTipoInvestimento() {
        return tipoInvestimento;
    }

    public void setTipoInvestimento(String tipoInvestimento) {
        this.tipoInvestimento = tipoInvestimento;
    }

    public double getRentabilidadeAnual() {
        return rentabilidadeAnual;
    }

    public void setRentabilidadeAnual(double rentabilidadeAnual) {
        this.rentabilidadeAnual = rentabilidadeAnual;
    }

    @Override
    public void calcularRendimento() {
        total = rentabilidadeAnual / 12;
        System.out.println("A rentabilidade é de R$" + total + " por mês");

    }

    @Override
    public void aplicarRendimento() {
        saldo = saldo + rentabilidadeAnual;
        System.out.println("Depois de um ano, seu saldo será de R$" + saldo);
    }
}
