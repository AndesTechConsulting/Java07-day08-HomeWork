package org.andestech.learning.rfb18;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Random;

public class App {
    public static void main(String[] args) {
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

        ArrayList<String> AccountList = new ArrayList<>(50);
        for (int i = 0; i < 50; i++) {
            Accounts acc = new Accounts();
            AccountList.add(acc.getAccount());

        }
        for (Object o: AccountList){
            System.out.println(o);}
    }

    }

