public class UsuarioPremium extends UsuarioComum implements Monetizavel {
    private String dataInicioPremium, dataFimPremium;

    public String getDataInicioPremium() {
        return dataInicioPremium;
    }

    public void setDataInicioPremium(String dataInicioPremium) {
        this.dataInicioPremium = dataInicioPremium;
    }

    public String getDataFimPremium() {
        return dataFimPremium;
    }

    public void setDataFimPremium(String dataFimPremium) {
        this.dataFimPremium = dataFimPremium;
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
    public void visualizarConteúdos() {
        super.visualizarConteúdos();
    }

    @Override
    public void ativarMonetizacao() {
        System.out.println("Ativando monetização!");
    }

    @Override
    public void desativarMonetização() {
        System.out.println("Desativando monetização!");
    }

    public void ativarPremium() {
        System.out.println("Premium ativado!");
    }
}
