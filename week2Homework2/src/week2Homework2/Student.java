package week2Homework2;

public class Student extends User{
	private String fullName;
	private String comment;
	private int completed = 0;
	
	
	
	public Student(String fullName, String comment) {
		super();
		this.fullName = fullName;
		this.comment = comment;
	}
	
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	public int getCompleted() {
		return completed;
	}
	public void setCompleted(int completed) {
		this.completed = completed;
	}
	
	

	

}
