import java.io.Console;
import java.util.Map;
import java.util.HashMap;
import spark.ModelAndView;
import spark.template.velocity.VelocityTemplateEngine;
import static spark.Spark.*;


public class ScrabbleScore {
  public static void main(String[] args) {
    String layout = "templates/layout.vtl";

    get("/", (request, response) -> {
      Map<String, Object> model = new HashMap<String, Object>();
      model.put("template", "templates/home.vtl");
      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());

    get("/detector", (request, response) -> {
      Map<String, Object> model = new HashMap<String, Object>();
      model.put("template", "templates/detector.vtl");

      String word = request.queryParams("word");
      int score = inputWord(word);
      model.put("word", score);
      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());

  }

    public static int inputWord(String word) {
      int score = 0;
      HashMap<String, Integer> hmap = new HashMap<String, Integer>();


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
