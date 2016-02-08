import org.junit.*;
import static org.junit.Assert.*;
import java.util.*;

public class PingPongTest {

  @Test
  public void isPingPong_forNumberDivisibleByFifteen_true() {
    PingPong pingPong = new PingPong();
    //assertEquals("Ping Pong", PingPong.isPingPong(15));
    assertEquals(new ArrayList<>(Arrays.asList("1","2","ping","4","pong","ping","7","8","ping","pong","11","ping","13","14","Ping Pong")), pingPong.myArrayMethod(15));
  }
  @Test
  public void isPingPong_forNumberDivisibleByThree_true() {
    PingPong pingPong = new PingPong();
    //assertEquals("ping", PingPong.isPingPong(3));
    assertEquals(new ArrayList<>(Arrays.asList("1","2","ping")), pingPong.myArrayMethod(3));
   }
  @Test
  public void isPingPong_forNumberDivisibleByFive_true() {
    PingPong pingPong = new PingPong();
    //assertEquals("pong", PingPong.isPingPong(5));
    assertEquals(new ArrayList<>(Arrays.asList("1","2","ping","4","pong")), pingPong.myArrayMethod(5));
    }
}
