 public class acc{
   private  float id;
   private  double sold;
   private  boolean autorise;
   private  double maxdv= 100000;

   public acc(float id, double sold){
	   this.id= id ;
	   this.sold = sold;
	   this.autorise = false;

   }
   public void activate(){
     if(this.autorise == false && this.sold > 1000){
                 this.autorise= true;
		 this.sold-= 1000;
     }
     else if(this.autorise == true){
	     System.out.println("your account is already activated");
          }
          else{ System.out.println(" you dont have good balnce");}
   }
   public void deposit(double plus){

       this.sold+=plus;
   }
   public void take(double amount){
    if(this.sold > amount && this.autorise == true){
	   this.sold= this.sold - amount;
    }
    else if(amount < maxdv && this.autorise == true ){
	    this.sold =this.sold - amount;
         }
         else if(amount > maxdv){
		 System.out.println("thr amount you want to take is more than the max");
              }
	      else{
		      System.out.println("the account is not active");
	      }
    
   }
   public void print(){
	   System.out.println(" Account id=" + this.id);
	   System.out.println("The amount is sold=" + this.sold);
   }
   public void change(acc A, double amount){ 
	   if(A.sold > amount){
	        A.sold=A.sold-amount;
                 this.sold=this.sold+ amount;
	   }
	   else{
                  System.out.println("the  account the you want to take has less than you want");
	   }
   }
 
  public static void main(String[] args){

	  acc a= new acc(001, 4000);
	  a.activate();
	  a.deposit(1000);
	  a.take(2500);
	  a.print();
	   
	  acc b= new acc(002, 5000);
	  b.activate();
	  a.change(b, 1000);
	  a.print();
	  b.print();

	  acc c= new acc(999, 300);
	  c.activate();
	  c.print();
  }
}
  
