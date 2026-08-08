package ex01;

public class Emprestimo {
    private int valorEmp, qtdePar;
    private double taxa, total;

    public int getValorEmp() {
        return valorEmp;
    }

    public void setValorEmp(int valorEmp) {
        this.valorEmp = valorEmp;
    }

    public int getQtdePar() {
        return qtdePar;
    }

    public void setQtdePar(int qtdePar) {
        this.qtdePar = qtdePar;
    }

    public double getTaxa() {
        return taxa;
    }

    public void setTaxa(double taxa) {
        this.taxa = taxa;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public void calcularValorFinal() {
        total = valorEmp * (1 + (taxa / 100));
    }

    @Override
    public String toString() {
        return "Emprestimo{" +
                "Valor do Empréstimo = " + valorEmp +
                ", Quantidade de Parcelas = " + qtdePar +
                ", Taxa = " + taxa +
                '}';
    }
}
