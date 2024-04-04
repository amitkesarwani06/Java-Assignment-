import java.util.HashMap;
public class WordCount {
    public static void main(String[] args) {
        String inputString = "This is a sample sentence. Another sentence is here for the example.";
        
        HashMap<String, Integer> wordCountMap = countWords(inputString);
      
        System.out.println("Word count in the string:");
        for (String word : wordCountMap.keySet()) {
            System.out.println(word + ": " + wordCountMap.get(word));
        }
    }
    private static HashMap<String, Integer> countWords(String inputString) {
        
        HashMap<String, Integer> wordCountMap = new HashMap<>();
        
        String[] words = inputString.split("\\s+");

        for (String word : words) {
            
            word = word.replaceAll("[^a-zA-Z]", "").toLowerCase();
            
            if (word.length() > 0) {
                wordCountMap.put(word, wordCountMap.getOrDefault(word, 0) + 1);
            }
        }
        return wordCountMap;
    }
}