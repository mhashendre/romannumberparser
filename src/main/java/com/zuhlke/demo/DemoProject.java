package com.zuhlke.demo;

import java.util.HashMap;
import java.util.Map;

/** This class converts the roman numerals into integers. I,II,III,IV,V,VI,VII,VIII,IX,X */
public class DemoProject {

  Map<Character, Integer> charValues = new HashMap<>();

  {
    charValues.put('I', 1);
    charValues.put('V', 5);
    charValues.put('X', 10);
    charValues.put('L', 50);
    charValues.put('C', 100);
    charValues.put('D', 500);
    charValues.put('M', 1000);
  }

  public int parseRomanVal(String i) {
    int count = 0;
    char[] chars = i.toCharArray();
    Character prevChar = null;
    for (char c : chars) {
      if (prevChar != null
          && (charValues.containsKey(prevChar) ? charValues.get(prevChar) : 0)
              < (charValues.containsKey(c) ? charValues.get(c) : 0)) {
        count =
            (charValues.containsKey(c) ? charValues.get(c) : 0)
                - (charValues.containsKey(prevChar) ? charValues.get(prevChar) : 0);
      } else {
        count += charValues.containsKey(c) ? charValues.get(c) : 0;
      }
      prevChar = c;
    }
    return count;
  }
}
