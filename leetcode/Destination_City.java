import java.util.*;

public class Destination_City {
    public String destCity(List<List<String>> paths){
        Set<String> set = new HashSet<>();
        for(var path: paths){
            set.add(path.get(0));
        }
        for(var path: paths){
            if(!set.contains(path.get(1))){
                return path.get(1);
            }
        }
        return "";
    }
} 

