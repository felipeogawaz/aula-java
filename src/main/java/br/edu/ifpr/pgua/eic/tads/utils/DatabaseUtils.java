package br.edu.ifpr.pgua.eic.tads.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseUtils {
    
    // Altere para a URL do seu banco, se for diferente
    private static final String URL = "jdbc:sqlite:app.db"; 

    // Certifique-se de que "public static Connection getConnection()" está escrito assim
    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL);
    }
}
