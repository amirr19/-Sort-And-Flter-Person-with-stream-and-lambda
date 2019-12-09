public class Address {
    private String alley;
    private String street;
    private int zone;
    private String city;
    private long postalCode;


    public Address(String alley, String street, int zone, String city, long postalCode) {
        this.alley = alley;
        this.street = street;
        this.zone = zone;
        this.city = city;
        this.postalCode = postalCode;
    }

    @Override
    public String toString() {
        return "Address{" +
                "alley='" + alley + '\'' +
                ", street='" + street + '\'' +
                ", zone='" + zone + '\'' +
                ", city='" + city + '\'' +
                ", postalCode=" + postalCode +
                '}';
    }

    public String getAlley() {
        return alley;
    }

    public void setAlley(String alley) {
        this.alley = alley;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public int getZone() {
        return zone;
    }

    public void setZone(int zone) {
        this.zone = zone;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public long getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(long postalCode) {
        this.postalCode = postalCode;
    }

}
