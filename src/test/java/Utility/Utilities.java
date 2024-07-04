package Utility;

import java.sql.Timestamp;

public class Utilities {

    /* This method is used to get Timestamp and returns the string value of the current timestamp */

    public static long timeStamp(){
        Timestamp timestamp= new Timestamp(System.currentTimeMillis());
        long tmstmp = timestamp.getTime();
        return tmstmp;
    }

    public static void createEmail(){
        System.out.println("Your email is" + "email address."+String.valueOf(timeStamp())+"@gmail.com");
        String newEmail = "<email address>"+timeStamp()+"<@gmail.com>";
        PropertyFileHandler.writeProperty("username",newEmail);

    }

}
