package sdajdbc;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class zadanie2 {
    public static void main(String[] args) {
        /*
         * Napisz program który dopisze do Produktów o id 1,3,5 frazę " - BRAK" -
         * skorzystaj z sparametryzowanego PreparedStatement. Wyświetl ile rekordów zostało zaktualizowanych
         * */
        StringBuilder stringBuilder = new StringBuilder("?");
        String questionMark = ",?";
        int tablica[] = new int[]{1, 3, 5};

        for (int i = 1; i < tablica.length; i++) {
            stringBuilder.append(questionMark);
        }
        String query = "UPDATE product " +
                "SET PRO_DESCRIPTION = CONCAT(PRO_DESCRIPTION, ?)" +
                "WHERE PRO_ID in(" + stringBuilder.toString() + ")";

        try (PreparedStatement preparedStatement = DatabaseConnection.getInstance().getConnection().prepareStatement(query)) {
            preparedStatement.setString(1, " -BRAK-");
            for (int i = 0; i < tablica.length; i++) {
                preparedStatement.setInt(i + 2, tablica[i]);
            }
                int countUpdateRecords = preparedStatement.executeUpdate();
                System.out.println("Zaktualizowano " + countUpdateRecords + " wierszy");
            } catch(SQLException e){
                e.printStackTrace();
            }
        }

    }

