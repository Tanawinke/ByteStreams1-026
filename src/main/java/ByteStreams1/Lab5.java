package ByteStreams1;

import java.io.*;
import java.util.Objects;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Lab5 {
    public static void main(String[] args) {
        Student s = new Student("111111", "John Henry");
        try {
            FileOutputStream file = new FileOutputStream("data.dat");
            ObjectOutputStream output = new ObjectOutputStream(file);
            output.writeObject(s);
        } catch (FileNotFoundException e) {
            Logger.getLogger(Lab5.class.getName()).log(Level.SEVERE, null, e);
        } catch (IOException e) {
            Logger.getLogger(Lab5.class.getName()).log(Level.SEVERE, null, e);
        }

        try {
            FileInputStream file = new FileInputStream("data.dat");
            ObjectInputStream input = new ObjectInputStream(file);
            Student s1= (Student) input.readObject();
            System.out.println(s1.id);
            System.out.println(s1.name);
        } catch (FileNotFoundException e) {
            Logger.getLogger(Lab5.class.getName()).log(Level.SEVERE, null, e);
        } catch (IOException e) {
            Logger.getLogger(Lab5.class.getName()).log(Level.SEVERE, null, e);
        } catch (ClassNotFoundException e) {
            Logger.getLogger(Lab5.class.getName()).log(Level.SEVERE, null, e);
        }
    }
}
