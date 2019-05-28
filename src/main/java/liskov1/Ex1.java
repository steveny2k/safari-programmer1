package liskov1;
class Base {
  Base doStuff() {
    return new Base();
  }
  CharSequence getStuff() {
    return "Hello";
  }
  long getVal() {
    return 99L;
  }
}
class Sub extends Base {
  @Override
  /*int*/ long getVal() {// primitive returns must be IDENTICAL in overrides...
    return 99;
  }
  @Override
  Sub doStuff() {
    return new Sub();
  }
  @Override
  StringBuilder getStuff() {
    return new StringBuilder();
  }
}
public class Ex1 {

  public static void main(String[] args) {
    Base b = new Sub();
    Base res = b.doStuff();
  }
}
