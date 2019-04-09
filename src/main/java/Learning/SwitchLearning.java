package Learning;

import java.util.Scanner;

public class SwitchLearning {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String opr;
		int a = 10;
		int b = 20;

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter operator");
		opr = sc.next();

		switch(opr){
		case "sub":
			System.out.println(a-b);
			break;
		case "mul":
			System.out.println(a*b);
			break;
		case "add":
			System.out.println(a+b);
			break;

		default:
			System.out.println("no operator to perform");
		}
	}

}
