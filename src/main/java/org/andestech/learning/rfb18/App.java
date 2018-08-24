package org.andestech.learning.rfb18;


import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class App
{

    static ArrayList<String> accounts = new ArrayList<>();


    // реализация валидации и добавления в массив аккаунтов при ручном вводе

//    public static void addAcc (String acc) {
//        Pattern pat = Pattern.compile("[A-Z]{4}\\d{12}");
//        Matcher m = pat.matcher(acc);
//        if (m.matches()) {
//            if (acc.substring(0, 3).equals(acc.substring(0, 3).toUpperCase())) {
//                accounts.add(acc);
//            }
//        }
//    }



    // автоматическая генерация аккаунтов

    private static String generateAccount() {

        ArrayList<String> let = new ArrayList<>();
        let.add("A"); let.add("B"); let.add("C"); let.add("D"); let.add("E");
        let.add("F"); let.add("G"); let.add("H"); let.add("I"); let.add("J");
        let.add("K"); let.add("L"); let.add("M"); let.add("N"); let.add("O");
        let.add("P"); let.add("Q"); let.add("R"); let.add("S"); let.add("T");
        let.add("U"); let.add("V"); let.add("W"); let.add("X"); let.add("Y");
        let.add("Z");

        ArrayList<String> dig = new ArrayList<>();
        dig.add("0"); dig.add("1"); dig.add("2"); dig.add("3"); dig.add("4");
        dig.add("5"); dig.add("6"); dig.add("7"); dig.add("8"); dig.add("9");

        int a = 1, b = let.size() - 1, c = dig.size() - 1;

        int ran1 = a + (int) (Math.random() * b);
        String runLet1 = let.get(ran1);
        int ran2 = a + (int) (Math.random() * b);
        String runLet2 = let.get(ran2);
        int ran3 = a + (int) (Math.random() * b);
        String runLet3 = let.get(ran3);
        int ran4 = a + (int) (Math.random() * b);
        String runLet4 = let.get(ran4);
        String resLet = runLet1 + runLet2 + runLet3 + runLet4;

        int ran5 = a + (int) (Math.random() * c);
        String runDig1 = dig.get(ran5);
        int ran6 = a + (int) (Math.random() * c);
        String runDig2 = dig.get(ran6);
        int ran7 = a + (int) (Math.random() * c);
        String runDig3 = dig.get(ran7);
        int ran8 = a + (int) (Math.random() * c);
        String runDig4 = dig.get(ran8);
        int ran9 = a + (int) (Math.random() * c);
        String runDig5 = dig.get(ran9);
        int ran10 = a + (int) (Math.random() * c);
        String runDig6 = dig.get(ran10);
        int ran11 = a + (int) (Math.random() * c);
        String runDig7 = dig.get(ran11);
        int ran12 = a + (int) (Math.random() * c);
        String runDig8 = dig.get(ran12);
        int ran13 = a + (int) (Math.random() * c);
        String runDig9 = dig.get(ran13);
        int ran14 = a + (int) (Math.random() * c);
        String runDig10 = dig.get(ran14);
        int ran15 = a + (int) (Math.random() * c);
        String runDig11 = dig.get(ran15);
        int ran16 = a + (int) (Math.random() * c);
        String runDig12 = dig.get(ran16);
        String resDig = runDig1 + runDig2 + runDig3 + runDig4 + runDig5 + runDig6 + runDig7 +
                runDig8 + runDig9 + runDig10 + runDig11 + runDig12;

        String account = resLet + resDig;

        return account;

    }



    public static void main(String[] args )
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


        // ручной ввод и последующее добавление валидация аккаунтов в методе add

//        addAcc("ADFF172117634510");
//        addAcc("ADFFF172117634510");
//        addAcc("ADFFF172117634510000");
//        addAcc("AHJF172127634509");
//        addAcc("ADFF126137634508");
//        addAcc("AHUF172614634507");
//        addAcc("AERF172615634506");
//        addAcc("AHGF172616634505");
//        addAcc("AHGK172617634504");
//        addAcc("AHGC172618634503");
//        addAcc("AHGH172619634502");
//        addAcc("AHGF172620634501");
//
//        addAcc("ASGF172601634500");
//        addAcc("AGGF172602634501");
//        addAcc("AJGF172603634502");
//        addAcc("ATGF172604634503");
//        addAcc("AEGF172605634504");
//        addAcc("ADGF172606634505");
//        addAcc("AVGF172607634506");
//        addAcc("ANGF172608634507");
//        addAcc("AMGF172609634508");
//        addAcc("AJGF172610634509");
//
//        addAcc("AQGF172687014510");
//        addAcc("AWGF172687924511");
//        addAcc("AEGF172687834512");
//        addAcc("ARGF172687744513");
//        addAcc("ATGF172687654514");
//        addAcc("AYGF172687564515");
//        addAcc("AUGF172687474516");
//        addAcc("AIGF172687384517");
//        addAcc("AOGF172687294518");
//        addAcc("APGF172687104519");
//
//        addAcc("AHGF172117634520");
//        addAcc("SHGF172127634521");
//        addAcc("DHGF172113763522");
//        addAcc("FHGF172614634523");
//        addAcc("GHGF172615634524");
//        addAcc("HHGF172616634525");
//        addAcc("JHGF172617634526");
//        addAcc("KHGF172618634527");
//        addAcc("LHGF172619634528");
//        addAcc("LHGF172620634529");
//
//        addAcc("ZHGF112687634511");
//        addAcc("XHGF312687634512");
//        addAcc("CHGF672687634513");
//        addAcc("VHGF872687634514");
//        addAcc("BHGF072687634515");
//        addAcc("NHGF672687634516");
//        addAcc("MHGF572687634517");
//        addAcc("GHGF372687634518");
//        addAcc("JHGF872687634519");
//        addAcc("AHGF072687634520");


       for (int i = 0; i < 50; i ++) {
           accounts.add(generateAccount());
       }



        // сортировка массива аккаунтов
        accounts.sort((o1, o2) ->(o1.substring(4).compareTo(o2.substring(4))));



        String FileAcc = "C:\\JavaWriteTest\\";

        try (FileOutputStream fos = new FileOutputStream(FileAcc + "Accounts.csv")) {

            for (int i = 0; i < accounts.size(); i++) {
                String a = accounts.get(i);
                String b = " ";
                byte[] arr = a.getBytes("utf8");
                fos.write(arr);
                byte[] arr2 = b.getBytes("utf8");
                fos.write(arr2);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
