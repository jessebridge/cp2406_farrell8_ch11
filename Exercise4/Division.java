public abstract class Division {

    String divisionName;
    int accountNumber;

    public Division(String title, int number){
        divisionName = title;
        accountNumber = number;
    }

    public abstract void display();
}
