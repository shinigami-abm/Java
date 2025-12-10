public class emplo{
    private String ID;
    private String name;
    private String depart;
    private double salary;

   public void set_department(String d){
	   this.depart= d;
   }  
   public void set_salary(double amount){
	   if(amount < 0){
		   System.out.println("this can not be real");
	   }
	   else{
             this.salary= amount;
	   }
   }
   public String get_id(){
    return this.ID;
   }
   public String get_name(){
    return this.name;
   }
   public String get_department(){
    return this.depart;
   }
   public double get_salary(){
    return this.salary;
   }
   public emplo(String id, String n, String d, double amount){
	   this.ID= id;
	   this.name= n;
	   this.set_salary(amount);
	   this.set_department(d);
   }
   public emplo(String id, String n, String d){
	   this.ID= id;
	   this.name =n;
	   this.set_department(d);
	   this.salary= 0;
   }
   public void increase(double amount){
	   if(amount <0){
		   System.out.println("this can not be real");
	   }
	   else{
              this.salary += amount;
	   }
   }
   public void decrease(double amount){
	   if(amount < 0){
		   System.out.println("this can not be real");
	   }
	   else if(this.salary < amount){
		   System.out.println("the amount is too big");
	        }
	        else{
                   this.salary -= amount;
		}
   }
   public void transfer(String d){
	   this.depart= d;
   }
   public void display(){
	   System.out.println("his ID: " + this.get_id());
           System.out.println("His name: " + this.get_name());
           System.out.println("depatment: " + this.get_department());
           System.out.println("salary: " + this.get_salary() + " USD");

   }
   public double annual_salary(){
           return 12*this.get_salary();
   }
}
class Main{
  public static void main(String[] args){
	  emplo e1= new emplo("E001", "john smith", "IT", 5000);
          emplo e2= new emplo("E002", "sarah johanson", "HR", 4500);
          emplo e3= new emplo("E999", "si babi", "finance", 9999);
          
	  e1.increase(1000);
	  e2.transfer("marketing");
	  e3.decrease(500);
	  e1.decrease(7000);

	  e1.display();
           e2.display();
            e3.display();

	    System.out.println("si babi annual salary:" + e3.annual_salary());
  }









}
