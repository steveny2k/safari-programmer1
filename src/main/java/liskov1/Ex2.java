package liskov1;

class Q22 {
  public int getValue() {
    return 1;
  }
}

public class Ex2 extends Q22 {
  //  public int getValue(int x) {
//    return 1;
//  }
//  public String getValue() {
//    return "Hello";
//  }
  public String getValue(int x) {
    return "Hello";
  }

}
