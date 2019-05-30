package myservice;

import impl.MyImplementation;

public interface SvcInterface {
  String getMessage();
  static SvcInterface get() {
    return new MyImplementation();
  }
}
