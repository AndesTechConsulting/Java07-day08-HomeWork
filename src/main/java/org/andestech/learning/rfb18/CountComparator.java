package org.andestech.learning.rfb18;

import java.util.Comparator;

public class CountComparator implements Comparator<Count>
{
    public int compare(Count c1, Count c2)
    {
        StringBuffer str1 = new StringBuffer(c1.toString());
        StringBuffer str2 = new StringBuffer(c2.toString());

        Long id1 = Long.parseLong(str1.delete(0,3).toString());
        System.out.println("===" + id1);
        Long id2 = Long.parseLong(str2.delete(0,3).toString());
        System.out.println("===" + id2);
        if (id1 > id2)
        {
            System.out.println(1);
            return 1;
        } else if (id1 == id2)
        {
            System.out.println(0);
            return 0;
        } else {
            System.out.println(-1);
            return -1;
        }
        //return id1.compareTo(id2);
    }

}
