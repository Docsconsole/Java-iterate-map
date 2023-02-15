package docsconsole;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MapIterationExample {

    public static void main(String[] args) {

        //1. Iterating through keySet() and values()
        Map<Integer, String> citiesMap = new HashMap<>();
        citiesMap.put(1, "NewDelhi");
        citiesMap.put(2, "NewYork");
        citiesMap.put(3, "Sydney");
        for (Integer key : citiesMap.keySet()) {
            System.out.println("No = " + key);
        }
        for (String value : citiesMap.values()) {
            System.out.println("Value = " + value);
        }

        // 2 Iterating over entrySet of map
        Map<String, Integer> cityPINsMap = new HashMap<>();
        cityPINsMap.put("NewDelhi", 110001);
        cityPINsMap.put("NewYork", 10001);
        cityPINsMap.put("Sydney", 2000);
        for (Map.Entry<String, Integer> entry : cityPINsMap.entrySet()) {
            System.out.println("City = " + entry.getKey() + ", PIN = " + entry.getValue());
        }

        //3.  Iterating over iterator of map
        Map<String, String> coutryContentMap = new HashMap<>();
        coutryContentMap.put("NewDelhi", "Asia");
        coutryContentMap.put("NewYork", "North America");
        coutryContentMap.put("Sydney", "Australia");
        Iterator<Map.Entry<String, String>> entrySetiterator = coutryContentMap.entrySet().iterator();
        while (entrySetiterator.hasNext()) {
            Map.Entry<String, String> entrySet =  entrySetiterator.next();
            System.out.println("City = " + entrySet.getKey() + ", Continent = " + entrySet.getValue());
        }

        //4.  Iterating through forEach
        Map<Integer, String> countriesMap = new HashMap<>();
        countriesMap.put(1, "India");
        countriesMap.put(2, "USA");
        countriesMap.put(3, "Australia");
        countriesMap.forEach((k, v) -> System.out.println("No = " + k + ", Country = " + v));

        //5.  Iterating through forEach java 8
        Map<Integer, String> contentsMap = new HashMap<>();
        contentsMap.put(1, "India");
        contentsMap.put(2, "USA");
        contentsMap.put(3, "Australia");
        contentsMap.entrySet().stream().forEach(e ->
                System.out.println("No : " + e.getKey() + " Content : " + e.getValue())
        );

        Iterator<Map.Entry<Integer, String>> mapIterator = countriesMap.entrySet().iterator();
        while (mapIterator.hasNext()) {
            Map.Entry<Integer, String> entrySet =  mapIterator.next();
            System.out.println("No = " + entrySet.getKey() + ", Country: = " + entrySet.getValue());
        }
        //6. Iterating over keySet of map (not efficient)
        Map<String, String> capitalCountryMap = new HashMap<>();
        capitalCountryMap.put("NewDelhi", "India");
        capitalCountryMap.put("NewYork", "USA");
        capitalCountryMap.put("Sydney", "Australia");
        for (String city : cityPINsMap.keySet()) {
            System.out.println("Capital = " + city + ", Country = " + capitalCountryMap.get(city));
        }

    }

}