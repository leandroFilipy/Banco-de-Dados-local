package org.example;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UsuarioDAO {

    public static void inserir(String nome, String email) {

        String query =  "INSERT INTO usuarios (nome,email) VALUES(?,?)";

        try(Connection conn = Conexao.conectar();
            PreparedStatement stmt = conn.prepareStatement(query)) {

            stmt.setString(1,  nome);
            stmt.setString(2,  email);
            stmt.executeUpdate();

            System.out.println("Usuário inserido com sucesso");

        }catch (SQLException e){
            e.printStackTrace();
        }

    }

    public static void mostrar(){

        String query =  "SELECT nome from usuarios;";

        try (Connection conn = Conexao.conectar()){

            PreparedStatement stmt = conn.prepareStatement(query);
            ResultSet rs = stmt.executeQuery();

            while(rs.next()){

                String nome1 = rs.getString("nome");

                System.out.println("nome: " + nome1);
            }

        }catch (SQLException e){
            e.printStackTrace();
        }



        }

    public static void deletar(String id1){

        String query =  "DELETE FROM usuarios WHERE id = ?;";

        try (Connection conn = Conexao.conectar()){

            PreparedStatement stmt = conn.prepareStatement(query);
            ResultSet rs = stmt.executeQuery();

            while(rs.next()){

                String nome1 = rs.getString("id1");

                System.out.println("ID: " + id1);
            }

        }catch (SQLException e){
            e.printStackTrace();
        }



    }

    public static void inserirProduto(int id, String nome, double preco, int quantidade) {

        String query =  "INSERT INTO produtos (id,nome,preco,quantidade) VALUES(?,?,?,?)";

        try(Connection conn = Conexao.conectar();
            PreparedStatement stmt = conn.prepareStatement(query)) {

            stmt.setInt(1,  id);
            stmt.setString(2,  nome);
            stmt.setDouble(3,  preco);
            stmt.setInt(4,  quantidade);
            stmt.executeUpdate();

            System.out.println("produto inserido com sucesso");

        }catch (SQLException e){
            e.printStackTrace();
        }

    }

    public static void inserirPedido(int id, String cliente, String data_pedido, double total) {

        String query =  "INSERT INTO pedidos (id,cliente,data_pedido,total) VALUES(?,?,?,?)";

        try(Connection conn = Conexao.conectar();
            PreparedStatement stmt = conn.prepareStatement(query)) {

            stmt.setInt(1,  id);
            stmt.setString(2,  cliente);
            stmt.setString(3,  data_pedido);
            stmt.setDouble(4,  total);
            stmt.executeUpdate();

            System.out.println("pedido inserido com sucesso");

        }catch (SQLException e){
            e.printStackTrace();
        }

    }

    public static void inserirLivro(int id, String titulo, String autor, int anoPublicacao) {

        String query =  "INSERT INTO livros (id,titulo,autor,anoPublicacao) VALUES(?,?,?,?)";

        try(Connection conn = Conexao.conectar();
            PreparedStatement stmt = conn.prepareStatement(query)) {

            stmt.setInt(1,  id);
            stmt.setString(2,  titulo);
            stmt.setString(3,  autor);
            stmt.setDouble(4,  anoPublicacao);
            stmt.executeUpdate();

            System.out.println("Livro inserido com sucesso");

        }catch (SQLException e){
            e.printStackTrace();
        }

    }

    public static void inserirFuncionario(int id, String nome, String cargo, double salario) {

        String query =  "INSERT INTO funcionarios (id,nome,cargo,salario) VALUES(?,?,?,?)";

        try(Connection conn = Conexao.conectar();
            PreparedStatement stmt = conn.prepareStatement(query)) {

            stmt.setInt(1,  id);
            stmt.setString(2,  nome);
            stmt.setString(3,  cargo);
            stmt.setDouble(4,  salario);
            stmt.executeUpdate();

            System.out.println("Funcionário inserido com sucesso");

        }catch (SQLException e){
            e.printStackTrace();
        }

    }

    public static void atualizarNomeUsuario(String novoNome, String email) {
        String sql = "UPDATE usuarios SET nome = ? WHERE email = ?";

        try (Connection conn = Conexao.conectar();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, novoNome);
            stmt.setString(2, email);
            stmt.executeUpdate();

            System.out.println("Nome atualizado com sucesso!");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void atualizarEmailUsuario(String novoEmail, String nome) {
        String sql = "UPDATE usuarios SET nome = ? WHERE email = ?";

        try (Connection conn = Conexao.conectar();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, novoEmail);
            stmt.setString(2, nome);
            stmt.executeUpdate();

            System.out.println("Email atualizado com sucesso!");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void atualizarIdProduto(String novoEmail, String nome) {
        String sql = "UPDATE usuarios SET nome = ? WHERE email = ?";

        try (Connection conn = Conexao.conectar();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, novoEmail);
            stmt.setString(2, nome);
            stmt.executeUpdate();

            System.out.println("Email atualizado com sucesso!");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


    }


