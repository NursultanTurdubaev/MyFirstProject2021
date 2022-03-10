package map;

import java.util.*;

public class Map1 {
    public static void main(String[] args) {
        Map<String, String> fullNames = new HashMap<>();
//              Key        Value
//              Kluch      Znachenie
        fullNames.put("Atabekov", "Mirbek");  //
        fullNames.put("Satylganova", "Gulnur");
        fullNames.put("Beishekeev", "Syimyk");
        fullNames.put("Borbiev", "Bek");
        fullNames.put("Moldakmatova", "Assol'");
        fullNames.put("Imanbekov", "Mirbek");
        System.out.println(fullNames.get("Moldakmatova"));
        System.out.println(fullNames.keySet());
        System.out.println(fullNames.values());
        System.out.println(fullNames.containsKey("Moldakmatova"));

        for (String i : fullNames.keySet()){
            System.out.println(i);
        }

        for (String j : fullNames.values()){
            System.out.println(j);
        }

        for (Map.Entry<String, String> keyAndValue : fullNames.entrySet()){
            System.out.println("Keys: " + keyAndValue.getKey() + "\n" +
                    "Values: " + keyAndValue.getValue() );
        }
        System.out.println("_________________________________");

        for (String i : fullNames.keySet()){
            System.out.println("Key: " + i + "\n" + "Value: " + fullNames.get(i));
        }

        System.out.println(fullNames.get("Borbiev"));

        Map<String, String> linkedFullNames = new LinkedHashMap<>(fullNames);
        System.out.println(linkedFullNames);

        Map<String, String> treeFullNames = new TreeMap<>(linkedFullNames);
        System.out.println(treeFullNames);

        List<String> list = new ArrayList<>();
        list.add("Tamga");  // index 0 --> value "Tamga"
        list.add("Begish");
        list.add("Bakr");
        list.add("UlukManapo");
        list.add("Bayastan");
        list.add("Bakr");
        System.out.println(list);


        List<String> city = new ArrayList<>();
        city.add("London");
        city.add("Bishkek");
        System.out.println(city.get(1));


        Map<String, String> countryAndCity = new TreeMap<>();
        countryAndCity.put("Seul", "South Korea");
        countryAndCity.put("Bishkek", "Kyrgyzstan");
        countryAndCity.put("Tashkent", "Uzbekistan");
        System.out.println(countryAndCity.get("Bishkek"));
        countryAndCity.putAll(treeFullNames);
        System.out.println("PutAll(): " + countryAndCity);

        Map<Integer, Character> alphabet = new LinkedHashMap<>();
        alphabet.put(1, 'A');
        alphabet.put(2, 'B');
        alphabet.put(3, 'C');
        System.out.println(alphabet);
        alphabet.replace(2, 'b');
        System.out.println(alphabet);
        System.out.println(alphabet);
        System.out.println(alphabet.size());

    }
}
