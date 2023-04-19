package ByteStreams1;


import java.io.*;
import java.io.FileOutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Lab4 {
    public static void main(String[] args) {
        String s = "Hello World!";
        byte[] b = s.getBytes();
        FileOutputStream file;

        {
            try {
                file = new FileOutputStream("data.dat");
                BufferedOutputStream output = new BufferedOutputStream(file);
                output.write(b);
                output.close();
            } catch (FileNotFoundException e) {
                Logger.getLogger(Lab2.class.getName()).log(Level.SEVERE, null, e);
            } catch (IOException e) {
                Logger.getLogger(Lab2.class.getName()).log(Level.SEVERE, null, e);

            }

            try {
                FileInputStream file1 = new FileInputStream("data.dat");
                BufferedInputStream input = new BufferedInputStream(file1);
                int ch;
                while ((ch = input.read()) != -1) {
                    System.out.println((char) ch);
                }
            } catch (FileNotFoundException e) {
                Logger.getLogger(Lab2.class.getName()).log(Level.SEVERE, null, e);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
