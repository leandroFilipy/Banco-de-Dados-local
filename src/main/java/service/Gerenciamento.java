package service;

import org.example.UsuarioDAO;
import view.Interface;

import java.util.List;

public class Gerenciamento {

    List <UsuarioDAO> listaUsuarios;

    public void gerenciar(Interface interfacezinha, int decisao1) {

        switch (decisao1){

            case 1:

                String nome = interfacezinha.escolhaNome();
                String email = interfacezinha.escolhaEmail();

                UsuarioDAO.inserir(nome,email);

            break;

            case 2:



                UsuarioDAO.mostrar();

                break;
        }
    }
}
