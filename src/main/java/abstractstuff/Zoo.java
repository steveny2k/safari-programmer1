package abstractstuff;

abstract class Animal {
//interface Animal {
  public String name;
  public Animal(String name) {
    this.name = name;
  }
  public abstract String getFavoriteFood();
//  { return null; }
  public abstract void eat(String food); //  {}
  @Override
  public String toString() {
    return this.getClass().getName() + " with name " + this.name;
  }
}
class Tiger extends /*implements*/ Animal {
  public Tiger(String name) {
    super(name);
  }
//  public abstract void doStuff();
  public String getFavoriteFood() {
    return "Meat";
  }
  public void eat(String food) {
    if ("Meat".equals(food)) {
      System.out.println("Roar, munch munch, eating " + food);
    } else {
      System.out.println("Roar, bite and threaten keeper!");
    }
  }
}
class Bear extends /*implements*/ Animal {
  public Bear(String name) {
    super(name);
  }
  public String getFavoriteFood() {
    return "Honey";
  }
  public void eat(String food) {
    if ("Honey".equals(food)) {
      System.out.println("Munch munch, eating " + food + " going to sleep.");
    } else {
      System.out.println("Roar, run around!");
    }
  }
}
public class Zoo {
  public static void feed(Animal a) {
    System.out.println("Feeding " + a);
    String food = a.getFavoriteFood();
    a.eat(food);
  }
  public static void main(String[] args) {
    Animal [] stock = {
//        new Animal(),
        new Tiger("Tony"),
        new Bear("Pooh")
    };
    for (Animal a: stock) {
//      System.out.println("Animal is a " + a.getClass().getName());
        feed(a);
    }
  }
}
