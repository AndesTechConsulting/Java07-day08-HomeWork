package org.andestech.learning.rfb18;

import java.util.Random;

public class Accounts {

    String account = "";

    public Accounts() {
        Random randomaccount = new Random();
        for (int b=0; b < 4; b++) {
            char begun = 'C';
            account += (char) ((randomaccount.nextInt(20)) + begun);
        }
        long c = (long) (randomaccount.nextDouble() * 1_000_000_000_000L);
        account += c;
        if (account.length() != 16) {
            account += 9;

        }

        }
public String getAccount(){
    return account;}
}