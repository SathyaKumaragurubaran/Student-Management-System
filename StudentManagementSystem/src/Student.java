
public class Student {
	private int studentId;
	private String studentName;
	private int studentClass;
	private int studentAge;
	private String studentSchoolName;
	
	//no-args constructor
	Student(){
		
	}
	//patrameterized constructor
	public Student(int studentId, String studentName, int studentClass, int studentAge, String studentSchoolName) {
		
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentClass = studentClass;
		this.studentAge = studentAge;
		this.studentSchoolName = studentSchoolName;
	}
	
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public int getStudentClass() {
		return studentClass;
	}
	public void setStudentClass(int studentClass) {
		this.studentClass = studentClass;
	}
	public int getStudentAge() {
		return studentAge;
	}
	public void setStudentAge(int studentAge) {
		this.studentAge = studentAge;
	}
	public String getStudentSchoolName() {
		return studentSchoolName;
	}
	public void setStudentSchoolName(String studentSchoolName) {
		this.studentSchoolName = studentSchoolName;
	}
	}


