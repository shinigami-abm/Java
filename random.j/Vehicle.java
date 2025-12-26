public class Vehicle{
  private int speed;
  
  public void set_speed(int s){
     if(s < 0){
          System.out.println("this speed is not real");
     }
     else{
    this.speed= s;
     }
  }
public Vehicle(int s){
  this.set_speed(s);
}
  public int get_speed(){
   return this.speed;
  }
  public void move(){
   System.out.println("this " +  Vehicle.class.getName() + " is moving at speed = " + this.get_speed());
  }
}

 class Car extends Vehicle{
   private String brand;

  public void set_brand(String b){
      this.brand= b;
   }
  public Car(int s, String b){
   super(s);
   this.set_brand(b);
  }
 }
 class main{
   public static void main(String[] args){
	   Vehicle v= new Vehicle(10);
	   Car c= new Car(120, "snaytra");
	   c.move();
	   v.move();
   }
 }

