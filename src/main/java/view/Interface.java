package view;
import org.example.*;

import java.util.Scanner;

public class Interface {

    Scanner read = new Scanner(System.in);

    public int menu() {

        System.out.println("============================");
        System.out.println("||      Boas Vindas       ||");
        System.out.println("||------------------------||");
        System.out.println("||1 - Cadastrar           ||");
        System.out.println("||2 - Vizualizar          ||");
        System.out.println("||3 - Atualizar           ||");
        System.out.println("||4 - Cadastrar Produto   ||");
        System.out.println("||------------------------||");
        System.out.print("||Insira  sua resposta: ");
        int decisao = read.nextInt();

        return decisao;


    }

    public String escolhaNome() {

        read.nextLine();

        System.out.println("||------------------------||");
        System.out.print("||Insira  o nome de usuário: ");
        String nome = read.nextLine();


        return nome;
    }

    public String escolhaEmail() {

        System.out.println("||-------------------------||");
        System.out.print("||Insira  o email de usuário: ");
        String email = read.nextLine();

        return email;
    }

    public int escolhaIdProduto() {

        System.out.println("||-------------------------||");
        System.out.print("||Insira  o id do produto: ");
        int idProduto = read.nextInt();

        return idProduto;
    }
    public String escolhaNomeProduto() {

        System.out.println("||-------------------------||");
        System.out.print("||Insira  o nome do produto: ");
        String nomeProduto = read.next();

        return nomeProduto;
    }
    public double escolhaPrecoProduto() {

        System.out.println("||-------------------------||");
        System.out.print("||Insira  o preço do produto: ");
        double precoProduto = read.nextDouble();

        return precoProduto;
    }
    public int escolhaQuantidadeProduto() {

        System.out.println("||-------------------------||");
        System.out.print("||Insira  a quantidade do produto: ");
        int quantidadeProduto = read.nextInt();

        return quantidadeProduto;
    }
    public int oqueCadastrar() {

        System.out.println("==============================");
        System.out.println("||        Cadastrar         ||");
        System.out.println("||--------------------------||");
        System.out.println("||1 - Cadastrar Usuário     ||");
        System.out.println("||2 - Cadastrar Produtos    ||");
        System.out.println("||3 - Cadastrar Pedidos     ||");
        System.out.println("||4 - Cadastrar Livros      ||");
        System.out.println("||5 - Cadastrar Funcionários||");
        System.out.println("||--------------------------||");
        System.out.print("||Insira  sua resposta: ");
        int oqueCadastrar = read.nextInt();

        return oqueCadastrar;
    }



    public int escolhaIdPedidos() {

        System.out.println("||-------------------------||");
        System.out.print("||Insira  o id do Produto: ");
        int idPedido = read.nextInt();

        return idPedido;
    }
    public String escolhaClientePedido() {

        System.out.println("||-------------------------||");
        System.out.print("||Insira  o cliente do pedido: ");
        String clientePedido = read.next();

        return clientePedido;
    }
    public String escolhaDataPedido() {

        System.out.println("||-------------------------||");
        System.out.print("||Insira  a data do pedido, deve ser em formato 00/00/0000: ");
        String dataPedido = read.next();

        return dataPedido;
    }
    public double escolhaPrecoPedido() {

        System.out.println("||-------------------------||");
        System.out.print("||Insira  o preço total do pedido: ");
        double precoPedido = read.nextDouble();

        return precoPedido;
    }
    public int escolhaIdLivro() {

        System.out.println("||-------------------------||");
        System.out.print("||Insira  o id do livro: ");
        int idLivro = read.nextInt();

        return idLivro;
    }
    public String escolhaTituloLivro() {

        System.out.println("||-------------------------||");
        System.out.print("||Insira  o título do livro: ");
        String tituloLivro = read.next();

        return tituloLivro;
    }
    public String escolhaAutorLivro() {

        System.out.println("||-------------------------||");
        System.out.print("||Insira  o autor do livro: ");
        String autorLivro = read.next();

        return autorLivro;
    }
    public int escolhaanoPublicacaoLivro() {

        System.out.println("||-------------------------||");
        System.out.print("||Insira  o ano de publicação do livro: ");
        int anoPublicacaoLivro = read.nextInt();

        return anoPublicacaoLivro;
    }


