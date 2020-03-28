package sdajdbc.przyklad5;

public class Country {
    private int countryId;
    private String countryName;
    private String countryAlias;
    public Country() {
    }
    public Country(String countryName, String countryAlias) {
        this.countryName = countryName;
        this.countryAlias = countryAlias;
    }
    public Country(int countryId, String countryName, String countryAlias) {
        this.countryId = countryId;
        this.countryName = countryName;
        this.countryAlias = countryAlias;
    }
    public int getCountryId() {
        return countryId;
    }
    public void setCountryId(int countryId) {
        this.countryId = countryId;
    }
    public String getCountryName() {
        return countryName;
    }
    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }
    public String getCountryAlias() {
        return countryAlias;
    }
    public void setCountryAlias(String countryAlias) {
        this.countryAlias = countryAlias;
    }
}
