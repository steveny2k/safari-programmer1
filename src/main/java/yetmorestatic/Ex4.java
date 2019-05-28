package yetmorestatic;

class Y {
  int y = 99;
  static String sayHi() { return "Y-Hello "; }
}
class Z extends Y {
  int y = 100;
  static String sayHi() { return "Z-Hello " + new Z().y; }
}
public class Ex4 {
  public static void main(String[] args) {
    Z z = new Z();
    System.out.println(Y.sayHi() + ", " + z.sayHi());
  }
}
