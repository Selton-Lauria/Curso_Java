package ex01;

public class PagamentoCartao extends Pagamento {
    private String numeroCartao;
    private int parcelas;
    private double total;

    public String getNumeroCartao() {
        return numeroCartao;
    }

    public void setNumeroCartao(String numeroCartao) {
        this.numeroCartao = numeroCartao;
    }

    public int getParcelas() {
        return parcelas;
    }

    public void setParcelas(int parcelas) {
        this.parcelas = parcelas;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    @Override
    public double calcularTaxa() {
        total = valor / parcelas;
        return total;
    }

}
