package headfirst.strategy;

public abstract class Duck {
 protected FlyBehavior flyBehavior;//�Ӽ��� private�� ���̴� �� = encapsulation
 QuackBehavior quackBehavior;
 
 public Duck() {
 }
 
 public void setFlyBehavior (FlyBehavior fb) {
  flyBehavior = fb;
 }
 
 public void setQuackBehavior(QuackBehavior qb) {
  quackBehavior = qb;
 }
 
 abstract void display(); //�Լ� �ϳ��̻��� abstract�̸� Ŭ������ abstract��
 
 public void performFly() {
  flyBehavior.fly();
 }
 
 public void performQuack() {
  quackBehavior.quack();
 }
 
 public void swim() {
  System.out.println("All ducks float, even decoys!");
 }
}