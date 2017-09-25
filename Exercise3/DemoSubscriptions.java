public class DemoSubscriptions {

        public static void main(String args[])
        {
            PhysicalNewspaperSubscription pnsGood = new PhysicalNewspaperSubscription();
            OnlineNewspaperSubscription onsGood = new OnlineNewspaperSubscription();
            PhysicalNewspaperSubscription pnsBad = new PhysicalNewspaperSubscription();
            OnlineNewspaperSubscription onsBad = new OnlineNewspaperSubscription();
            pnsGood.setSubscrberName("DePalma");
            pnsGood.setAddress("23 Oak Avenue");
            display(pnsGood);
            pnsBad.setSubscrberName("Gomez");
            pnsBad.setAddress("Maple Street");
            display(pnsBad);
            onsGood.setSubscrberName("Carter");
            onsGood.setAddress("carter@myMail.com");
            display(onsGood);
            onsBad.setSubscrberName("Lee");
            onsBad.setAddress("Elm Street");
            display(onsBad);
        }

    public static void display(NewspaperSubscription n)
    {
        System.out.println("Name: " + n.getSubscrberName() + "   Address: " +
                n.getAddress() + "   Rate: " + n.getRate() + "\n");
    }
}

