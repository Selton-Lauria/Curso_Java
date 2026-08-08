import java.util.Scanner;
import java.util.Date;

public class Main {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner sc02 = new Scanner(System.in);
        String res = "Continuar";
        do {
            System.out.println("Oque deseja acessar? ");
            System.out.println("[1] Usuário / [2] Criador de conteúdo / [3] Empresa / [4] Sair");
            int x = sc.nextInt();
            switch (x) {
                case 1:
                    UsuarioComum uc = new UsuarioComum();
                    System.out.println("Qual o seu id? ");
                    uc.setId(sc.nextLong());
                    System.out.println("Qual o seu nome? ");
                    uc.setNome(sc02.nextLine());
                    System.out.println("Qual o seu email? ");
                    uc.setEmail(sc.next());
                    System.out.println("Qual a sua senha? ");
                    uc.setSenha(sc.next());
                    System.out.println("Qual a sua data de cadastro? ");
                    uc.setDataCadastro(sc.next());
                    uc.visualizarConteúdos();
                    System.out.println(uc);
                    System.out.println("Deseja atualizar seus dados? S/N");
                    String atualizar = sc.next();
                    if (atualizar.equalsIgnoreCase("S")) {
                        uc.atualizarDados();
                        System.out.println("Qual o seu novo nome? ");
                        uc.setNome(sc02.nextLine());
                        System.out.println("Qual o seu novo email? ");
                        uc.setEmail(sc.next());
                        System.out.println("Qual a sua nova senha? ");
                        uc.setSenha(sc.next());
                        System.out.println("Os dados foram atualizados!!");
                        System.out.println(uc);
                    } else if (atualizar.equalsIgnoreCase("N")) {
                        System.out.println("Sem mudança nos dados!");
                    } else {
                        System.out.println("Inválido");
                    }
                    System.out.println("Deseja ativar o premium? S/N");
                    String p = sc.next();
                    if (p.equalsIgnoreCase("S")) {
                        UsuarioPremium up = new UsuarioPremium();
                        up.ativarMonetizacao();
                        System.out.println("Qual a data de inicio do seu premium? ");
                        up.setDataInicioPremium(sc.next());
                        System.out.println("Qual é a data de fim do premium? ");
                        up.setDataFimPremium(sc.next());

                        System.out.println("Deseja desativar seu premium? S/N");
                        String desativar = sc.next();
                        if (desativar.equalsIgnoreCase("S")) {
                            System.out.println("Premium desativado!");
                            up.desativarMonetização();
                            break;
                        } else if (desativar.equalsIgnoreCase("N")) {
                            System.out.println("Saindo!");
                            break;
                        } else {
                            System.out.println("Inválido");
                            break;
                        }
                    }  else if (p.equalsIgnoreCase("N")) {
                        System.out.println("Saindo...");
                        break;
                    } else {
                        System.out.println("Inválido");
                        break;
                    }
                case 2:
                    CriadorConteudo cc = new CriadorConteudo();
                    System.out.println("Qual o seu id? ");
                    cc.setId(sc.nextLong());
                    System.out.println("Qual o seu nome? ");
                    cc.setNome(sc02.nextLine());
                    System.out.println("Qual o seu email? ");
                    cc.setEmail(sc.next());
                    System.out.println("Qual a sua senha? ");
                    cc.setSenha(sc.next());
                    System.out.println("Qual a sua descrição? ");
                    cc.setDescricao(sc.next());
                    System.out.println("Quantos seguidores você tem? ");
                    cc.setSeguidores(sc.nextInt());
                    System.out.println(cc);
                    cc.gerenciarConteudo();
                    cc.criarConteudo();
                    System.out.println("O que você é? ");
                    System.out.println("[1] Influenciador / [2] Streamer / [3] Fotografo");
                    int y = sc.nextInt();
                    switch (y) {
                        case 1:
                            Influenciador i = new Influenciador();
                            System.out.println("Qual o seu nicho? ");
                            i.setNicho(sc.next());
                            System.out.println("------Perfil------");
                            System.out.println(cc);
                            System.out.println("------------------");
                            System.out.println("Deseja fazer uma parceria? S/N");
                            String parceria = sc.next();
                            if (parceria.equalsIgnoreCase("S")) {
                                i.receberPatrocinio();
                            } else if (parceria.equalsIgnoreCase("N")) {
                                System.out.println("você não fez parceria...");
                            } else {
                                System.out.println("Inválido!!!");
                            }
                            System.out.println("Deseja encerrar o patrocinio? S/N");
                            String encerrar = sc.next();
                            if (encerrar.equalsIgnoreCase("S")) {
                                i.encerrarPatrocinio();
                            } else if (encerrar.equalsIgnoreCase("N")) {
                                System.out.println("Você continua sendo patrocinado");
                            } else {
                                System.out.println("Inválido!!!");
                            }
                            break;
                        case 2:
                            Streamer s = new Streamer();
                            System.out.println("Qual a sua plataforma? ");
                            s.setPlataforma(sc.next());
                            s.iniciarLive();
                            s.encerrarLive();
                            System.out.println("Deseja ganhar um novo patrocinio? S/N");
                            String patro = sc.next();
                            if (patro.equalsIgnoreCase("S")) {
                                s.receberPatrocinio();
                            } else if (patro.equalsIgnoreCase("N")){
                                System.out.println("Não recebeu patrocinio...");
                            } else {
                                System.out.println("Inválido");
                            }
                            System.out.println("Deseja encerrar um patrocinio? S/N");
                            String encerrar02 = sc.next();
                            if (encerrar02.equalsIgnoreCase("S")) {
                                s.encerrarPatrocinio();
                            } else if (encerrar02.equalsIgnoreCase("N")) {
                                System.out.println("Você mantém seu patrocinio");
                            } else {
                                System.out.println("Inválido!!!");
                            }
                            break;
                        case 3:
                            Fotografo f = new Fotografo();
                            System.out.println("Qual a sua especialidade? ");
                            f.setEspecialidade(sc.next());
                            f.publicarFotos();
                            System.out.println("Deseja iniciar uma live? S/N");
                            String iniciar = sc.next();
                            if (iniciar.equalsIgnoreCase("S")) {
                                f.iniciarLive();
                                f.encerrarlive();
                            } else if (iniciar.equalsIgnoreCase("N")) {
                                System.out.println("A live não foi iniciada...");
                            } else {
                                System.out.println("Inválido!!!");
                            }
                            break;
                    }
                    System.out.println ("Deseja atualizar suas informações? S/N");
                    String atualizacao = sc.next();
                    if (atualizacao.equalsIgnoreCase("S")) {
                        cc.atualizarDados();
                        System.out.println("Qual o seu novo nome? ");
                        cc.setNome(sc02.nextLine());
                        System.out.println("Qual o seu novo email? ");
                        cc.setEmail(sc.next());
                        System.out.println("Qual a sua nova senha? ");
                        cc.setSenha(sc.next());
                        System.out.println("Qual a sua nova descrição?");
                        cc.setDescricao(sc.next());
                        System.out.println("Quantos seguidores você tem atualmente? ");
                        cc.setSeguidores(sc.nextInt());
                        System.out.println("Dados atualizados!!!");
                        cc.exibirPerfil();
                        System.out.println(cc);
                    } else if (atualizacao.equalsIgnoreCase("N")) {
                        System.out.println("Datos atuais!");
                    } else {
                    System.out.println("Inválido!!!");
                    }
                    break;
                case 3:
                    Empresa e = new Empresa();
                    System.out.println("Qual o seu id? ");
                    e.setId(sc.nextLong());
                    System.out.println("Qual o seu nome? ");
                    e.setNome(sc02.nextLine());
                    System.out.println("Qual o seu email? ");
                    e.setEmail(sc.next());
                    System.out.println("Qual a sua senha? ");
                    e.setSenha(sc.next());
                    System.out.println("Qual o cnpj da empresa? ");
                    e.setCnpj(sc.next());
                    System.out.println("Qual a razão social da empresa? ");
                    e.setRazaoSocial(sc.next());
                    e.exibirInformacoes();
                    System.out.println("Sua empresa é verificada? S/N");
                    String verifi = sc.next();
                    if (verifi.equalsIgnoreCase("S")) {
                        EmpresaVerificada ep = new EmpresaVerificada();
                        System.out.println("Qual a data de verificação? ");
                        ep.setDataVerificacao(sc.next());
                        ep.selarVerificacao();
                    } else if (verifi.equalsIgnoreCase("N")) {
                        System.out.println("Empresa sem verificação!");
                    } else {
                        System.out.println("Inválido!!");
                    }
                    System.out.println("Deseja atualizar suas informações? S/N");
                    String att = sc.next();
                    if (att.equalsIgnoreCase("S")) {
                        e.atualizarDados();
                        System.out.println("Qual o seu novo nome? ");
                        e.setNome(sc02.nextLine());
                        System.out.println("Qual o seu novo email? ");
                        e.setEmail(sc.next());
                        System.out.println("Qual a sua nova senha? ");
                        e.setSenha(sc.next());
                        System.out.println("Qual a nova razão social da empresa? ");
                        e.setRazaoSocial(sc.next());
                        System.out.println("Dados atualizados!!!");
                        System.out.println(e);
                    } else if (att.equalsIgnoreCase("N")) {
                        System.out.println("Datos atuais!");
                    } else {
                        System.out.println("Inválido!!!");
                    }
                    break;
                case 4:
                    System.out.println("Saindo...");
                    res = "Sair";
                    break;
                default:
                    System.out.println("Inválido!!!");
            }
        } while (res.equalsIgnoreCase("Continuar"));
        sc.close();
        sc02.close();
    }
}
