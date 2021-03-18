import org.sqlite.SQLiteDataSource;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateDB {
    public static void main(String[] args) {

        // create db
        SQLiteDataSource ds = null;
        try {
            ds = new SQLiteDataSource();
            ds.setUrl("jdbc:sqlite:test.db");
        }
        catch (Exception e)
        {

        }
        System.out.println("Database opened");

        //Connection establish
        try(Connection conn = ds.getConnection();){

        } catch (SQLException throwables) {
            System.exit(0);
        }

        System.out.println("Connection Established");
        String query = "CREATE TABLE IF NOT EXISTS test ( "+"ID INTEGER PRIMARY KEY " + "NAME TEXT NOT NULL )";

        try(Connection conn = ds.getConnection();){
            Statement stmt = conn.createStatement();
        } catch (SQLException throwables) {
            System.exit(0);
        }

    }
}
