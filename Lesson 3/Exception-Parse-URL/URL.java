import java.util.HashMap;
import java.util.Map;

public class URL {

    static public void dissection(String string)throws Exception{

        Map<String,String> map = new HashMap<>();

        for(String s:string.split("&")) {
            if(s.matches("[A-Za-z0-9]+=[A-Za-z0-9]+")){
                map.put(s.split("=")[0],s.split("=")[1]);
            }else throw new Exception();
            System.out.println(s);
        }
    }
}
