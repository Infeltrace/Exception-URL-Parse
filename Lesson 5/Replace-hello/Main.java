import java.io.*;

public class Main {

    public static void main(String[] args){

        try(FileInputStream fileInputStream = new FileInputStream("D:\\hello.txt")) {

            byte[] byteArray = new byte[fileInputStream.available()];
            fileInputStream.read(byteArray);

           try( FileOutputStream fileOutputStream = new FileOutputStream("D:\\hello.txt")) {

               String string = new String(byteArray).replaceAll("hello", "1234");
               fileOutputStream.write(string.getBytes());

           }catch (IOException e){
               e.printStackTrace();
           }
        }catch (IOException e){
            e.printStackTrace();
        }

    }
}
