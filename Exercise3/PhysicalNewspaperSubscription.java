public class PhysicalNewspaperSubscription extends NewspaperSubscription {


    public void setAddress(String addr) {
        boolean hasDigit = false;
        address = addr;
        for(int x = 0; x < addr.length(); ++x)
            if(Character.isDigit(addr.charAt(x)))
                hasDigit = true;
        if(hasDigit)
            rate = 15.00;
        else
        {
            rate = 0;
            System.out.print("\nAddress must contain a digit   ");
        }
    }

}

