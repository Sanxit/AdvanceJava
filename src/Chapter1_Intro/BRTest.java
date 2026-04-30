package Chapter1_Intro;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BRTest {

    public static void main(String[] args) {

        try
        {
            FileWriter fw = new FileWriter("brtest.txt");

            fw.write("This is from brtest.txt");
            fw.close();

            BufferedReader br = new BufferedReader(new FileReader("brtest.txt"));
            String str;

            while( (str = br.readLine()) != null )
            {
                System.out.println(str);
            }

            br.close();
        }
        catch (IOException e)
        {

        }

    }
}