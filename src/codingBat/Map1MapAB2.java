package codingBat;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Map1MapAB2 {
    public static void main(String[] args) {
//        Modify and return the given map as follows:
//        if the keys "a" and "b" are both in the map and have equal values, remove them both.
//        mapAB2({"a": "aaa", "b": "aaa", "c": "cake"}) → {"c": "cake"}
//        mapAB2({"a": "aaa", "b": "bbb"}) → {"a": "aaa", "b": "bbb"}
//        mapAB2({"a": "aaa", "b": "bbb", "c": "aaa"}) → {"a": "aaa", "b": "bbb", "c": "aaa"}
        Map<String,String> map = new HashMap<>();
        map.put("a","aaa");
        map.put("b","bbb");
        System.out.println(mapAB2(map));
    }
    public static Map<String, String> mapAB2(Map<String, String> map){
        if (map.containsKey("a") && map.containsKey("b") && Objects.equals(map.get("a"), map.get("b"))){
            map.remove("a");
            map.remove("b");
        }
        return map;
    }
}
