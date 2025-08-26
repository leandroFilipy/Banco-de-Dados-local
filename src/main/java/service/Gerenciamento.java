package service;

import org.example.UsuarioDAO;
import view.Interface;

import java.util.List;

public class Gerenciamento {

    List <UsuarioDAO> listaUsuarios;

    public void gerenciar(Interface interfacezinha, int decisao1) {

        switch (decisao1){

            case 1:

                int oqueCadastrar2 = interfacezinha.oqueCadastrar();

                if (oqueCadastrar2 == 1){

                    String nome = interfacezinha.escolhaNome();
                    String email = interfacezinha.escolhaEmail();

                    UsuarioDAO.inserir(nome,email);

                }else if(oqueCadastrar2 == 2) {

                    int idProduto2 = interfacezinha.escolhaIdProduto();
                    String nomeProduto2 = interfacezinha.escolhaNomeProduto();
                    double precoProduto2 = interfacezinha.escolhaPrecoProduto();
                    int quantidadeProduto2 = interfacezinha.escolhaQuantidadeProduto();

                    UsuarioDAO.inserirProduto(idProduto2,nomeProduto2,precoProduto2,quantidadeProduto2);

                }else if(oqueCadastrar2 == 3) {

                    int idPedido2 = interfacezinha.escolhaIdPedidos();
                    String clientePedido2 = interfacezinha.escolhaClientePedido();
                    String dataPedido2 = interfacezinha.escolhaDataPedido();
                    double precoPedido2 = interfacezinha.escolhaPrecoPedido();

                    UsuarioDAO.inserirPedido(idPedido2,clientePedido2,dataPedido2,precoPedido2);

                }else if(oqueCadastrar2 == 4) {

                    int idLivro2 = interfacezinha.escolhaIdLivro();
                    String tituloLivro2 = interfacezinha.escolhaTituloLivro();
                    String autorLivro2 = interfacezinha.escolhaAutorLivro();
                    int anoPublicacaoLivro2 = interfacezinha.escolhaanoPublicacaoLivro();

                    UsuarioDAO.inserirLivro(idLivro2, tituloLivro2, autorLivro2,anoPublicacaoLivro2);

                } else if (oqueCadastrar2 == 5) {

                    int idFuncionario2 = interfacezinha.escolhaIdFuncionario();
                    String nomeFuncionario2 = interfacezinha.escolhaNomeFuncionario();
                    String cargoFuncionario2 = interfacezinha.escolhaCargoFuncionario();
                    double salarioFuncionario2 = interfacezinha.escolhaSalarioFuncionario();

                    UsuarioDAO.inserirFuncionario(idFuncionario2,nomeFuncionario2,cargoFuncionario2,salarioFuncionario2);

                }else if(oqueCadastrar2 == 6) {



                }




                break;

            case 2:

                int oqueAtualizar2 = interfacezinha.oqueAtualizar();


                if (oqueAtualizar2 == 1){

                    int oqueAtualizarUsuario2 = interfacezinha.oqueAtualizarUsuario();

                    if (oqueAtualizarUsuario2 == 1){

                        String emailAtual2 = interfacezinha.emailAtual();
                        String novoNome2 = interfacezinha.atualizarNomeUsuario();

                        UsuarioDAO.atualizarNomeUsuario(novoNome2, emailAtual2);

                    } else if (oqueAtualizarUsuario2 == 2) {

                        String nomeAtual2 = interfacezinha.nomeAtual();
                        String novoEmail2 = interfacezinha.atualizarEmailUsuario();

                        UsuarioDAO.atualizarEmailUsuario(novoEmail2,nomeAtual2);

                    }

                }else if(oqueAtualizar2 == 2) {

                    int oqueAtualizarPedido2 = interfacezinha.oqueAtualizarProduto();

                        if (oqueAtualizarPedido2 == 1){



                        }


                }


                break;

            case 3:



                break;

            case 4:



                break;


            case 5:


                break;
        }
    }
}
