package week2Homework2;

public class StudentManager {
	public void editProfile(Student student) {
		System.out.println(student.getId()+"numarali ögrenci " + student.getFullName()+" profilini düzenledi.");
	}

	public void disconnect(Student student) {
		System.out.println(student.getId()+"numarali ögrenci " +student.getFullName()+" baglantisini kopardi.");
	}

	public void addComment(Student student) {
		System.out.println(student.getId()+" numarali ögrenci"+" "+ student.getFullName()+" yorum yapti: "+student.getComment());
	}

	public void removeComment(Student student) {
		System.out.println(student.getId()+" numarali ögrenci "+ student.getFullName()+student.getComment()+" yorumunu sildi");
	}

	public void updateComment(Student student) {
		System.out.println(student.getId()+" numarali ögrenci "+ student.getFullName()+"yorumunu guncelledi: "+student.getComment());
		
	}
	public int completeCourse(Student student) {
		return student.getCompleted();
	}
}
