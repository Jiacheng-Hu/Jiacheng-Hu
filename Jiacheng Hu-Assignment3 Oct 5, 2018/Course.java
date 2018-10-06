
public class Course {
	
	protected String title;
	protected int numberOfStudent=0;
	Student[] studentArray = new Student[10];
	
	public Course(String title) {
		this.title = title;
	}
	
	public Student[] getStudents(){
		return this.studentArray;
	}
	
	public boolean isFull(){
		return numberOfStudent==10;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getNumberOfStudent() {
		return numberOfStudent;
	}
	
	public void registerStudent(Student student){
		if(numberOfStudent<10){
			studentArray[numberOfStudent]=student;
			numberOfStudent++;
		}else{
			System.out.println("students is full");
		}
	}
	
}
