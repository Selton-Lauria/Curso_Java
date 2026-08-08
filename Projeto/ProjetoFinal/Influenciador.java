public class Influenciador extends CriadorConteudo implements Patrocinado {
    private String nicho;

    public String getNicho() {
        return nicho;
    }

    public void setNicho(String nicho) {
        this.nicho = nicho;
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
        System.out.println("Você ganhou um patrocinador!!!");
    }

    @Override
    public void encerrarPatrocinio() {
        System.out.println("Encerrando patrocinio!");
    }

    public void fazerParceria() {
        System.out.println("Você tentou ganhar um patrocinador!");
    }

    @Override
    public String toString() {
        return "Influenciador{" +
                "nicho='" + nicho + '\'' +
                ", descricao='" + descricao + '\'' +
                ", seguidores=" + seguidores +
                ", id=" + id +
                ", nome='" + nome + '\'' +
                ", email='" + email + '\'' +
                ", senha='" + senha + '\'' +
                '}';
    }
}
