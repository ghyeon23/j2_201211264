package headfirst.strategy;

public class MallardDuck extends Duck{
  
  public MallardDuck() {
    //flyBehavior = new FlyWithWings();
    setFlyBehavior(new FlyRocketPowered());
    setQuackBehavior(new Quack());
  }
  
  public void display(){
    System.out.println("mallard...");
  }   
}