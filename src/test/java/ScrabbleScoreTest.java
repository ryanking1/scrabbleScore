import org.junit.*;
import static org.junit.Assert.*;
import java.util.*;

public class ScrabbleScoreTest {

  @Test
  public void scrabbleScore_returnsAScrabbleScoreForALetter_1() {
    App app = new App();
    Integer score = 1;
    assertEquals(score, app.scrabbleScore("a"));
  }

}
