package impl;

import myservice.SvcInterface;

public class MyImplementation implements SvcInterface {
  static {
    System.out.println("Loading MyImplementation...");
  }
  @Override
  public String getMessage() {
    return "Hello I'm a service";
  }
}
