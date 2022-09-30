package Class11;

public class Student {

	String name;
	String id;
	double weight;
	int age;
	 
	void study() {
		System.out.println("Student is studying");
	}
	
	void deleteMessages() {
		System.out.println("Student is deleting messages");
	}
	void eat() {
		System.out.println("Student is eating Pizza");
	}
	
	
	public static void main (String[]ergs) {
		Student student=new Student();
		
		student.name="Abedi";
		student.id="123";
		student.weight=45.9;
		student.age=22;
		
		System.out.println(student.name+" "+student.id+" "+student.weight+" "+student.age);
		
		
		student.study();
		student.deleteMessages();
		student.eat();
		
		System.out.println("__________________________________________________________________________________");
		Student student2=new Student();
		
		student2.name="Zee";
		student2.id="000";
		student2.weight=65.99;
		student2.age=12;
		
		System.out.println(student2.name+" "+student2.id+" "+student2.weight+" "+student2.age);
		student.study();
		student.deleteMessages();
		student.eat();
		
	
}}
