import java.io.FileOutputStream;
import java.io.IOException;

public class Main2{
    public static void main(String[] args){
        try{
            FileOutputStream outputStream= new FileOutputStream("File.txt");
             outputStream.write("Hello,world!".getBytes());
             outputStream.close();
        }
        catch(IOException e){
            
        }
    }
}


