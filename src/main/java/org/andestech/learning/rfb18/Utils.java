package org.andestech.learning.rfb18;

import java.util.Random;

public class Utils
{
    public static String regionGenerator ()
    {
        String letters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        StringBuffer output = new StringBuffer();
        Random rnd = new Random();
        output.append(letters.charAt(rnd.nextInt(25)));
        output.append(letters.charAt(rnd.nextInt(25)));
        output.append(letters.charAt(rnd.nextInt(25)));
        return output.toString();
    }

    public static String countNumberGenerator ()
    {
        StringBuffer longID = new StringBuffer("");
        longID.append((int)(Math.random()*10000000));
        longID.append((int)(Math.random()*1000000));
        if (longID.length() < 12)
        {
            Random rnd = new Random();
            int i = 12 - longID.length();
            while(i > 0 )
            {
                longID.append(rnd.nextInt(10));
                i--;
            }
        } else if(longID.length() > 12)
        {
            longID.delete(12, longID.length());
        }

        return longID.toString();
    }
}
