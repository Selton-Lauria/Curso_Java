public class Empresa extends Usuário {
    protected String cnpj, razaoSocial;

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    @Override
    public void exibirPerfil() {
        System.out.println("Exibindo informações da empresa!");
    }

    @Override
    public void atualizarDados() {
        System.out.println("Atualizando os dados da empresa!");
    }

    public void exibirInformacoes() {
        System.out.println("Informações!!!");
        System.out.println("Id: " + id);
        System.out.println("Nome: " + nome);
        System.out.println("Email: " + email);
        System.out.println("Senha: " + senha);
        System.out.println("CNPJ: " + cnpj);
        System.out.println("Razão Social: " + razaoSocial);
        System.out.println("-----------------------------------");
    }
}
