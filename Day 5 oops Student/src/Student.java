
public class Student {

  int rollno;
  String namesofstudent;
  int mobileno;

    public int getRollno()
    {
    	return rollno;
    }
    public void setRollno(int Rollno)
    {
        this.rollno=Rollno;
    }
  
  public String getNamesofstudent()
  {
	    return namesofstudent;
  }
  public void setNamesofstudent(String Namesofstudent)
  {
	    this.namesofstudent=Namesofstudent;
  }
  
  public int getMobilenno()
  {
  	return mobileno;
  }
  public void setMobileno(int Mobileno)
  {
      this.mobileno=Mobileno;
  }
  void display()
  {
	  System.out.println("roll number of student is");
  }
  void display1()
  {
	 System.out.println("Name of student");
  }
  void display2()
  {
	  System.out.println("Mobile number of student");
  }
  
  public static void main(String []args)
  {
	  //object creation
	  Student stu=new Student(); //syntax classname objectname=new keyword classname();
	  stu.display();
	  stu.setRollno(77);
	  System.out.println(stu.getRollno());
	  
	  stu.display1();
	  stu.setNamesofstudent("akshay thorat");
	  System.out.println(stu.getNamesofstudent());
	  
	  stu.display2();
	  stu.setMobileno(880581663);
	  stu.setMobileno(stu.getMobilenno());
	  System.out.println(stu.getMobilenno());
  }
  
}
