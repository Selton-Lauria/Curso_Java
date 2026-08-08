package ex02;

public class Carro extends Veiculo implements Motorizado {
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
    public void ligar() {
        System.out.println("Ligando o motor");
    }

    @Override
    public void desligar() {
        System.out.println("Desligando o motor");
    }
}
