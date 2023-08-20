import java.io.File;
import java.io.IOException;
import java.io.FileReader;
import java.io.FileWriter;
public class IOStreamsExample{
    public static void main(String args[]) 
    throws IOException{
        File file = new File("file.txt");
        FileReader reader = new FileReader(file);
        char chars[] = new char [(int) file.length()];
        
        reader.read(chars);
        
        File out = new File("file2.txt");
        FileWriter writer = new FileWriter(out);
        
        writer.write(chars);
        writer.flush();
        
        System.out.println("Data sucessfully written in the file");
    }

}