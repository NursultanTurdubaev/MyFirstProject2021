package codingBat;

import java.util.HashMap;
import java.util.Map;

public class Map1MapAB4 {
    public static void main(String[] args) {
//        Modify and return the given map as follows: if the keys "a" and "b" have values that have
//        different lengths, then set "c" to have the longer value. If the values exist and have the same length,
//        change them both to the empty string in the map.
//        mapAB4({"a": "aaa", "b": "bb", "c": "cake"}) → {"a": "aaa", "b": "bb", "c": "aaa"}
//        mapAB4({"a": "aa", "b": "bbb", "c": "cake"}) → {"a": "aa", "b": "bbb", "c": "bbb"}
//        mapAB4({"a": "aa", "b": "bbb"}) → {"a": "aa", "b": "bbb", "c": "bbb"}
        Map<String, String> map = new HashMap<>();
        map.put("a", "aa");
        map.put("b", "bbb");
        System.out.println(mapAB4(map));

    }

    public static Map<String, String> mapAB4(Map<String, String> map) {
        if (map.containsKey("a") && map.containsKey("b")) {
            if (map.get("a").length() != map.get("b").length()) {
                if (map.get("a").length() > map.get("b").length()) {
                    map.put("c", map.get("a"));

                }
                if (map.get("a").length() < map.get("b").length()) {
                    map.put("c", map.get("b"));
                }

            }
            if (map.get("a").length() == map.get("b").length()) {
                map.put("a", "");
                map.put("b", "");
            }
        }
        return map;
    }
}
