import java.util.ArrayList;
import java.util.Scanner;

public class MainClass {
	static Scanner input = new Scanner(System.in);
	static ArrayList<Student> studentList = new ArrayList<Student>();
	public static void main(String[] args) {
		
		System.out.println("Student management System");
		System.out.println("++++++++++++++++++++++++++++++");
		studentList.add(StudentUtility.student1);
		studentList.add(StudentUtility.student2);
		studentList.add(StudentUtility.student3);
		while(true) {
			System.out.println("1.create a student");
			System.out.println("2.read all the student");
			System.out.println("3.read all the student order by age");
			System.out.println("4.read all the student order by name");
			System.out.println("5.update any student");
			System.out.println("6.delete any student");
			System.out.println("7.log out");
			System.out.println("+++++++++++++++++++++++++++++++++++++++");
			System.out.println("Enter your choice:");
			int choice = input.nextInt();
			switch(choice) {
			case 1:
				boolean result =HelperClass.addStudent(studentList,input);
				if(result)
					System.out.println("Student successfully added");
				else 
					System.out.println("something wnet wrong try again!!");
				break;
			case 2:
				boolean result1=HelperClass.readAllStudent(studentList);
				if (result1)
					System.out.println("Student Records Displayed");
				else
					System.out.println("Null Records");
				break;
			case 3:
			boolean result2=HelperClass.OrderedbyAge(studentList);
			if (result2)
				System.out.println("Student Ordered by Age");
			else
				System.out.println("Not Ordered");
			break;
			case 4:
				boolean result3=HelperClass.OrderedbyName(studentList);
				if (result3)
					System.out.println("Student Ordered by Name");
				else
					System.out.println("Insertion Order");
				break;
			case 5:
				boolean result4=HelperClass.updateSchoolName(studentList, input);
				if(result4)
					 System.out.println("School Name updated successfully.");
				else
					System.out.println("Student ID not found.");
				
				break;
			case 6:
				boolean result5=HelperClass.removeStudent(studentList, input);
				if(result5)
					 System.out.println("Student Name deleted successfully.");
				else
					System.out.println("Student name not found.");
				break;
			case 7:
				System.exit(0);
				break;
			
			}
			
		}
		
		
	}

}
