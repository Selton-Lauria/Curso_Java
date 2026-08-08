public class EmpresaVerificada extends Empresa {
    private String dataVerificacao;

    public String getDataVerificacao() {
        return dataVerificacao;
    }

    public void setDataVerificacao(String dataVerificacao) {
        this.dataVerificacao = dataVerificacao;
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
    public void exibirInformacoes() {
        super.exibirInformacoes();
    }

    public void selarVerificacao() {
        System.out.println("Selando a verificação");
    }
}
