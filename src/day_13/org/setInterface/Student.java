package day_13.org.setInterface;

public class Student implements Comparable<Student>{

	private int id;
	private String name;
	
	//constructor
	public Student(int id, String name) {
		this.id = id;
		this.name = name;
	}
	
	public int getId(){
		return id;
	}
	public String getName() {
		return name;
	}
	
	@Override
	public String toString() {
		return "Student{" +"id = "+id+",Name = "+name+"}";
	}
	@Override
	public int compareTo(Student other) {
		// TODO Auto-generated method stub
		return Integer.compare(this.id, other.id);
	}
	}



