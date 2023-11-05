package CodeWars;

import java.util.Map;
import java.util.HashMap;

public class CharInString {
    public static Map<Character, Integer> count(String str) {
      Map<Character, Integer> chars = new HashMap<Character, Integer>();
      for (char c : str.toCharArray() ) {
        int cnt = (int) str.chars().filter(ch -> ch == c).count();
        if(chars.containsKey(c)){
          chars.put(c, chars.get(c) + cnt);
        }
        chars.put(c, cnt);
      }
      return chars;
    }
}