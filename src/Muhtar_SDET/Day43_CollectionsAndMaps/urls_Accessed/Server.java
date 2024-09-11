package Muhtar_SDET.Day43_CollectionsAndMaps.urls_Accessed;

import java.util.LinkedHashMap;
import java.util.Map;



import java.util.LinkedHashMap;
import java.util.Map;

public class Server {
    private Map<String, Integer> recentUrls;

    public Server() {
        /*
        initialCapacity: Başlangıç kapasitesini belirler.
        loadFactor: Yük faktörünü ayarlar.
        accessOrder: true ise, haritanın sıralaması erişim sırasına göre yapılır;
         false ise ekleme sırasına göre sıralama yapılır.
         */

        this.recentUrls = new LinkedHashMap<>( 10,0.75f,  true);
    }

    // most important think
    public void goTo(String url) {
        if (!recentUrls.containsKey(url)) { // when the url is new
            recentUrls.put(url, 0); // set up the counter for new urls
        }
        recentUrls.put(url, recentUrls.get(url) + 1);
    }

//    public Map<String, Integer> getRecentUrls() {
//        return recentUrls;
//    }

    @Override
    public String toString() {
        return "Server{" +
                "recentUrls=" + recentUrls +
                '}';
    }
}
