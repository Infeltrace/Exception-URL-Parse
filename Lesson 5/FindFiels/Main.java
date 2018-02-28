import java.io.*;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();
        String[] endList = {".txt", ".pdf", ".bmp", ".class"};
        try{
            findFiles("D:\\folder\\", endList , list);
        }catch (Exception e){
            e.printStackTrace();
        }
        System.out.println(list);
    }

    private static void findFiles(String path, String[] ext, ArrayList<String> stringArrayList){

        File dir = new File(path);
        File[] files = dir.listFiles(new IOStream(ext));
        for (File file : files) {
            stringArrayList.add(path + file.getName());
        }
    }
}
