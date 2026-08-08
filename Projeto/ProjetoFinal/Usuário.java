public abstract class Usuário {
    protected long id;
    protected String nome, email, senha;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public abstract void exibirPerfil();
    public abstract void atualizarDados();

    @Override
    public String toString() {
        return "Usuário{" +
                "Id = " + id +
                ", Nome = '" + nome + '\'' +
                ", Email = '" + email + '\'' +
                ", Senha = '" + senha + '\'' +
                '}';
    }
}
