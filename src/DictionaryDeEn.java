
import java.util.HashMap;

public class DictionaryDeEn {

    static HashMap<String, String> dict = new HashMap<>();

    static void add(String ger, String en) {
        dict.put(ger, en);
        dict.put(en, ger);

        System.out.println(ger + " - " + en + " / was added");
    }

    static void remove(String val) {
        if (dict.containsKey(val)) {
            dict.remove(dict.get(val));
            dict.remove(val);
            System.out.println(val + " - has been removed");
        } else {
            System.out.println(val + " not found");
        }
    }

    static void search(String val) {
        if (dict.containsKey(val)) {
            System.out.println(val + " = " + dict.get(val));
        } else {
            System.out.println(val + " - not found");
        }
    }

    public static void main(String[] args) {
        add("Heute", "Today");
        add("Morgen", "Tomorrow");
        search("Heute");
        search("Today");
        search("Tomorrow");
        remove("Heute");
        search("Heute");
        search("Today");
    }
}
