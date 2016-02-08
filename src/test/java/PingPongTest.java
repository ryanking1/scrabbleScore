import org.junit.*;
import static org.junit.Assert.*;

public class PingPongTest {

  @Test
  public void isPingPong_forNumberDivisibleByFifteen_true() {
    PingPong pingPong = new PingPong();
    assertEquals("Ping Pong", PingPong.isPingPong(15));
  }
  @Test
  public void isPingPong_forNumberDivisibleByThree_true() {
    PingPong pingPong = new PingPong();
    assertEquals("ping", PingPong.isPingPong(3));
   }
  @Test
  public void isPingPong_forNumberDivisibleByFive_true() {
    PingPong pingPong = new PingPong();
    assertEquals("pong", PingPong.isPingPong(5));
    }

}
