package org.andestech.learning.rfb18;

import java.util.ArrayList;
import java.util.Random;


public class CountsList
{
    ArrayList<Count> counts;
    private int volume;

    CountsList(int volume)
    {
        this.volume = volume;
        counts = new ArrayList(volume);
        for(int i = 0; i < volume-1; i++ )
        {
            counts.add(new Count());
            System.out.println(counts.get(i));
        }
    }
}
