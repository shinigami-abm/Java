import java.util.ArrayList;
import java.util.Scanner;

public class capsule{
 private String title;
 private String Oyear;
 private ArrayList<String> messeges= new ArrayList();
 private String pin_code;

 public void set_pin(String p){
      this.pin_code=p;
 }
  public void set_title(String t){
   this.title=t;
  } 
  public void set_year(String y){
   this.Oyear=y;
  }
  public String get_title(){
   return this.title;
  }
  public String get_year(){
   return this.Oyear;
  }
public capsule(String t, String y, String p){
 this.set_title(t);
 this.set_year(y);
 this.set_pin(p);
}
  public void add_messege(String m){
     this.messeges.add(m);
  }
  public void print_messeges(){
    for(String m: messeges){
      System.out.println(m);
    }
  }
 public void print_capsule(){
  System.out.println("capsule name is : "+ this.get_title());
  System.out.println("capsule year creation is : "+ this.get_year()); 
  System.out.println("the messeges that it has is: ");
  this.print_messeges();
 }
 private String get_pin(){
   return this.pin_code;
 }
 public boolean check_code(String c){
   if(this.get_pin().equals(c)){
         return true;
   }
   return false;
 }
}
class person{
 private String ID;
 private String name;
 
 public void set_id(String d){
   this.ID=d;
 }
 public void set_name(String n){
   this.name=n;
 }
 public String get_name(){
   return this.name;
 }
 public String get_id(){
  return this.ID;
 }
public person(String n, String d){
  this.set_name(n);
  this.set_id(d);
}
}
class creator extends person{
 private String Ccode;

 public void set_code(String c){
   this.Ccode=c;
 }
public creator(String d, String n, String c){
 super(n, d);
 this.set_code(c);
}
public static void create_capsule(){
	Scanner sc= new Scanner(); 
  System.out.println("Give me the title of the Digital time capsule.");
 String t= sc.nextline(systm.in);
  System.out.println("Give me the year and the month and the day.");
 String s= sc.nextline(systm.in);
  System.out.println("Give me the code, for the NOTICE:");
  System.out.println("do not forget the code or you will loose the capsule");
 String c= sc.nextline(systm.in);
  capsule c0= new capsule(t, y, c);
  vualt.add(c0);
 }
 public static void messegs(){
Scanner sc= new Scanner(); 
  while(true){	 
    System.out.println("Give me the title.");
    String t= sc.nextline(systm.in);
   System.out.println("Give me the pin code."); 
   String c= sc.nextline(systm.in);
     for(capsule c: vualt){
          if(c.get_title().equals(t)){
                   if(c.check_code(p) == false){
                        System.out.println("The code is wrong.");
		   }
		   else{
			  boolean ctr=false; 
                      while(ctr != true){
                                System.out.println("Give me the messege that you want to add.");
                                 String me= sc.nextline(systm.in);
				 c.add_messege(me);
				 System.out.println("fo you want to leave");
				 String f= sc.nextline(systm.in);
				 if(f.eaquals("yes")){
					 return;
				 }
		      }
		   }
	  }
	  else{
              System.out.println("There is no capsule with the name" + c.get_name() + ".");
	  }
     }
    System.out.println("Do you want to exit.");
    String f= sc.nextline(systm.in);
    if(f.equals("yes")){
	    return;
    }
  }
 }
}
class viewer extends person{
  private String Vcode;

  public void set_code(String v){
    this.Vcod=v;
  }
public viewer(String d, String n, String v){
 super(n,d);
 this.set_code(v);
}
 public static void view(){
Scanner sc= new Scanner(); 
  while(true){	 
    System.out.println("Give me the title.");
    String t= sc.nextline(systm.in);
     for(capsule c: vualt){
          if(c.get_title().equals(t)){ 
                      while(ctr != true){
                                c.print_capsule();
				 System.out.println("do you want to leave");
				 String f= sc.nextline(systm.in);
				 if(f.eaquals("yes")){
					 ctr = true;
				 }
		      }
	  }
	  else{
              System.out.println("There is no capsule with the name" + c.get_name() + ".");
	  }
     }
    System.out.println("Do you want to exit.");
    String f= sc.nextline(systm.in);
    if(f.equals("yes")){
	    return;
    }
  }
}
class main{
 public static void main(args[] String){
    ArrayList<capsule> vualt= new ArrayList();

    creator c0= new creator("404", "lambi", "000");
    viewer v0= new viewer("999", "yoo", "101");

   sc.close();
 }
}
