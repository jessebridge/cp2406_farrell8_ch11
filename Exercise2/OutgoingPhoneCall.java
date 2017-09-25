public class OutgoingPhoneCall extends PhoneCall {

    public final static double RATE = 0.04;
    public int minutes;

    public OutgoingPhoneCall(String num, int mins){
        super(num);
        minutes = mins;
        price = minutes * RATE;
    }


    public String getPhoneNumber() {
        return phoneNumber;
    }

    public double getPrice() {
        return price;
    }

    public void getInfo() {
        System.out.println("Outgoing phone call to " +
                getPhoneNumber() + " " + RATE +
                " per minute at " + minutes +
                " minutes. Total is $" +
                getPrice());

    }
}
