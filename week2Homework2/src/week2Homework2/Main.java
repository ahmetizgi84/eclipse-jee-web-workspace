package week2Homework2;

public class Main {

	public static void main(String[] args) {
		UserManager[] userManagers=new UserManager[] {};
		User user = new User();
		user.setId(1);
		Student student = new Student("John Doe", "Inheritance yapısını öğreniyorum");
		student.setId(2);
		Instructor instructor=new Instructor();
		instructor.setId(3);
		
		
	for(UserManager userManager:userManagers) {
		
		userManager.login(user);
		userManager.logOut(instructor);
		userManager.login(student);
		
		}
		StudentManager studentManager = new StudentManager();
		
		student.setId(101);
		student.setEmail("johndoe@example.com");
		student.setPassword("parola123");
		student.getCompleted();
		studentManager.addComment(student);
		
		InstructorManager instructorManager = new InstructorManager();
		instructor.setId(2);
		instructor.setFullName("Engin Demiroğ");
		instructor.setHomeWork("User, Instructor, Student nesnelerini modelleyiniz");
		instructorManager.addHomework(instructor);
		

	}

}
