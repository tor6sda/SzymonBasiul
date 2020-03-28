package sdajdbc.przyklad6;

import sdajdbc.przyklad5.Country;

public class Adress {

    private int adressId;
    private String adressStreet;
    private String adressBuildingNo;
    private String adressApartmentNo;
    private String adressCity;
    private String adressPostalCode;
    private Country adressCountry;


    public Adress() {

    }

    public Adress(int adressId, String adressStreet, String adressBuildingNo, String adressApartmentNo, String adressCity, String adressPostalCode, Country adressCountry) {
        this.adressId = adressId;
        this.adressStreet = adressStreet;
        this.adressBuildingNo = adressBuildingNo;
        this.adressApartmentNo = adressApartmentNo;
        this.adressCity = adressCity;
        this.adressPostalCode = adressPostalCode;
        this.adressCountry = adressCountry;
    }

    public int getAdressId() {
        return adressId;
    }

    public void setAdressId(int adressId) {
        this.adressId = adressId;
    }

    public String getAdressStreet() {
        return adressStreet;
    }

    public void setAdressStreet(String adressStreet) {
        this.adressStreet = adressStreet;
    }

    public String getAdressBuildingNo() {
        return adressBuildingNo;
    }

    public void setAdressBuildingNo(String adressBuildingNo) {
        this.adressBuildingNo = adressBuildingNo;
    }

    public String getAdressApartmentNo() {
        return adressApartmentNo;
    }

    public void setAdressApartmentNo(String adressApartmentNo) {
        this.adressApartmentNo = adressApartmentNo;
    }

    public String getAdressCity() {
        return adressCity;
    }

    public void setAdressCity(String adressCity) {
        this.adressCity = adressCity;
    }

    public String getAdressPostalCode() {
        return adressPostalCode;
    }

    public void setAdressPostalCode(String adressPostalCode) {
        this.adressPostalCode = adressPostalCode;
    }

    public Country getAdressCountry() {
        return adressCountry;
    }

    public void setAdressCountry(Country adressCountry) {
        this.adressCountry = adressCountry;
    }
}



