public class OnlineNewspaperSubscription extends NewspaperSubscription {

    public void setAddress(String addr) {
        boolean hasAtSign = false;
        address = addr;
        for(int x = 0; x < addr.length(); ++x)
            if(addr.charAt(x) == '@')
                hasAtSign = true;
        if(hasAtSign)
            rate = 9.00;
        else
        {
            rate = 0;
            System.out.print("\nAddress must contain an at-sign (@)   ");
        }

    }
}
