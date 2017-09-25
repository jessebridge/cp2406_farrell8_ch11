public class DomesticDivision extends Division {
    String state;
    public DomesticDivision(String title, int number, String st){
        super(title,number);
        state = st;

    }


    public void display() {
        System.out.println("Domestic Division: " +
                divisionName + "  Acct #" + accountNumber +
                "\nLocated in " + state);
    }
}
