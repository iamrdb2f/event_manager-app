package com.eventia.event_managerapp.database;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DatabaseConnection {

    public static Connection getConnection() throws IOException, SQLException, ClassNotFoundException {
        Properties props = new Properties();

        // Charger le fichier properties
        FileInputStream fis = new FileInputStream("src/main/resources/database.properties");
        props.load(fis);

        // Récupérer les valeurs du fichier properties
        String url = props.getProperty("jdbc.url");
        String username = props.getProperty("jdbc.username");
        String password = props.getProperty("jdbc.password");
        String driverClassName = props.getProperty("jdbc.driverClassName");

        // Charger le driver JDBC
        Class.forName(driverClassName);

        // Établir la connexion
        return DriverManager.getConnection(url, username, password);
    }
}
