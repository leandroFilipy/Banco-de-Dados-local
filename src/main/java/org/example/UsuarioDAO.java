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
    }


