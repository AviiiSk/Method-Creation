//JAVA EVENING BATCH 08 OCT 2022
//JAVA ASSIGNMENT 3
//AVESH IBRAHIM SHAIKH ---> 


// Question :  Design the separate method as String getStudentName (String name) which return student name and print it.




public class Avesh3 {
	
	public  String getStudentName (String name) {
		
		return name;
		
	}

	public static void main(String[] args) {
		
		String name = "Avesh Shaikh";
		
		Avesh3 obj = new Avesh3();
		
	    String d = obj.getStudentName(name);
		System.out.println("Print Student Name : " + d);
		
	}

}
