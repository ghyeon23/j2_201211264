package headfirst.singleton.stat;

public class Singleton{
  private static Singleton uniqueInstance = new Singleton();
  private static int numCalled = 0;
  private Singleton(){}  
  
  public static Singleton getInstance(){
    System.out.println("Returning instance of Singleton");
    System.out.println("Number Called "+numCalled);
    numCalled++;
    return uniqueInstance;
  }
}