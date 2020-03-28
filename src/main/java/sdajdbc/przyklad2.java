package sdajdbc;

import java.sql.*;

public class przyklad2 {
    public static void main(String[] args) {
        String query = "Select * from adress where add_city like \"%\"?\"%\";";
        try (
                PreparedStatement preStatement = DatabaseConnection.getInstance().getConnection().prepareStatement(query)
        ) {
            preStatement.setString(1,"Paris");
            ResultSet resultSet = preStatement.executeQuery();
            while (resultSet.next()) {
                int id = resultSet.getInt("ADD_ID");
                String street = resultSet.getString("ADD_STREET");
                String city = resultSet.getString("ADD_CITY");
                System.out.println("Adress ID: "+id+" Adress Street "+street+" Adress City: "+city);
            }
        } catch (
                SQLException e) {
            e.printStackTrace();
        }

    }
}

