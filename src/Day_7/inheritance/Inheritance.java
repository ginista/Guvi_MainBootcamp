package Day_7.inheritance;


class One{
	public void getName(){
		System.out.println("Parent");
	}
}
class Two extends One{
	public void getHi() {
		System.out.println("Child");
	}
}
public class Inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Two t2 = new Two();
		t2.getName();
		t2.getHi();
		One t1 = new One();
		t1.getName();

	}

}
