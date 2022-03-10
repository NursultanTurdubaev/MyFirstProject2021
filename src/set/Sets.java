package set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Sets {
    public static void main(String[] args) {
        List<String> brands = new ArrayList<>();
        brands.add("BMW");
        brands.add("Tesla");
        brands.add("Mercedes");
        brands.add("Bugatti");
        brands.add("Tesla");
        brands.add("Ferrari");
        brands.add("Tesla");
        brands.add("Tesla");
        System.out.println(brands);

        Set<String> cars = new HashSet<>(); // set removed duplicates from the arraylist. only unique values are present.
        cars.addAll(brands);
        cars.add("Nissan");
        cars.add("Audi");
        cars.add("Bugatti");
        System.out.println(cars);

    }
}
