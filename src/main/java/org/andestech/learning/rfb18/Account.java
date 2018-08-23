package org.andestech.learning.rfb18;

import java.util.Random;

public class Account {

    private String account = "" ;

    public  Account(){
        Random random = new Random();
        for (int i = 0; i < 4; i++) {
            char start = 'A';
            account += (char)((random.nextInt(26)) + start);
        }
        long a = (long)(random.nextDouble()*1_000_000_000_000L);
        account += a;
        if(account.length()!=16){
            account += 9;
        }
    }

    public String getAccount() {
        return account;
    }
}
