package ex01;

public class PagamentoPix extends Pagamento{
    private String chavePix, Banco;

    public String getChavePix() {
        return chavePix;
    }

    public void setChavePix(String chavePix) {
        this.chavePix = chavePix;
    }

    public String getBanco() {
        return Banco;
    }

    public void setBanco(String banco) {
        Banco = banco;
    }

    @Override
    public double calcularTaxa() {
        return valor;
    }
}
