import java.util.*;

public class Solution {
    public List<Integer> findSubstring(String s, String[] words) {
        List<Integer> res = new ArrayList<>();
        if(s == null || words == null || words.length == 0){
            return res;
        }
        
        int wordLen = words[0].length();
        int wordCnt = words.length;
        int totalLen = wordLen * wordCnt;

        // Frequency map for words
        Map<String, Integer> wordMap = new HashMap<>();
        for(String word : words){
            wordMap.put(word, wordMap.getOrDefault(word, 0) + 1);
        }
        
        // Iterate over different word start positions (0 to wordLen - 1)
        for (int i = 0; i < wordLen; i++) {
            int left = i, right = i;
            Map<String, Integer> windowMap = new HashMap<>();

            while (right + wordLen <= s.length()) {
                String word = s.substring(right, right + wordLen);  // Extract the word from the current window
                System.out.println("Extracted word: " + word + " from s.substring(" + right + ", " + (right + wordLen) + ")");
                right += wordLen;

                if (wordMap.containsKey(word)) {
                    windowMap.put(word, windowMap.getOrDefault(word, 0) + 1);
                    
                    // If word count exceeds the required count, adjust left pointer
                    while (windowMap.get(word) > wordMap.get(word)) {
                        String leftWord = s.substring(left, left + wordLen);
                        windowMap.put(leftWord, windowMap.get(leftWord) - 1);
                        left += wordLen;
                        System.out.println("Adjusted window: Left pointer moved to " + left + " after removing " + leftWord);
                    }

                    // If window size matches total length, add starting index to result
                    if (right - left == totalLen) {
                        res.add(left);
                        System.out.println("Valid substring found, adding index: " + left);
                    }
                } else {
                    // Reset window if word is not in wordMap
                    windowMap.clear();
                    left = right;
                    System.out.println("Word not in wordMap, resetting window: left = " + left);
                }
            }
        }

        return res;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        String s = "barfoothefoobarman";
        String[] words = {"foo", "bar"};
        List<Integer> result = solution.findSubstring(s, words);
        System.out.println("Result indices: " + result);
    }
}
