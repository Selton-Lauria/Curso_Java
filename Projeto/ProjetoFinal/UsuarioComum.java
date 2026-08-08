public class UsuarioComum extends Usuário {
    protected String dataCadastro;

    public String getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(String dataCadastro) {
        this.dataCadastro = dataCadastro;
    }

    @Override
    public String toString() {
        return "Usuario Comum{" +
                "Data de Cadastro='" + dataCadastro + '\'' +
                ", Id = " + id +
                ", Nome = '" + nome + '\'' +
                ", Email = '" + email + '\'' +
                ", Senha = '" + senha + '\'' +
                '}';
    }

    @Override
    public void exibirPerfil() {
        System.out.println("Exibindo perfil:");

    }

    @Override
    public void atualizarDados() {
        System.out.println("Atualizando dados!");

    }

    public void visualizarConteúdos() {
        System.out.println("Vendo os conteúdos!");
    }
}
