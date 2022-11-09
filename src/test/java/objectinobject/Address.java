package objectinobject;

public class Address {
    private String state;
    private String country;
    private Abc abc;

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String Country) {
        country = Country;
    }

    public Abc getAbc() {
        return abc;
    }

    public void setAbc(Abc abc) {
        this.abc = abc;
    }
}
