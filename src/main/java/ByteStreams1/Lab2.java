package ByteStreams1;

import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Lab2 {
    public static void main(String[] args) {
        String s = "Hello World!";
        byte[] b = s.getBytes();
        try {
            FileOutputStream output = new FileOutputStream("data.dat");
            output.write(b);
        } catch (FileNotFoundException e) {
            Logger.getLogger(Lab2.class.getName()).log(Level.SEVERE, null, e);
        } catch (IOException e) {
            Logger.getLogger(Lab2.class.getName()).log(Level.SEVERE, null, e);
        }

        try {
            FileInputStream input = new FileInputStream("data.dat");
            int ch;
            while ((ch = input.read())!= -1) {
                System.out.println((char) ch);
            }
        } catch (FileNotFoundException e) {
            Logger.getLogger(Lab2.class.getName()).log(Level.SEVERE, null, e);
        } catch (IOException e) {
            Logger.getLogger(Lab2.class.getName()).log(Level.SEVERE, null, e);

        }

    }
}
