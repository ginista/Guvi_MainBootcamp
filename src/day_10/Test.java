package day_10;


//interface supports multiple inheritance
public class Test implements Printable, Showable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test obj = new Test();
		obj.show();
		obj.print();
		obj.calculate(10, 30);
 
	}

	@Override
	public void show() {
		// TODO Auto-generated method stub
		System.out.println("hello");
		
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("Welcome");
		
	}
	public void calculate(int num1, int num2) {
		System.out.println(num1+num2);
	}

}
