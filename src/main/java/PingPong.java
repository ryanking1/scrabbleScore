import java.io.Console;
import java.util.*;

public class PingPong {
  public static void main(String[] args) {
    Console console = System.console();
    int userNumber = 15;
    //System.out.println("Please Choose a Number:");
    //String stringUserNumber = console.readLine();
    //Integer userNumber = Integer.parseInt(stringUserNumber);

    //String[] pingPongList = new String[userNumber];
}
    public static ArrayList<String> myArrayMethod(Integer userNumber) {
    ArrayList<String> pingPongList = new ArrayList<String>();
    for (int i = 1; i <= userNumber; i++) {
      if (i % 15 == 0) {
        pingPongList.add("Ping Pong");
      } else if (i % 3 == 0) {
        pingPongList.add("ping");
      } else if (i % 5 == 0) {
        pingPongList.add("pong");
      } else {
        pingPongList.add(Integer.toString(i));
      }
      // System.out.println( pingPongList.get(i) );
    }

    //System.out.println("Ping Pong List:");
    //for ( Integer i = 0; i < userNumber; i++) {
    //  System.out.println( pingPongList.get(i) );
  //  }
    return pingPongList;
  }
}
