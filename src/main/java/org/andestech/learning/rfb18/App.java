package org.andestech.learning.rfb18;


import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;

public class App
{


    public static void main( String[] args ) throws IOException
    {
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
//пока мы не сгенерили номер счета, это выглядит так:
ArrayList <String> accounts = new ArrayList<String>(50);
        accounts.add("AHGF172687634511");
        accounts.add("BCDF465465634511");
        accounts.add("GHSD654656434511");
        accounts.add("BCDF654646464445");
        accounts.add("HJKL114654631316");
        accounts.add("YBCG122132121313");
        accounts.add("AHGG174561311321");
        accounts.add("AHLO176464644654");
        accounts.add("AHPL172656546456");
        accounts.add("AHGT888698946456");

        System.out.println(accounts);

        accounts.sort(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.substring(4).compareTo(o2.substring(4));
            }});
        System.out.println(accounts);

        String accPath = "C:\\training\\data\\";
        File accs = new File(accPath + "accs.csv");

        if (!accs.exists()) {
            try {
                accs.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

                try(DataOutputStream dos =
                    new DataOutputStream(
                            new FileOutputStream(accs)))
        {
            for(String ac: accounts)
            {dos.writeBytes(ac.toString()+" ");}

        }
        catch (IOException ex){ex.printStackTrace();}

    }
}
