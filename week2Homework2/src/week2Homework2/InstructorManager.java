package week2Homework2;

public class InstructorManager extends UserManager {
	
	public void addHomework(Instructor instructor) {
		System.out.println("Egitmen "+instructor.getFullName()+" tarafindan "+instructor.getHomeWork()+" ödevi eklendi");
	}
}