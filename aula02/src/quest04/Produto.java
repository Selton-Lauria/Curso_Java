package quest04;
public class Produto {
    private String nome;
    private int quant;
    private double preco, total;

    public Produto() {

    }

    public Produto(int quant, double preco) {
        this.quant = quant;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQuant() {
        return quant;
    }

    public void setQuant(int quant) {
        this.quant = quant;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
    public void calcular() {
        total = preco * quant;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }
}
