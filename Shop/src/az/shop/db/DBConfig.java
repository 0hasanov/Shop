package az.shop.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConfig {

   static Connection connection;


    public static Connection getConnection() throws SQLException
    {
        connection =  DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres", "postgres", "noreturns13");
        return connection;
    }

    public static void closeConnection( Connection con ) throws SQLException
    {
        if ( con != null )
        {
            con.close();
        }
    }



}
