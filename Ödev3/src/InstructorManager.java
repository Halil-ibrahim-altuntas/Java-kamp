
public class InstructorManager extends UserManager {
	public void add() 
	{
		
	}
	
	public void addAssignment(Instructor instructor) 
	{
		System.out.println("E�itmen "+instructor.getFirstName()+" "+instructor.getLastName()+" sisteme �dev y�kledin");
	}
	
	public void checkAttendance(Student student) {
		System.out.println(student.getFirstName()+" " + student.getLastName() + " Bug�n dersine kat�ld�");
	}
}
