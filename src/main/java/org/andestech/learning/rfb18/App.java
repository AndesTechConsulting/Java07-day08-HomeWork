package org.andestech.learning.rfb18;


import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;
import java.lang.String;


public class App {
    private static void ArrayList(){
        System.out.printf("не понятно");

    }  ;

    public static FileWriter main(String[] args) {

        class AlphaNumerics {
            private final String NameAcc = "asdfghjklpoiuytrewqzxcvbnm";
            private final char[] accCollection = (NameAcc.toUpperCase() + "0123456789").toCharArray();

            public StringBuilder GenerateAlphaNumerics(int length) {

                StringBuilder result = new StringBuilder();
                for (int i = 0; i < length; i++) {
                    StringBuilder append = result.append(new Random().nextInt(accCollection.length));

                }
                return result;
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

        File file1 = new File("file.csv");

        if (!file1.exists()) {
            try {
                file1.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        try (FileWriter fw = new FileWriter(file1)) {
                for (String string : ArrayList()){
                    return fw;
            };
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}