import java.util.HashMap;

public class hashing{
    public static void main(String[] args) {
        String input = "this is a test this is only a test";

        // Split into words
        String[] words = input.split("");

        // Create a HashMap
        HashMap<String, Integer> freqMap = new HashMap<>();

        // Count word frequency
        for (String word : words) {
            freqMap.put(word, freqMap.getOrDefault(word, 0) + 1);
        }

        // Print word frequencies
        for (String word : freqMap.keySet()) {
            System.out.println(word + ": " + freqMap.get(word));
        }
    }
}
