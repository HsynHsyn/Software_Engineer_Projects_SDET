package Muhtar_SDET.Day43_CollectionsAndMaps.hashMap_Dictionary;

import java.util.HashMap;
import java.util.Map;

public class Dictionary {

    private Map<String, String> dictionary;  // key - word, value - definition

    public Dictionary() {
        this.dictionary = new HashMap<>();
    }

    public void addWord(String word, String definition) {
        dictionary.put(word, definition);
    }

    public String getDefinition(String word) {
        return dictionary.get(word);
    }

    @Override
    public String toString() {
        return "Dictionary{" +
                "dictionary=" + dictionary +
                '}';
    }
}

