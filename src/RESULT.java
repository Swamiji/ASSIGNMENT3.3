
public class RESULT {

	  String name;
	  int Roll_no;
	  float percentage;

	 public void Student1( String name,int Roll_no,float percentage)
	 {
	 	System.out.println("Details of Student1 :");
	 	System.out.println("Name="+name);
	 	System.out.println("Roll No="+Roll_no);
	 	System.out.println("Get Percentage="+percentage+"%");


	 	System.out.println(".....................................");
	 }

	 public void Student2(String name,int Roll_no,float percentage)
	 {
	 	System.out.println("Details of Student2 :");
	 	System.out.println("Name="+name);
	 	System.out.println("Roll No="+Roll_no);
	 	System.out.println("Get Percentage="+percentage+"%");	


	 	System.out.println(".....................................");
	 }
	 public void Student3(String name,int Roll_no,float percentage)
	 {
	 	System.out.println("Details of Student2 :");
	 	System.out.println("Name="+name);
	 	System.out.println("Roll No="+Roll_no);
	 	System.out.println("Get Percentage="+percentage+"%");		

	 }



	 	


	 public static void main(String[] args) {
	 		// TODO Auto-generated method stub

	 	RESULT student=new RESULT();
	 	student.Student1("Ankita",56,(float) 86.6);
	 	student.Student2("Adrija",67,(float) 84.2);
	 	student.Student3("Ayshi", 45,(float) 86.8);
	 	
	 	}

	 }


