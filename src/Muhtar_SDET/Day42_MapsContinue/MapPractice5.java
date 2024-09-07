package Muhtar_SDET.Day42_MapsContinue;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapPractice5 {
    public static void main(String[] args) {

        Map<String, String> map = new TreeMap<>();
        map.put("Ddene", "F");
        map.put("Winfred", "M");
        map.put("Jereme", "M");
        map.put("Glad", "F");
        map.put("Desirae", "F");

        map.forEach( (k, v) -> {
            System.out.println(k + " : " + v);
        } );

    }
}

