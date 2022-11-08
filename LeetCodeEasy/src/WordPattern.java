//Given a pattern and a string s, find if s follows the same pattern.
//Here follow means a full match, such that there is a bijection
// between a letter in pattern and a non-empty word in s.

//Example 1:
//
//Input: pattern = "abba", s = "dog cat cat dog"
//Output: true
//Example 2:
//
//Input: pattern = "abba", s = "dog cat cat fish"
//Output: false
//Example 3:
//
//Input: pattern = "aaaa", s = "dog cat cat dog"
//Output: false

import java.util.HashMap;

public class WordPattern {
    public boolean wordPattern(String pattern, String s) {
        String[] arr = s.split(" ");
        HashMap<Character, String> wordMap = new HashMap<>();
        if (arr.length != pattern.length()) {
            return false;
        }
        for (int i = 0; i < arr.length; i++) {
            if (!wordMap.containsKey(pattern.charAt(i))) {
                if (wordMap.containsValue(arr[i])) {
                    return false;
                }
                wordMap.put(pattern.charAt(i), arr[i]);
            } else {
                if (!wordMap.get(pattern.charAt(i)).equals(arr[i])) {
                    return false;
                }
            }
        }
        return true;
    }
}
