/**
 * Created by edgar pino on 7/6/15.
 */
public class Address {
    private String streetAddress, city, state;
    private long zipCode;

    //constructor
    public Address(String street, String town, String st, long zip) {
        streetAddress = street;
        city = town;
        state = st;
        zipCode = zip;
    }

    //return string
    public String toString() {
        String result;
        result = streetAddress + "\n";
        result += city + ", " + state + " " + zipCode;

        return result;
    }
}
