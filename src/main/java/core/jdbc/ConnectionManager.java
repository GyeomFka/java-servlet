package core.jdbc;

import controller.CreateUserController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.sql.DataSource;

import java.sql.*;

public class ConnectionManager {
    private static final Logger logger = LoggerFactory.getLogger(ConnectionManager.class);
    private static final String DB_DRIVER = "org.h2.Driver";
    private static final String DB_URL = "jdbc:h2:tcp://localhost/~/local";
    private static final String DB_USERNAME = "sa";
    private static final String DB_PW = "920214";

    public static Connection getConnection() {
        try {
            Class.forName(DB_DRIVER);
            return DriverManager.getConnection(DB_URL, DB_USERNAME, DB_PW);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }catch (SQLException e) {
            throw new IllegalStateException(e);
        }
    }
}
