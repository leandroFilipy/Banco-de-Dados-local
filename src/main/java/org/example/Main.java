package org.example;

import service.Gerenciamento;
import view.Interface;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);

        Gerenciamento gerenciamento = new Gerenciamento();
        Interface interfacezinha = new Interface();

        /*System.out.println("Insira seu nome: ");
        String nome = read.nextLine();

        System.out.println("Insira seu email: ");
        String email = read.nextLine();


        UsuarioDAO dao = new UsuarioDAO();

        dao.inserir(nome,email);

        System.out.println("Deseja vizualizar usuários?");
        String decisao = read.nextLine();

        if (decisao.equals("sim")){

            dao.mostrar();
        } else if (decisao.equals("não")) {

            System.out.println("Beleza");
        }

    }*/
    while(true){

        int decisao1 = interfacezinha.menu();

        gerenciamento.gerenciar(interfacezinha,decisao1);

    }


    }
    }
