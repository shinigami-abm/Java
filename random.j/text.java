public class text{
  public static void main (String[] args){
	  String record= "John Doe|Mathematics|A+|95|University of Cairo";
	  String[] list= record.split("\\|");
        
       System.out.println("Name:  " + list[0]);
       System.out.println("Subject:  " + list[1]);
       System.out.println("Grade:  " + list[2]);
       System.out.println("Score: " + list[3]);
       System.out.println("University:  " + list[4]);
       System.out.println("Result:  EXCELLENT!");
       System.out.println("");

          String[] f_name= list[0].split(" ");

          System.out.println("First Name: " + f_name[0]);
	  System.out.println("Last Name: " + f_name[1]);
  }













}
