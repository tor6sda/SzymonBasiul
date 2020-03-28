package sdajdbc;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class przyklad3 {
    public static void main(String[] args) {
        String sqlUpdate = "UPDATE adress " +
                "SET ADD_BUILDING_NO = ? " +
                "WHERE ADD_POSTAL_CODE = ?";
        String selectQuery = "Select * from adress";
        try (PreparedStatement preparedStatement = DatabaseConnection.getInstance().getConnection().prepareStatement(sqlUpdate)) {
            preparedStatement.setString(1,"10");
            preparedStatement.setString(2,"38600");
            int countUpdateRecords = preparedStatement.executeUpdate();
            System.out.println("Zaktualizowano "+countUpdateRecords+" wierszy");
        } catch (SQLException e) {
            e.printStackTrace();
        }

        try(PreparedStatement statement = DatabaseConnection.getInstance().getConnection().prepareStatement(selectQuery)){
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()){
                int id = resultSet.getInt("ADD_ID");
                String street = resultSet.getString("ADD_STREET");
                String buildingNo = resultSet.getString("ADD_BUILDING_NO");
                String postalCode = resultSet.getString("ADD_POSTAL_CODE");
                System.out.println("Adress ID: "+id+"Street ID: "+street+" Building No.: "+buildingNo+" Postal Code: "+postalCode);
            }
            System.out.println();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
