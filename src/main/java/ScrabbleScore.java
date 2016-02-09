import java.io.Console;
import java.util.*;

public class ScrabbleScore {
  public static void main(String[] args) {

  }

    public static int inputWord(String word) {
      int score = 0;
      HashMap<String, Integer> hmap = new HashMap<String, Integer>();
      // hmap.put(0, "a");
      // hmap.put(1, "e");
      // hmap.put(2, "i");
      // hmap.put(3, "o");
      // hmap.put(4, "u");
      // hmap.put(5, "l");
      // hmap.put(6, "n");
      // hmap.put(7, "s");
      // hmap.put(8, "r");
      // hmap.put(9, "t");
      // hmap.put(10, "d");//2
      // hmap.put(11, "g");
      // hmap.put(12, "b");//3
      // hmap.put(13, "c");
      // hmap.put(14, "m");
      // hmap.put(15, "p");
      // hmap.put(16, "f");//4
      // hmap.put(17, "h");
      // hmap.put(18, "v");
      // hmap.put(19, "w");
      // hmap.put(20, "y");
      // hmap.put(21, "k");//5
      // hmap.put(22, "j");//8
      // hmap.put(23, "x");
      // hmap.put(24, "q");//10
      // hmap.put(25, "z");

      hmap.put("a", 1);
      hmap.put("e", 1);
      hmap.put("i", 1);
      hmap.put("o", 1);
      hmap.put("u", 1);
      hmap.put("l", 1);
      hmap.put("n", 1);
      hmap.put("s", 1);
      hmap.put("r", 1);
      hmap.put("t", 1);
      hmap.put("d", 2);//2
      hmap.put("g", 2);
      hmap.put("b", 3);//3
      hmap.put("c", 3);
      hmap.put("m", 3);
      hmap.put("p", 3);
      hmap.put("f", 4);//4
      hmap.put("h", 4);
      hmap.put("v", 4);
      hmap.put("w", 4);
      hmap.put("y", 4);
      hmap.put("k", 5);//5
      hmap.put("j", 8);//8
      hmap.put("x", 8);
      hmap.put("q", 10);//10
      hmap.put("z", 10);

      char[] charArray = word.toCharArray();
      for (Integer i=0; i < charArray.length; i++){
        String letter = (Character.toString(charArray[i]));
          if (hmap.containsKey(letter)) {
          int value = hmap.get(letter);
          //test.equals("test") --> 'true'
          score = score + value;
        } else if (hmap.containsValue(letter)) {
          score = score;
        }
      }return score;
    }
  }


// charArray.charAt(i).equals('a')
