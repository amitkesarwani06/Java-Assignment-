import java.util.HashMap;
import java.util.Map;

public class Duplicate {
    public static void main(String[] args) {
        String str = "Amit Kesarwani";
        Map<Character, Integer> charCountMap = new HashMap<>();

        
        char[] charArray = str.toCharArray();

        
        for (char c : charArray) {
            if (charCountMap.containsKey(c)) {
               
                charCountMap.put(c, charCountMap.get(c) + 1);
            } else {
                
                charCountMap.put(c, 1);
            }
        }

        
        System.out.println("Duplicate characters in the string '" + str + "':");
        for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey() + " - " + entry.getValue() + " times");
            }
        }
    }
}
