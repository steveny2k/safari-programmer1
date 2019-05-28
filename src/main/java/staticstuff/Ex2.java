package staticstuff;
class Y {
  static String sayHi() { return "Y-Hello"; }
  String sayHi2() { return "Y-Hello2"; }
}
class Z extends Y {
  static String sayHi() { return "Z-Hello"; }
  String sayHi2() { return "Z-Hello2"; }
}
public class Ex2 {
  public static void main(String[] args) {
    Y y = new Z();
    System.out.println(y.sayHi() + ", " +y.sayHi2());
    // compiler generates:
    //                 Y.sayHi()
  }
}
