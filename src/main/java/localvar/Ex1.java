package localvar;

public class Ex1 {
//  var x = 99;
  void doStuff() {
    var var = "hello"; // "var" is a "pseudo-type"
    var x = 99;
//    x = 99; // initialization must be same statement as declaration
    System.out.println("value of x is " + x);
//    x = "hello";  // NO Still statically typed...
  }

  public static void main(String[] args) {
    new Ex1().doStuff();
  }
}
