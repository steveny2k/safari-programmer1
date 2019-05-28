package casts;
class P {}
class A extends P {}
class B extends P {}

class Base {
  void doBaseStuff() { System.out.println("doBaseStuff"); }
}

class Sub extends Base {
  void doBaseStuff() { System.out.println("doSubStuff"); }
  void doOtherStuff() { System.out.println("doOtherStuff"); }
  static void staticMethod() {
    System.out.println("Static method...");
  }
}

public class Ex1 {
  public static void doStuff(Base b) {
    if (b instanceof Sub) {
      ((Sub) b).doOtherStuff();
    }
  }
  public static void main(String[] args) {
    Sub s = new Sub();
    doStuff(s);
//    byte smallValue = (byte)99;
//    Base b = new Base();
    Base b = new Sub();
//    ((Sub)b).doOtherStuff();
//    Sub s = null;
//    s.doOtherStuff();
//    ((Sub)null).doOtherStuff();
//    ((Sub)b).staticMethod();
//    ((Sub)null).staticMethod();
    A a = new A();
//    B b = (B)a;// never allowed!
//    B b1 = (B)(P)a; // tricked the compiler, will fail at runtime!
    P p = new B();
    P p1 = new A();
//    A x = (A)p; // fails at runtime
  }
}
