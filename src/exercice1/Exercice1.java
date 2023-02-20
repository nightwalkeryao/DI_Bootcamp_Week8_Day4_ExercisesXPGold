package exercice1;

import database.DBConnection;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class Exercice1 {
    public static int updateData() {
        final String SQL = """
                    UPDATE company
                    SET salary = 25000.00
                    WHERE id = 1
                """;
        int affectedRow = 0;

        try {
            Connection connection = new DBConnection().getDBConnection();
            Statement statement = connection.createStatement();
            affectedRow = statement.executeUpdate(SQL);

            if (affectedRow == 0) {
                System.out.println("Aucune ligne modifiée!");
            }

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return affectedRow;
    }
}
