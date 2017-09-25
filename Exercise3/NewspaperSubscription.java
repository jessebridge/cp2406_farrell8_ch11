public abstract class NewspaperSubscription {

    protected String subscrberName, address;
    double rate;

    public String getSubscrberName(){
        return subscrberName;
    }
    public void setSubscrberName(String n){
        subscrberName = n;

    }
    public String getAddress() {
        return address;
    }
    public double getRate(){
        return rate;
    }
    public abstract void setAddress(String s);
}
