package Labs.Lab7.ex1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try(FileInputStream in = new FileInputStream("C:\\Users\\HP\\Desktop\\Java\\Main\\src\\Labs\\Lab7\\ex1\\input.txt");
            FileOutputStream out = new FileOutputStream("C:\\Users\\HP\\Desktop\\Java\\Main\\src\\Labs\\Lab7\\ex1\\output.txt")) {
            byte[] buffer = new byte[in.available()];
            in.read(buffer, 0, buffer.length);
            out.write(buffer, 0, buffer.length);
        }
        catch (FileNotFoundException ex) {
            System.out.println(ex.getMessage());
        }
        catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
}
