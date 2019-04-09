package Learning;

public class StringLearning {

	public static void main(String[] args) {

		int a=10;
		int b=20;

		// TODO Auto-generated method stub

		//Enhanced for loop(For each) which is used in array
		//syntax
		//for(Declaration variable:array)
		//syso

		System.out.println("String type array");
		String[] languages = {"Tamil","Telugu","Hindhi","English"};
		for(String lang:languages) {
			System.out.println(lang);

		}

		System.out.println("Int type array");
		int mathOperation[] = new int[3];
		mathOperation[0] = a+b;
		mathOperation[1] = a-b;
		mathOperation[2] = a*b;

		System.out.println(mathOperation[0]);
		for(int operation:mathOperation) {
			System.out.println(operation);
		}
	
	
		//using length method

		int abc[] = {1,2,3,4,5};
		for(int i=0;i<abc.length;i++) {
			System.out.println(abc[i]);
		}
	
		String aaa="test";
	}
	
}



