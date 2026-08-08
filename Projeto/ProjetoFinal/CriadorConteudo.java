public class CriadorConteudo extends Usuário {
    protected String descricao;
    protected int seguidores;

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getSeguidores() {
        return seguidores;
    }

    public void setSeguidores(int seguidores) {
        this.seguidores = seguidores;
    }

    @Override
    public void exibirPerfil() {
        System.out.println("Exibindo perfil");
    }

    @Override
    public void atualizarDados() {
        System.out.println("Atualizando dados!");
    }

    public void criarConteudo() {
        System.out.println("Publicando vídeo no tiktok!");
    }

    public void gerenciarConteudo() {
        System.out.println("Gerenciando o conteúdo!!");
    }

    @Override
    public String toString() {
        return "Criador de Conteúdo{" +
                "Descricao = '" + descricao + '\'' +
                ", Seguidores = " + seguidores +
                ", Id = " + id +
                ", Nome = '" + nome + '\'' +
                ", Email = '" + email + '\'' +
                ", Senha = '" + senha + '\'' +
                '}';
    }
}
