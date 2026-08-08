public class Fotografo extends CriadorConteudo implements Transmitivel {
    private String especialidade;

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
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
    public void iniciarLive() {
        System.out.println("Iniciando a live!!!");
    }

    @Override
    public void encerrarlive() {
        System.out.println("Algumas horas depois...");
        System.out.println("Encerrando a live!!");
    }

    public void publicarFotos() {
        System.out.println("As fotos foram publicadas!");
    }
}
