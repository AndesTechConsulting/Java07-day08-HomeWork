package org.andestech.learning.rfb18;


import java.io.*;
import java.util.ArrayList;
import java.util.Comparator;

public class App
{
    public static void main( String[] args )
    {
        Account ac;
        ArrayList<String> accountList = new ArrayList<>(50);
        for(int i = 0; i < 50; i++){
            ac = new Account();
            accountList.add(ac.getAccount());
        }

        accountList.sort(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.substring(4).compareTo(o2.substring(4));
            }
        });

        try(DataOutputStream dos =
                    new DataOutputStream(
                            new FileOutputStream("src/data/accounts.bin")))
        {
            for(Object o:accountList){
                dos.writeBytes(o.toString());
            }

        }
        catch (IOException ex){ex.printStackTrace();}

//        for(Object o: accountList){
//            System.out.println(o);
//        }

        try(DataInputStream dis =
                    new DataInputStream(
                            new FileInputStream("src/data/accounts.bin")))
        {
            String s = dis.readLine();

            System.out.printf("%16s",s);

        }
        catch (IOException ex){ex.printStackTrace();}


        /**
         * TODO:
         *
         * 1. Создать коллекцию счетов из 50 счетов, где каждый счёт представлен в виде
         *    строки, где первые 4 символа - буквенный код подразделения,
         *    остальные 12 - числа.
         *    Например, AHGF172687634511, KKYF703662155214, ...
         *
         * 2. Отсортировать список по цифровой части счёта.
         *
         * 3. Записать отсортированный список в текстовый CSV файл.
         *
         *
         */


    }
}
