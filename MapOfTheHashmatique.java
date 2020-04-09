import java.util.HashMap;
import java.util.Set;

public class MapOfTheHashmatique{
    public void retriveSongData(){  
        HashMap<String, String> songMap = new HashMap<String, String>();
        songMap.put("4", "444444444");
        songMap.put("3", "3333333333");
        songMap.put("2", "222222222222222");
        songMap.put("1", "1111111111111");

        String single = songMap.get("1");
        System.out.println(single);

        Set<String> keys = songMap.keySet();
        for(String key : keys){
            System.out.println(key);
            System.out.println(songMap.get(key));
        }
    }
}