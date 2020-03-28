package sdajdbc.przyklad6;

import sdajdbc.DatabaseConnection;
import sdajdbc.przyklad5.Country;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class przyklad6 {
    public static void main(String[] args) {
        String sqlSelect = "SELECT * from adress join country on add_co_id = co_id";
        List<Adress> adressList = new ArrayList();
        try(PreparedStatement preStatement = DatabaseConnection.getInstance().getConnection().prepareStatement(sqlSelect)) {
            ResultSet resultSet = preStatement.executeQuery();
            while (resultSet.next()) {
                Adress adress = new Adress();
                adress.setAdressId(resultSet.getInt("ADD_ID"));
                adress.setAdressStreet(resultSet.getString("ADD_STREET"));
                adress.setAdressApartmentNo(resultSet.getString("ADD_APARTMENT_NO"));
                adress.setAdressBuildingNo(resultSet.getString("ADD_BUILDING_NO"));
                adress.setAdressCity(resultSet.getString("ADD_CITY"));
                adress.setAdressPostalCode(resultSet.getString("ADD_POSTAL_CODE"));
                adress.setAdressCountry(
                        new Country(
                                resultSet.getInt("CO_ID"),
                                resultSet.getString("CO_NAME"),
                                resultSet.getString("CO_ALIAS")
                        )
                );
                adressList.add(adress);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        adressList.forEach(address ->
                System.out.println("Adress Id: "+address.getAdressId()+
                        " Adress Street: "+address.getAdressStreet()+
                        " Adress City: " +address.getAdressCity()+
                        " Adress Country: "+address.getAdressCountry().getCountryName()));
    }
}