    public int escolhaIdFuncionario() {

        System.out.println("||-------------------------||");
        System.out.print("||Insira o id do funcionário: ");
        int idFuncionario = read.nextInt();

        return idFuncionario;
    }

    public String escolhaNomeFuncionario() {

        System.out.println("||-------------------------||");
        System.out.print("||Insira  o nome do funcionário: ");
        String nomeFuncionario = read.next();

        return nomeFuncionario;
    }
    public String escolhaCargoFuncionario() {

        System.out.println("||-------------------------||");
        System.out.print("||Insira  o cargo do funcionário: ");
        String cargoFuncionario = read.next();

        return cargoFuncionario;
    }
    public double escolhaSalarioFuncionario() {

        System.out.println("||-------------------------||");
        System.out.print("||Insira  o salário do funcionário: ");
        double salarioFuncionario = read.nextDouble();

        return salarioFuncionario;
    }

    public int oqueAtualizar(){

        System.out.println("===============================");
        System.out.println("||         Atualizar          ||");
        System.out.println("||----------------------------||");
        System.out.println("||1 - Atualizar Usuário      ||");
        System.out.println("||2 - Atualizar Produtos     ||");
        System.out.println("||3 - Atualizar Pedidos      ||");
        System.out.println("||4 - Atualizar Livros       ||");
        System.out.println("||5 - Atualizar Funcionários ||");
        System.out.println("||----------------------------||");
        System.out.print("||Insira  sua resposta: ");
        int oqueAtualizar = read.nextInt();

        return oqueAtualizar;
    }

    public int oqueAtualizarUsuario(){

        System.out.println("===============================");
        System.out.println("||         Atualizar          ||");
        System.out.println("||----------------------------||");
        System.out.println("||1 - Atualizar Nome:         ||");
        System.out.println("||2 - Atualizar Email:        ||");
        System.out.print("||Insira  sua resposta: ");
        int oqueAtualizarUsuario = read.nextInt();

        return oqueAtualizarUsuario;
    }
    public String emailAtual(){

        System.out.println("================================");
        System.out.println("||         Atualizar          ||");
        System.out.println("||----------------------------||");
        System.out.print("||Insira  o nome do seu email atual: ");
        String emailAtual = read.next();

        return emailAtual;
    }
    public String atualizarNomeUsuario(){

        System.out.println("================================");
        System.out.println("||         Atualizar          ||");
        System.out.println("||----------------------------||");
        System.out.print("||Insira  o novo nome: ");
        String atualizarNomeUsuario = read.next();

        return atualizarNomeUsuario;
    }
    public String nomeAtual(){

        System.out.println("================================");
        System.out.println("||         Atualizar          ||");
        System.out.println("||----------------------------||");
        System.out.print("||Insira o seu nome atual: ");
        String nomeAtual = read.next();

        return nomeAtual;
    }
    public String atualizarEmailUsuario(){

        System.out.println("================================");
        System.out.println("||         Atualizar          ||");
        System.out.println("||----------------------------||");
        System.out.print("||Insira  o novo Email: ");
        String atualizarEmailUsuario = read.next();

        return atualizarEmailUsuario;
    }
    public int oqueAtualizarProduto(){

        System.out.println("===============================");
        System.out.println("||         Atualizar          ||");
        System.out.println("||----------------------------||");
        System.out.println("||1 - Atualizar id:           ||");
        System.out.println("||2 - Atualizar nome:         ||");
        System.out.println("||1 - Atualizar preço:        ||");
        System.out.println("||2 - Atualizar quantidade:   ||");
        System.out.print("||Insira  sua resposta: ");
        int oqueAtualizarPedido = read.nextInt();

        return oqueAtualizarPedido;
    }



}

