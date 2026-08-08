package ex03;

public class Conta {
    protected String numero, titular;
    protected double saldo;

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double depositar(int d) {
        saldo += d;
        return saldo;
    }
    public double sacar(int s) {
        saldo -= s;
        return saldo;
    }
    public double consultarSaldo() {
        return saldo;
    }
}
