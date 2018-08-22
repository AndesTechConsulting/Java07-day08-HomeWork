package org.andestech.learning.rfb18;


import com.mifmif.common.regex.Generex;
import jdk.nashorn.internal.runtime.regexp.joni.Regex;
import org.apache.commons.lang3.RandomStringUtils;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;
import java.util.regex.Pattern;
import java.lang.String;

public class App {
    public static void main(String[] args) {

        List<String> accCollection = new ArrayList<>();
        Pattern pattern = Pattern.compile("\\w{4}\\d{8}");
        Generex generex = new Generex("[6-9]\\\\d{9}");
        System.out.println();

        for (int i = 0; i < 50; i += 1) {
            String s1 = RandomStringUtils.randomAlphabetic(4).toUpperCase();
            String s2 = RandomStringUtils.randomNumeric(8);
            accCollection.add(s1.concat(s2));
        }

        class LastNumbersComparator implements Comparator<String> {
            public int compare(String strA, String strB) {
                return strA.substring(4,12).compareToIgnoreCase(strB.substring(4,12));
            }
        }

        LastNumbersComparator lnc = new LastNumbersComparator();
        Collections.sort(accCollection, lnc);

        File file1 = new File("Accounts.csv");

        if (!file1.exists()) {
            try {
                file1.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        try (FileWriter fw = new FileWriter(file1)) {
            for (String string : accCollection) {

                fw.write(string + " \n");
            }
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
