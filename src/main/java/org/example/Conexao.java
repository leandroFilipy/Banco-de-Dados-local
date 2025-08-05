package org.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {

    private static final String url = "jdbc:mysql://localhost:3306/MYSQLTESTE?useSSL=false&serverTimezone=UTC";
    private static final String user = "root";
    private static final String senha = "mysqlPW";

    public static Connection conectar () throws SQLException {
        return DriverManager.getConnection(url,user,senha);
    }


}
