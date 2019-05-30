package lambdastuff;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

//@FunctionalInterface
//interface StudentCriterion {
//  boolean test(Student s);
////  void doStuff();
//}
class SmartStudentCriterion implements /*StudentCriterion*/ Predicate<Student> {
  @Override
  public boolean test(Student s) {
    return s.getGpa() > 3;
  }
}
public class School {
//  public void showAll(List<? extends Object> ls) {
  public static void showAll(List<?> ls) {
    for (Object s : ls) {
      System.out.println("> " + s);
    }
    System.out.println("-------------------------");
  }
  public static List<Student> getSmart(List<Student> ls, double threshold) {
      List<Student> out = new ArrayList<>();
      for (Student s : ls) {
        if (s.getGpa() > threshold) {
          out.add(s);
        }
      }
    return out; // not immutable...
  }
  public static List<Student> getEnthusiastic(List<Student> ls, int threshold) {
      List<Student> out = new ArrayList<>();
      for (Student s : ls) {
        if (s.getCourses().size() > threshold) {
          out.add(s);
        }
      }
    return out; // not immutable...
  }
  public static List<Student> getByCriterion(
      List<Student> ls, /*StudentCriterion*/Predicate<Student> crit) {
      List<Student> out = new ArrayList<>();
      for (Student s : ls) {
        if (crit.test(s)) {
          out.add(s);
        }
      }
    return out; // not immutable...
  }
  public static void main(String[] args) {
    List<Student> roster = List.of( // Arrays.asList(...);
        Student.of("Fred", 2.7, "Math", "Physics", "Chemistry"),
        Student.of("Jim", 3.1, "Art", "History"),
        Student.of("Sheila", 3.7, "Math", "Physics", "Astrophysics", "Quantum Mechanics")
    );
    System.out.println("--- all students ---");
    showAll(roster);
    System.out.println("--- smart students ---");
    showAll(getSmart(roster, 3.5));
    System.out.println("--- enthusiastic students ----");
    showAll(getEnthusiastic(roster, 2));
    System.out.println("--- fairly smart students ---");
    showAll(getByCriterion(roster, new SmartStudentCriterion()));

//    System.out.println("--- students taking Math ---");
//    showAll(getByCriterion(roster, new StudentCriterion() {
//      @Override
//      public boolean test(Student s) {
//        return s.getCourses().contains("Math");
//      }
//    }));

//    System.out.println("--- students taking Art ---");
//    showAll(getByCriterion(roster, /*new StudentCriterion() {
//      @Override
//      public boolean test*/(Student s) -> {
//        return s.getCourses().contains("Art");
//      }
//   /* }*/));

//    System.out.println("--- students taking Art ---");
//    showAll(getByCriterion(roster,
//        (Student s) -> { return s.getCourses().contains("Art"); }
//      ));

    // Java 11 only! all or none args use var
//    System.out.println("--- students taking Art ---");
//    showAll(getByCriterion(roster,
//        (var s) -> { return s.getCourses().contains("Art"); }
//      ));

    System.out.println("--- students taking Art ---");
    showAll(getByCriterion(roster,
        s -> s.getCourses().contains("Art")
      ));

//    Object obj = s -> s.getCourses().contains("Art");
    Predicate<Student> pred = s -> s.getCourses().contains("Art");
  }
}
