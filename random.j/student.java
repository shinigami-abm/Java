public class course{
  private String name;
  private int coeffi;
  private int max_students= 100;
  private int numbre;

  public course(String name, int coeff){
	  this.name=name;
	  this.coeffi= coeff;
	  this.numbre=0;
  }
	  public int inscri(students s){
		  if(this.numbre == max_students){
			  System.out.println("the course is full");
			  return 100;
		  }
		  else{
			  this.numbre++ ;
			  System.out.println("congrats ,you have subscribde in this course");
			  s.to_coeffi += this.coeffi;
			  return this.numbre;
		  }
	}
	public void print(){
             System.out.println("the name of course is" + this.name); 
	     System.out.println("the coefficent is" + this.coeffi); 
	     System.out.println("this the number of the students" + this.numbre);
	}
	public int getcoe(){
           System.out.println("the coeffinent is" + this.coeffi);
	   return this.coeffi;
	}
}
  class students{
  private String name;
  private String family_name;
  private double avrg;
  private int to_coeffi;

  public students(String name, String surname){
	  this.name= name;
	  this.family_name= surname;
	  this.avrg= 0;
	  this.to_coeffi= 0;
  }
  public void add_grade(double grade, course c){
	  this.avrg= this.avrg +grade/c.getcoe();
  }
  public void print_student(){
      System.out.println("the student name is " + this.name );
      System.out.println(this.family_name);
      System.out.println(", his avrege is " + this.avrg );

 }
}
public static void main(String[] args){
	students s= new students("mouaiz", "belarg");
	students s1= new students("kader", "djilali");

        course c1= new course("Algabra", 3);
	c1.print();
	course c2= new course("Algo", 4);
	c2.print();

        c1.inscri(s);
	c1.inscri(s1);
	c2.inscri(s);
	c2.inscri(s1);
         
	s.add_grade(12.2, c1);
        s.add_grade(15, c2);

	s1.add_grade(10, c1);
	s1.add_grade(8.25, c2);

	s.print_student();
	s1.print_student();
 }
