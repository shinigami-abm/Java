public abstract class Animal{
private String name;
private int number_legs;
 
 public void set_name(String n){
        this.name=n;
 }
 public void set_legs(int n){
        if(n > -1){
           this.number_legs=n;
	}
	else{
            System.out.println("The animal can not have negative number of legs");
	}
 }
public Animal(String n, int l){
       this.set_name(n);
       this.set_legs(l);
} 
 public String get_name(){
        return this.name;
 }
 public int get_legs(){
        return this.number_legs;
 }
 public void eat(){
        System.out.println(this.get_name() + " is eating."); 
 }
 public abstract void make_sound();
 public void print(){
      System.out.println("This is his name: " + this.get_name() + ".");    
      System.out.println("He has " + this.get_legs() + " legs."); 
 }
}
class Dog extends Animal{
public Dog(String n , int l){
 super(n, l);
}
	
@Override
 public void make_sound(){
        System.out.println("This Dog " + this.get_name() + " is barking."); 
 }
}
class Cat extends Animal{
public Cat(String n, int l){
super(n, l);
}
@Override
 public void make_sound(){
        System.out.println("This Cat " + this.get_name() + " is Moaing."); 
 }
}
class main{
 public static void main(String[] args){
         Dog d= new Dog("louis", 4);
	 Cat c= new Cat("bimbim", 4);

	 d.eat();
	 d.make_sound();
	 d.print();
	 c.eat();
	 c.make_sound();
	 c.print();
 }
}
