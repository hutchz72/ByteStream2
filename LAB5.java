/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bytestreams2;

import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author Student
 */
public class LAB5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Student s = new Student("65130500072", "Varittorn");
        try {
            FileOutputStream file = new FileOutputStream("data.dat");
            ObjectOutputStream output = new ObjectOutputStream(file);
            output.writeObject(s);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(LAB5.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(LAB5.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        try {
            FileInputStream file = new FileInputStream("data.dat");
            ObjectInputStream input = new ObjectInputStream(file);
            Student ss = (Student) input.readObject();
            System.out.println(ss);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(LAB5.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(LAB5.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(LAB5.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
