package hello;

import java.util.List;

public class Hello {
  public static void main(String[] args) {
    List.of("Fred", "Jim")
        .stream()
        .map((var s) -> "Hello " + s)
        .forEach(System.out::println);

  }
}
