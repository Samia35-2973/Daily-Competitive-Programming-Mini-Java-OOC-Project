package dailycompetitiveprogramming;

public class Guest {
    private static int guestSerial;
    private String guestName;
    Guest(){
        guestSerial++;
        guestName = "Guest" + (String.valueOf(guestSerial));
    }
    public String getGuestName(){
        return guestName;
    }
    public static int getGuestSerial(){
        return guestSerial;
    }
}
