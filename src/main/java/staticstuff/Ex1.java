package staticstuff;

class X {
  static int MAX_VAL = 100;
  int value = 99;
  public void setVal(int x) {
    if (x <= MAX_VAL) value = x;
  }
  static void doStuff() {
    final int x;
    if (Math.random() > 0.5) {
      x = 10; // constant... primitive!!!
    } else {
      x = 12;
    }
//    x = x + 1;
    System.out.println(x);
    final StringBuilder sb = new StringBuilder("Hello");
    sb.append(" world!");
    System.out.println(sb);
    /*
    A) Runtime error
    B) Hello
    C)  world!
    D) Hello world!
     */
  }
}
public class Ex1 {
  public static void main(String[] args) {
    X a = new X();
    X b = new X();
    a.setVal(120);
    System.out.print(a.value + ", ");
    b.MAX_VAL = 150; // UGLY but legal (should be X.MAX_VAL)
    a.setVal(140);
    System.out.println(a.value);
    X.doStuff();
  }
}
