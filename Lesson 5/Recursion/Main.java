import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;

public class Main {

    public static void main(String[] args)  {

        String path = "D:\\folder\\";

        try {
           recurseMethod(path);
        }catch (IOException e){
            System.out.println(e.getMessage());
        }
    }

    private static void recurseMethod(String path) throws IOException{

        File file = new File(path);
        if(!file.exists() ) {
          throw new FileNotFoundException("Directory does not exist!");
        }

        File[] tempArray = file.listFiles();
        File[] forShowArray = new File[0];
        for(int i=0, j=0; i < tempArray.length; i++){

            if(tempArray[i].isDirectory()){
                String s = tempArray[i].getCanonicalPath();
                recurseMethod(s);

                if((tempArray[i].getName().length() > 5) && (tempArray[i].getName().charAt(1) == 'a')){
                    forShowArray = Arrays.copyOf(forShowArray,forShowArray.length +1);
                    forShowArray[j] = tempArray[i];
                    j++;
                }
            } else if(tempArray[i].isFile() && (tempArray[i].getName().length() > 5) && (tempArray[i].getName().charAt(1) == 'a')){

                forShowArray = Arrays.copyOf(forShowArray,forShowArray.length +1);
                forShowArray[j] = tempArray[i];
                j++;
            }
        }
        if(forShowArray.length != 0) System.out.println(Arrays.toString(forShowArray));
    }
}
