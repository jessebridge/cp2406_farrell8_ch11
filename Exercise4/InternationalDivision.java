public class InternationalDivision extends Division {

    String country, language;

    public InternationalDivision(String title, int number, String city, String lang) {
        super(title, number);
        country = city;
        language = lang;
    }

    public void display() {
        System.out.println("International Division: " + divisionName +
                "  Acct #" + accountNumber + "\nLocated in " + country +
                " Language is " + language);
    }
}
