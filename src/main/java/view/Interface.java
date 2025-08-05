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
        System.out.println("||1 - Deletar             ||");
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
}

