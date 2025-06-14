import java.util.Arrays;

class Solution {
    public static String answerString(String word, int numFriends) {
        String arr[] = {};
        if (numFriends == 1) {
            return word;
        }

        for (int i = 0; i <= numFriends - 1; i++) {
            String temp = word.substring(i, word.length() - numFriends + i + 1);
            System.out.println(temp);
            System.out.println("sj");
            arr = Arrays.copyOf(arr, arr.length + 1);
            arr[arr.length - 1] = temp;
        }

        String result = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].compareTo(result) > 0) {
                result = arr[i];
            }
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(answerString("bif", 2));  // Output should be "if"
    }
}
