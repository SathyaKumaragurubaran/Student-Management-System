import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class HelperClass {
	
	public static boolean addStudent(ArrayList<Student> arr, Scanner input) {
		System.out.println("Enter Student ID:");
		int id = input.nextInt();
		System.out.println("Enter Student NAME:");
		String name = input.next();
		System.out.println("Enter Student CLASS:");
		int classno= input.nextInt();
		System.out.println("Enter Student AGE:");
		int age=input.nextInt();
		System.out.println("Enter Student SCHOOL:");
		String schoolName = input.next();
		
		Student s = new Student(id, name, classno, age, schoolName);
		arr.add(s);
		return true;
		
	}
	
	public static boolean readAllStudent(ArrayList<Student> arr) {
		System.out.println("Student Lists");
		System.out.println("ID\t Name\t Class\t Age\t School");
		for (Student s : arr) {
			System.out.println(s.getStudentId() + "\t" + s.getStudentName() + "\t" + s.getStudentClass() + "\t" + s.getStudentAge() + "\t" + s.getStudentSchoolName());
		}
		return true;
}
	
	public static boolean updateSchoolName(ArrayList<Student> arr, Scanner input) {
	    System.out.println("Enter Student ID whose school want to update:");
	    int updateId = input.nextInt();
	    System.out.println("Enter the new School Name:");
        String updateSchoolName = input.next();

	    for (Student s : arr) {
	        if (s.getStudentId() == updateId) {
	            s.setStudentSchoolName(updateSchoolName);       
	        }
	    }
	    return true;
	}
	public static boolean OrderedbyAge(ArrayList<Student> arr) {
		Collections.sort(arr, new Helper2());
		System.out.println("ID\t Name\t Class\t Age\t School");
		for (Student s : arr) {
			System.out.println(s.getStudentId() + "\t" + s.getStudentName() + "\t" + s.getStudentClass() + "\t" + s.getStudentAge() + "\t" + s.getStudentSchoolName());
		}
		return true;
	}
	public static boolean OrderedbyName(ArrayList<Student> arr) {
		Collections.sort(arr, new NameComparator());
		System.out.println("ID\t Name\t Class\t Age\t School");
		for (Student s : arr) {
			System.out.println(s.getStudentId() + "\t" + s.getStudentName() + "\t" + s.getStudentClass() + "\t" + s.getStudentAge() + "\t" + s.getStudentSchoolName());
		}
		return true;
	}
	public static boolean removeStudent(ArrayList<Student> arr, Scanner input) {
		System.out.println("Enter a Student Name to remove");
		String deleteName=input.next();
		for (Student s : arr) 
		{
	        if (deleteName.equals(s.getStudentName())) 
	        {	           
	        	arr.remove(s);
	            System.out.println("Removing student:" +s.getStudentName());
	        }
        }
	        return true;
	}
	}
	
	
	


