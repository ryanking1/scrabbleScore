import org.junit.*;
import static org.junit.Assert.*;
import java.util.*;

public class ScrabbleScoreTest {

  @Test
  public void scrabbleScore_returnsAScrabbleScoreForALetter_1() {
    ScrabbleScore scrabbleScore = new ScrabbleScore();
    int score = 1;
    assertEquals(score, scrabbleScore.inputWord("a"));
  }
  @Test
  public void scrabbleScore_returnScore_3() {
    ScrabbleScore scrabbleScore = new ScrabbleScore();
    int score = 3;
    assertEquals(score, scrabbleScore.inputWord("aei"));
  }
}
