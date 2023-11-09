package day_4;

public class Practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Using for Loop: ");
		for(int i=1;i<=10;i++) {
			if(i==5 || i==7)
				continue;
			System.out.print(i+" ");
		}
		System.out.println();
		System.out.println("Using while Loop: ");
		int i=0;
		while(i<10) {
			i++;
			if(i==5 || i==7)   
				continue;
			 System.out.print(i+" ");
			
			
			
		}

	}

}
