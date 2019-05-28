package vartype;
class Base {
  void doBaseStuff() { System.out.println("doBaseStuff"); }
}

class Sub extends Base {
  void doBaseStuff() { System.out.println("doSubStuff"); }
  void doOtherStuff() { System.out.println("doOtherStuff"); }
}

public class Ex1 {
  public static void main(String[] args) {
    Base b = new Sub();
//    b.doOtherStuff(); // NOT ALLOWED, not certainty that this method exists
    ((Sub)b).doOtherStuff(); // CAST says "Trust me, I'm an engineer"
//    b.broken();
  }
}
