import java.util.Comparator;

public class NameComparator implements Comparator<Student>{
	
	@Override
	public int compare(Student student1, Student student2) {
		return student1.getStudentName().compareTo(student2.getStudentName());
	}

	
}