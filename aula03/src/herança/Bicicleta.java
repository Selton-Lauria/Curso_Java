package herança;

public class Bicicleta extends Veiculo {
    private String tipoFreio;
    private int marchas;
    private boolean possuiCesta;

    public String getTipoFreio() {
        return tipoFreio;
    }

    public void setTipoFreio(String tipoFreio) {
        this.tipoFreio = tipoFreio;
    }

    public int getMarchas() {
        return marchas;
    }

    public void setMarchas(int marchas) {
        this.marchas = marchas;
    }

    public boolean isPossuiCesta() {
        return possuiCesta;
    }

    public void setPossuiCesta(boolean possuiCesta) {
        this.possuiCesta = possuiCesta;
    }

    public void pedalar() {
        System.out.println("Pedalando!");
    }
    public void tocarCampainha() {
        System.out.println("Tocando campainha!");
    }

    @Override
    public String toString() {
        return "Bicicleta{" +
                "tipoFreio='" + tipoFreio + '\'' +
                ", marchas=" + marchas +
                ", possuiCesta=" + possuiCesta +
                '}';
    }
}
