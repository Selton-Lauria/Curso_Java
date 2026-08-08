package ex01;

public abstract class Pagamento {
    protected String data, status;
    protected double valor;

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public abstract double calcularTaxa();
    public void processarPagamento() {
        System.out.println("Processando pagamento...");
        System.out.println("Pagamento realizado!");
    }
    public void emitirComprovante() {
        System.out.println("Data=" + data);
        System.out.println("Valor=" + valor);
        System.out.println("Status=" + status);
    }
}
