public class Acc{
   private String Nacc;
   private String name;
   private double balance;

   public void set_nacc(String n){
     this.Nacc= n;
   }
   public void set_name(String n){
    this.name= n;
   }
   public double get_balance(){
     return this.balance;
   }
   public String get_name(){
     return this.name;	   
   }
   public String get_nacc(){
     return this.Nacc;	   
   }
public Acc(String num, String name){
     this.set_nacc(num);
     this.set_name(name);
     this.balance= 0;
}
  public boolean deposit(double amount){
    if(amount < 0){
	    System.out.println("this can not be real");
	    return false;
    }
    else{
	    this.balance += amount;
	    return true;
    }
  }
  public boolean withdraw(double amount){
    if(amount < 0){
	    System.out.println("this can not be real");
	    return false;
    }
    else if(this.get_balance() - amount < 0 ){
	    System.out.println("you have less than what you are asking for");
	    return false;
         }
         else{
		 this.balance -= amount;
		 return true;
	 }
  }
  public void printinfo(){
    System.out.println("The owner is: " + this.get_name());
    System.out.println("the Account number: " + this.get_nacc());
    System.out.println("his balance: " + this.get_balance());
  }
  public boolean transfer(Acc c, double amount){
             if(this.withdraw(amount) == true ){
                    c.deposit(amount);
		    return true;
	     }
	     else return false;
  }
}

class SavingsAcc extends Acc{
  private double intrestRate;

  public void set_rate(double r){
   this.intrestRate= r/100;
  }
  public double get_rate(){
     return this.intrestRate;
  }
public SavingsAcc(String name, String num, double rate){
  super(num, name);
  this.set_rate(rate);
}

 public void apply_intrest(){
    this.deposit(this.get_balance()*this.get_rate());
 }
}

class CheckingAcc extends Acc{
  private double limit;

  public void set_limit(double amount ){
      this.limit= amount;
  }
  public double get_limit(){
    return this.limit;
  }
public CheckingAcc(String name, String num, double l){
  super(num, name);
   this.set_limit(l);
}
  public boolean withdraw(double amount){
	     if(amount < this.get_limit()){	
		super.withdraw(amount);
		return true;
	     }
	     else{
               System.out.println("you can not take this amount becuase is abouve the limit");
	       return false;
	     }
  }
}
class main{
 public static void main(String[] args){
   SavingsAcc c0= new SavingsAcc("si babi", "A00", 5);
   CheckingAcc c1= new CheckingAcc("Lambi", "69", 100);
   
   c0.deposit(1200);
   c1.deposit(999);
    
  c0.printinfo();
  c1.printinfo();

   c0.withdraw(200);
   c1.withdraw(50);
   
  c0.printinfo(); 
  c1.printinfo();
   
   c0.apply_intrest(); 
   c1.withdraw(200);

 c0.printinfo();
 c1.printinfo();
 }
}

