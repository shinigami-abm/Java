 public class acc{
   private  float id;
   private  double sold;
   private  boolean autorise;
   private  double maxdv= 100000;

   public acc(float id, double sold){
	   this.id= id ;
	   this.sold = sold;
	   this.autorise = true;

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
		 printf("thr amount you want to take is more than the max\n");
              }
	      else{
		      printf("the account is not active\n");
	      }
    
   }
   public void print(){
	   printf(" Account id=%d\n",this.id);
	   printf("The amount is sold=%f\n",this.sold);
   }
   public void change(acc A, double amount){ 
	   if(A.sold > amount){
	        A.sold=A.sold-amount;
                 this.sold=this.sold+ amount;
	   }
	   else{
                  printf("the  account the you want to take has less than you want\n");
	   }
   }
 


 }
  public static void main(String[] args){

	  acc a= new acc(001, 4000);
	  a.daposit(1000);
	  a.take(2500);
	  a.print();
	   
	  acc b= new acc(002, 5000);
	  a.change(b, 1000);
	  a.print();
	  b.print();
  }
  
