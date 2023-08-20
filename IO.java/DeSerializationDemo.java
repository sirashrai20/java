import java.io.*;

public class DeSerializationDemo{
    public static void main(String[]args) throws IOException{
        FileInputStream Fis = new FileInputStream("File.txt");
        ObjectInputStream ois = new ObjectInputStream(Fis);
        Student s = (Student) ois.readObject();
        s.display();
        ois.close();
    }
}