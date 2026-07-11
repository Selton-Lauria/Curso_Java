package ex1;
public class Carro {
    private String marca, modelo, cor, placa;
    private int velocidade, ano;

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public int getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public void ligar() {
        System.out.println("Ligado...");
    }
    public void desligar() {
        System.out.println("Desligado...");
    }
    public void acelerar() {
        System.out.println("Acelerando...");
    }
    public void frear() {
        System.out.println("Freando...");
    }
}

