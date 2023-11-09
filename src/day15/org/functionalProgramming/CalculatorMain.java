package day15.org.functionalProgramming;

public class CalculatorMain  {

	public static void main(String[] args) {
		//logic -> from addition functional+lambda expression.
		Calculator addition =(num1,num2)->num1+num2;
		
		Calculator subtraction =(num1,num2)->num1-num2;
		
		Calculator multiplication =(num1,num2)->num1*num2;
		
		//division -> lambda expression/anonymous function(nameless function)
		Calculator division = (num1,num2)->{
			if(num2!=0) {
				return num1/num2;
			}
			else {
				throw new IllegalArgumentException("Cannot divide by zero");
			}
		};
//pass the data
		int sum = addition.calculate(10,5);
		System.out.println("Addition is: "+sum);
		int sub = subtraction.calculate(10, 5);
		System.out.println("Subtraction is: "+sub);
		
		int mul = multiplication.calculate(10, 5);
		System.out.println("multiplication is: "+mul);

		try {
			//risky code.
			int div = division.calculate(10, 0);
			System.out.println("division is: "+div);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("Exception : "+e.getMessage());
		}
	}

}
