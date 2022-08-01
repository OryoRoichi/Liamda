import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        Map<Character, String> ruWordsMap = new HashMap<Character, String>();
        fillruMap(ruWordsMap);
        Map<Character, String> engWordsMap = new HashMap<Character, String>();
        fillengMap(engWordsMap);

        System.out.println(newMap(ruWordsMap,engWordsMap));
    }

    public static void fillruMap(Map<Character, String> ruWordsMap) {
        ruWordsMap.put('a', "according");
        ruWordsMap.put('b', "being");
        ruWordsMap.put('c', "concern");
        ruWordsMap.put('d', "development");
        ruWordsMap.put('e', "even");
        ruWordsMap.put('f', "fist");
        ruWordsMap.put('g', "glow");
        ruWordsMap.put('h', "health");
        ruWordsMap.put('i', "insects");
        ruWordsMap.put('j', "joint");
        ruWordsMap.put('k', "key");
        ruWordsMap.put('l', "loud");
        ruWordsMap.put('m', "morning");
        ruWordsMap.put('n', "nemesis");
        ruWordsMap.put('o', "option");
        ruWordsMap.put('p', "perfect");
        ruWordsMap.put('q', "quit");
        ruWordsMap.put('r', "recreate");
        ruWordsMap.put('s', "system");
        ruWordsMap.put('t', "tank");
        ruWordsMap.put('u', "university");
        ruWordsMap.put('v', "value");
        ruWordsMap.put('w', "world");
        ruWordsMap.put('x', "xenophobia");
        ruWordsMap.put('y', "yet");
        ruWordsMap.put('z', "zero");
    }

    public static void fillengMap(Map<Character, String> ruWordsMap) {
        ruWordsMap.put('a', "согласно");
        ruWordsMap.put('b', "быть");
        ruWordsMap.put('c', "обеспокоенность");
        ruWordsMap.put('d', "развитие");
        ruWordsMap.put('e', "равно");
        ruWordsMap.put('f', "кулак");
        ruWordsMap.put('g', "сияние");
        ruWordsMap.put('h', "здоровье");
        ruWordsMap.put('i', "насекомое");
        ruWordsMap.put('j', "совемстный");
        ruWordsMap.put('k', "ключ");
        ruWordsMap.put('l', "громкbq");
        ruWordsMap.put('m', "утро");
        ruWordsMap.put('n', "возмездие");
        ruWordsMap.put('o', "вариант");
        ruWordsMap.put('p', "идеальный");
        ruWordsMap.put('q', "покинуть");
        ruWordsMap.put('r', "пересоздать");
        ruWordsMap.put('s', "ситсема");
        ruWordsMap.put('t', "танк");
        ruWordsMap.put('u', "университет");
        ruWordsMap.put('v', "значение");
        ruWordsMap.put('w', "мир");
        ruWordsMap.put('x', "ксенофобия");
        ruWordsMap.put('y', "пока");
        ruWordsMap.put('z', "нуль");
    }

    public static Map<String, String> newMap(Map<Character, String> ruWordsMap,Map<Character, String> engWordsMap) {
        Map<String, String> transWordsMap = new TreeMap<String, String>();
        Character tmp;

        for (Map.Entry<Character, String> entry : engWordsMap.entrySet()) {
            tmp = entry.getKey();
            transWordsMap.put(ruWordsMap.get(tmp), engWordsMap.get(tmp));
        }
        return transWordsMap;
    }

    public static Map<String, String> newMapLiamda(final Map<Character, String> ruWordsMap, Map<Character, String> engWordsMap) {
        final Map<String, String> transWordsMap = new TreeMap<String, String>();
        Character tmp;
        engWordsMap.forEach( (key,word) -> {
            transWordsMap.put(word, ruWordsMap.get(key));
        });

        return transWordsMap;
    }
}
