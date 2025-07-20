/**
 * Object-Oriented Discrete Event Simulation in Java
 * This package is designed for teaching purposes at 
 * RWTH Aachen University, Aachen, Germany
 * Design and realization by 
 * @author Dr. Mesut Günes
 * @since April, 2007
 */

package util;

import java.io.*;

/**
 * This class wraps the Java IO-System into a very simple file writer class.
 * This class should be changed to use the logging mechanism of Java.
 * @author Mesut Günes
 */
public class FileWrite {
    String fileName;
    BufferedWriter out;
    
    public FileWrite(String _fileName) {
        fileName = _fileName;
        
        try {
            FileWriter fstream = new FileWriter(fileName);
            out = new BufferedWriter(fstream);
        }
        catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
        }                
    }
    
    public void close() {
        try {
            out.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    public void print(String _line) {
        try {
            out.write(_line);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    public void println(String _line) {
        try {
            out.write(_line);
            out.newLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }    
}
