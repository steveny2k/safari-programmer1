package banana;

import myservice.SvcInterface;

public class OtherService implements SvcInterface {
  @Override
  public String getMessage() {
    return "Second, banana, service";
  }
}
