package constr;
class P {
  String name;
  // this class has explicit constructor
  // compiler DOES NOT generate default..
  P(String s) {
    // compiler generated "super()" [suitable for Object]
    this.name = s;
  } // line n1
}
class C extends P { // line n4
  static String defaultName = "Fred";
  // compiler generates [iff zero defined constructors in my source]:
//  C() {
//    super();
//  }
  C(String s) {
//    this(); // infinite loop, not allowed!
    super(s);
    // other useful stuff...
  }
  C() {
    // don't duplicate "other useful stuff..."
    // delegate...
//    super(defaultName);
    this(defaultName);
//    super(); // NO, only delegate ONCE.
//    Something must end up doing super(...), and not this(..)
  }
  @Override // line n2
  public String toString() { return "P with name " + name; }
}

public class Ex1 {
  public static void main(String[] args) {
    P p = new C(); // line n3
    System.out.println(p);
  }
}
