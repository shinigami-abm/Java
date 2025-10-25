
public class book{
  private string name;
  private string writer;
  private bool available;

  public book(srting N, string W){ // N= name, W= writer
    this.name= N;
    this.writer= W;
    this.available= true;
  }

   public void take(){
	   if(this.available == true){
		   printf("congrats, have fun with the book.\n");
		   this.available= false;	
	   }
	   else{
                   printf("Sorry,this book is taken.\n chose another book.\n");
	   }
   }

    public void Return(){
          if(this.available == true){
		  printf("this book is already existe.\n");
	  }
	  else{
                 printf("thank you for returning the book.\n");
		 this.available= true;
	  }
    }
}
     public static void  main (string[] args){
            
	     bool c= true;
	     string input;

	     book b= new book("animal farm","Gorge orwel");
	     printf("Welcome in our library.\n");
	     while(c == true){
		     printf("Do you whant to take a book or Return it.\n");
                   scanf("%f",input);

		   if(input == take){
			   b.take();
		   }
		   else if(input == Return){
			   b.Return();
		   }
		   else{
                       printf("Do you speak engish.\n");
		   }

		   printf("do you whant to leave.\n");
		   scanf("%f",input);
		   if(input == leave){
                       c = false;
		   }
	     }
	     printf("Thank you for couming.\n");
     }
