package exercice2;

import database.DBConnection;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class Exercice2 {
    public static int deleteData() {
        final String SQL = """
                    DELETE FROM company
                    WHERE id = 2
                """;
        int affectedRow = 0;

        try {
            Connection connection = new DBConnection().getDBConnection();
            Statement statement = connection.createStatement();
            affectedRow = statement.executeUpdate(SQL);

            if (affectedRow == 0) {
                System.out.println("Aucune ligne supprimée!");
            }

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return affectedRow;
    }
}
