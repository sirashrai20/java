import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

class BufferedReaderDemo{
    public static void main(String[]args)
    throws IOException{
      FileReader fr = new FileReader("output.txt");
      BufferedReader br = new BufferedReader(fr);
      
      char e[] = new char[20];
      
      if(br.markSupported()){
          System.out.println("mark() method is supported");
          
          br.mark(100);
      }
      
      br.skip(8);
      if(br.ready()){
          System.out.println(br.readLine());
          
          br.read(c);
          for(int i=0; i<20; i++){
              System.out,print(c[i]);
          }
          System.out.println();
          
          br.reset();
          for(int i=0;i<8;i++){
               System.out.println((char) br.read());
          }
      }
    }
}