package org.andestech.learning.rfb18;

public class Count {
    String ID;

    Count()
    {
        ID = Utils.regionGenerator()+Utils.countNumberGenerator();
    }

    public String toString()
    {
        return ID;
    }
}
