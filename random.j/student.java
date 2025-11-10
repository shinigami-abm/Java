public class course{

  private string name;
  private int coeffi;
  private int max_students= 100;
  private int numbre;

  public course(string name, int coeff){
	  this.name=name;
	  this.coeffi= coeff;
	  this.number=0;
  }
	  public int inscri(students s){
		  if(this.number == max_students){
			  System.out.println("the course is full");
		  }
		  else{
			  this.number++ ;
			  System.out.println("congrats ,you have subscribde in this course ");
			  s.to_coeffi += this.coeffi;
			  return this.number;
		  }
	}
	public void print(){
             System.out.println("the name of course is" + this.name "\n the coefficent is" + this.coeffi "\nthis the number of the students" + this.number);
	}
	public int getcoe(){
           System.out.println("the coeffinent is" + this.coeffi);
	   return this.coeffi;
	}
}
 public class students{
  private string name;
  private string family_name;
  private float avrg;
  private int to_coeffi;

  public students(string name, string surname){
	  this.name= name;
	  this.family_name= surname;
	  this.avrg= 0;
	  this.to-coeffi= 0;
  }
  public void add_grade(float grade, course c){
	  this.avrg= this.avrg +garde/c.getcoe();
  }
  public void print_student(){
      System.out.println("the student name is " + this.name " " + this.family_name", his avrege is " + this.avrg );
  }
 }

public static void main(String[] args){
	students s= new students(Abdel mouaiz, Belarg);
	students s1= new students(Abdel kader, Djilali);

        course c1= new course(Algabra, 3);
	c1.print();
	course c2= new course(Algo, 4);
	c2.print();

        c1.inscri(s);
	c1.inscri(s1);
	c2.inscri(s);
	c2.inscri(s1);
         
	s.add_grade(12.25, c1);
        s.add_grade(15, c2);

	s1.add_grade(10, c1);
	s1.add_grade(8.25, c2);

	s.print_student();
	s1.print_students();
}
