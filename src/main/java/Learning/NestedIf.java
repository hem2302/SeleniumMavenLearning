package Learning;

import java.util.Scanner;

public class NestedIf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10;
		int b = 11;
		int c = 20;
		int d = 40;
		//check if the value of "a" variable is bigger than b,c,d 

		int age;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter age");
		age = sc.nextInt();

		if (age<18) {
			System.out.println("you are minor and not eligible");
		}
		else
		{
			if((age >= 18) && (age<=60)) {
				System.out.println("you are eligible");
			}
			else
			{
				System.out.println("you are too old");
			}

		}

	}
}




