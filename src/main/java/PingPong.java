public class PingPong {
  public static void main(String[] args) {}

  public static String isPingPong(Integer userNumber) {
    if (userNumber % 15 == 0) {
      return "Ping Pong";
    } else if (userNumber % 3 == 0) {
      return "ping";
    } else if (userNumber % 5 == 0) {
      return "pong";
    } else {
      return "false";
    }
  }
}
