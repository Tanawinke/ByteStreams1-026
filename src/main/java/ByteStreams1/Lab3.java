package ByteStreams1;

import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Lab3 {
    public static void main(String[] args) {
        try {
            FileOutputStream file = new FileOutputStream("data.dat");
            DataOutputStream output = new DataOutputStream(file);
            output.writeUTF("Jim Henry");
            output.writeInt(30);
            output.writeDouble(65.5);
            output.writeChars("A");
        } catch (FileNotFoundException e) {
            Logger.getLogger(Lab2.class.getName()).log(Level.SEVERE, null, e);
        } catch (IOException e) {
            Logger.getLogger(Lab2.class.getName()).log(Level.SEVERE, null, e);
        }

        try {
            FileInputStream file = new FileInputStream("data.dat");
            DataInputStream input = new DataInputStream(file);
            System.out.println(input.readUTF());
            System.out.println(input.read());
            System.out.println(input.readDouble());
            System.out.println(input.readChar());
        } catch (FileNotFoundException e) {
            Logger.getLogger(Lab2.class.getName()).log(Level.SEVERE, null, e);

        } catch (IOException e) {
            Logger.getLogger(Lab2.class.getName()).log(Level.SEVERE, null, e);

        }

    }
}
