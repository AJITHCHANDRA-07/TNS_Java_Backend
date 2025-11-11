package DEMO_CLASS;
//  Main Class
public class Main {

	public static void main(String[] args) {
	// Creating the demo class for Demo_Class
     Demo_Class ob=new Demo_Class();
     Demo_Class ob1=new Demo_Class();
     Demo_Class ob2=new Demo_Class();
     
     ob.name="Ajithchandra";
     ob.branch="Compute Science and Engineering";
     ob.Current_year= 4;
     ob.Status = "Pass";
     
     ob1.name="Vamshi";
     ob1.branch="ECE";
     ob1.Current_year=7;
     ob1.Status = "Pass";
     
     ob2.name="Ranjith";
     ob2.branch="Mechanical";
     ob2.Current_year=4;
     ob2.Status = "Pass";
     // Method Call to print student details
     ob.Student_Details();  // student 1 details
     ob1.Student_Details();  // student 2 details
     ob2.Student_Details();  // student 3 details
	}
}