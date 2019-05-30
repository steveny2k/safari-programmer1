package myclient;

//import impl.MyImplementation;
//import impl.MyImplementation;
import myservice.SvcInterface;

import java.lang.reflect.Method;
import java.util.ServiceLoader;

public class Main {
  static {
    System.out.println("Loading Main class");
  }
  public static void main(String[] args) throws Throwable {
//    SvcInterface svc = SvcInterface.get();
//    SvcInterface svc = new MyImplementation();

    ServiceLoader<SvcInterface> loader = ServiceLoader.load(SvcInterface.class);
    for (SvcInterface svc : loader) {
      System.out.println("Service implemented by " + svc.getClass().getName());
      System.out.println("Message of the day is " + svc.getMessage());
    }

//    SvcInterface svc = null;
//    System.out.println("About to load class...");
//    Class<?> cl = Class.forName("impl.MyImplementation");
//    System.out.println("Class loaded...");
//    Object obj = cl.getConstructor().newInstance();
//    System.out.println("object's type is " + obj.getClass().getName());
//    Method m = cl.getDeclaredMethod("getMessage");
//    Object result = m.invoke(obj);
//    System.out.println("get Message returned " + result);
  }
}
