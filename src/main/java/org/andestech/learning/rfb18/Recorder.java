package org.andestech.learning.rfb18;

import java.io.*;
import java.util.ArrayList;
import java.util.Date;

public class Recorder
{
    public static void recorInCSV(ArrayList list)
    {
        Date date = new Date();
        FileWriter fileWriter = null;
        String fileName = date.toString() + ".csv";
        File file = null;
        try
        {
            file = new File(fileName);
            fileWriter = new FileWriter(file, true);
            for(int i = 0; i < list.size(); i++)
            {
                fileWriter.write(list.get(i).toString());
                fileWriter.write("\n");
            }
            fileWriter.append('\n');
            fileWriter.flush();
        } catch (FileNotFoundException e)
        {
            System.out.println("Нет такого файла");
        } catch (IOException e)
        {
            System.out.println("Что - то не так с выводом... ");
        }
        finally
        {
        }
    }
}
