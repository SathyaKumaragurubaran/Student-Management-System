

import java.util.Comparator;

public class Helper2 implements Comparator<Student> {
	public int compare(Student student1,Student student2) {
	if (student1.getStudentAge() > student2.getStudentAge())
	{
        return 1;
    } else if (student1.getStudentAge() < student2.getStudentAge())
    {
        return -1;
    } else
    {
        return 0;
    }
	}
	
}
	


