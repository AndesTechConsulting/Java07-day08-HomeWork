package org.andestech.learning.rfb18;


import java.util.Collections;

public class App
{
    public static void main( String[] args )
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

        CountsList cntsLs = new CountsList(50);
        CountComparator countComparator = new CountComparator();
        Collections.sort(cntsLs.counts, countComparator);
        System.out.println("----------------------------------------");
        for(int i = 0; i < cntsLs.counts.size(); i++)
        {
            System.out.println(cntsLs.counts.get(i));
        }
        Recorder.recorInCSV(cntsLs.counts);
    }
}
