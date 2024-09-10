package Muhtar_SDET.Day43_CollectionsAndMaps.hashSetIPAddress;

import java.util.HashSet;
import java.util.Set;

public class AddressManager {
    private Set<String> uniqueIp;

    public AddressManager() {
        this.uniqueIp = new HashSet<>();
    }

    public void addAddress(String ip) {
        uniqueIp.add(ip);
    }

    public Set<String> getUniqueIp() {
        return uniqueIp;
    }
}

// eger degerleri disardan almak istersek asagidaki gibi testte hash set olusturulmali
/*
public class Dictionary {
    private Map<String, String> dictionary;  // key - word, value - definition

    // Parametreli yapıcı
    public Dictionary(Map<String, String> dictionary) {
        this.dictionary = new HashMap<>(dictionary); // Sağlanan Map'in kopyasını oluşturur
    }

    // Kelime arama yöntemi
    public String getDefinition(String word) {
        return dictionary.get(word);
    }

    public static void main(String[] args) {
        // Başlangıç verisi ile bir Map oluşturma
        Map<String, String> initialData = new HashMap<>();
        initialData.put("Java", "A high-level programming language.");
        initialData.put("Python", "A high-level programming language known for its readability.");

        // Parametreli yapıcı ile oluşturulmuş bir Dictionary
        Dictionary myDictionary = new Dictionary(initialData);

        // Tanımları alma
        System.out.println("Java: " + myDictionary.getDefinition("Java"));
        System.out.println("Python: " + myDictionary.getDefinition("Python"));
    }
}
 */