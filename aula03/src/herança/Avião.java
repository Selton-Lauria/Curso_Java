package herança;

public class Avião extends Veiculo{
    private String companhia;
    private int motores, altitude;

    public String getCompanhia() {
        return companhia;
    }

    public void setCompanhia(String companhia) {
        this.companhia = companhia;
    }

    public int getMotores() {
        return motores;
    }

    public void setMotores(int motores) {
        this.motores = motores;
    }

    public int getAltitude() {
        return altitude;
    }

    public void setAltitude(int altitude) {
        this.altitude = altitude;
    }

    public void decolar() {
        System.out.println("Avião decolando!");
    }
    public void pousar() {
        System.out.println("Avião pousando!");
    }
    public void abrirTremPouso() {
        System.out.println("Trem de Pouso aberto!");
    }

    @Override
    public String toString() {
        return "Avião{" +
                "companhia='" + companhia + '\'' +
                ", motores=" + motores +
                ", altitude=" + altitude +
                '}';
    }
}
