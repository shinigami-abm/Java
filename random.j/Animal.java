public class Animal{
 public void sound(){
  System.out.println("the animal makes a sound");
 }
}
class Dog extends Animal{
  public void sound(){
  // super.sound();
   System.out.println("The Dog barks");
  }
}
class main{
 public static void main(String[] args){
  Animal a= new Animal();
  Dog d= new Dog();
  a.sound();
  d.sound();
 }
}
