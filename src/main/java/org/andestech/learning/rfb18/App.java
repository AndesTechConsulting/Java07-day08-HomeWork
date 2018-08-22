package org.andestech.learning.rfb18;

//google helps a lot
import com.mifmif.common.regex.Generex;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class App {
    private static String generateAccount() {
        Generex generex = new Generex("[A-Z]{4}[0-9]{12}");
        return String.valueOf(generex.random());
    }

    private static void checkDatas(ArrayList<String> accounts){
        for (int i = 0; i < 50; i++) {
            System.out.println((i + 1) + "\t" + accounts.get(i));
        }
        System.out.println("----------------------------");
    }

    public static void main(String[] args) {
        ArrayList<String> accounts = new ArrayList<>();

        for (int i = 0; i < 50; i++) {
            accounts.add(generateAccount());
        }
        checkDatas(accounts);

        accounts.sort((o1, o2) -> (o1.substring(4).compareTo(o2.substring(4))));
        checkDatas(accounts);

        String path = "E:\\test rep\\Java07-day08-HomeWork\\";
        File output = new File(path + "output.csv");

        //delete file if exist, then work with new file
        if(output.exists()){
            output.delete();
        }

        try (FileWriter writer = new FileWriter(output)) {
            writer.write(String.valueOf(accounts));
        } catch (IOException e) {
            e.printStackTrace();
        }


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