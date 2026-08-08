public class Streamer extends CriadorConteudo implements Patrocinado {
    private String plataforma;

    public String getPlataforma() {
        return plataforma;
    }

    public void setPlataforma(String plataforma) {
        this.plataforma = plataforma;
    }

    @Override
    public void exibirPerfil() {
        super.exibirPerfil();
    }

    @Override
    public void atualizarDados() {
        super.atualizarDados();
    }

    @Override
    public void criarConteudo() {
        super.criarConteudo();
    }

    @Override
    public void gerenciarConteudo() {
        super.gerenciarConteudo();
    }

    @Override
    public void receberPatrocinio() {
        System.out.println("Você ganhou um patrocinio");
    }

    @Override
    public void encerrarPatrocinio() {
        System.out.println("Gerenciando o conteúdo!!");
    }

    public void iniciarLive(){
        System.out.println("Começou a live!!!");
    }
    public void encerrarLive(){
        System.out.println("Depois de algumas horas....");
        System.out.println("A live acabou!");
    }
}
