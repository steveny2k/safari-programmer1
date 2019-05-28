package morestatic;
class Y {
  static String sayHi() { return "Y-Hello"; }
  String sayHi2() { return "Y-Hello2"; }
}
class Z extends Y {
  static String sayHi() { return "Z-Hello"; }
  String sayHi2() { return "Z-Hello2"; }
}
public class Ex3 {
  public static void main(String[] args) {
//    System.out.println(Z.sayHi() + ", " + Y.sayHi2());
  }
}
