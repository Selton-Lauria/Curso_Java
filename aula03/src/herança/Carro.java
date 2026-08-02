package herança;

public class Carro extends Veiculo {
    private String placa;
    private int portas;

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public int getPortas() {
        return portas;
    }

    public void setPortas(int portas) {
        this.portas = portas;
    }

    public void abrirPortaMalas() {
        System.out.println("Porta-Malas aberto!");
    }

    @Override
    public String toString() {
        return "Carro{" +
                "placa='" + placa + '\'' +
                ", portas=" + portas +
                '}';
    }
}
