public class IncomingPhoneCall extends PhoneCall {
 public final static double RATE = 0.02;

 public IncomingPhoneCall(String num){
     super(num);
     price = RATE;

 }


    @Override
    public String getPhoneNumber() {
        return phoneNumber;
    }

    @Override
    public double getPrice() {
        return price;
    }

    public void getInfo(){
        System.out.println("Incoming phone call from " +
                getPhoneNumber() + " " + RATE + " cost per call. Total is $" +
                + getPrice());
    }

}
