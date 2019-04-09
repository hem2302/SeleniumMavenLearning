package Learning;

public class WhileLoopsLearning {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//For While loops initialization is mandatory

		//syntax
		//initialization
		//while(condition){
		//Statements
		//-------
		//-----
		//increment or decrement

		System.out.println("print 1 to 10");

		int i=1;
		while(i<=10) {
			System.out.println(i);
			i++;
		}

		System.out.println("print 10 to 1");

		int j=10;
		while(j>=1) {
			System.out.println(j);
			j--;
		}

		//do while loop -it executes a block of statements atleast once irrespective of the condition
		//initialization
		//do{
		//Statements
		//increment or decrement
		//-----
		//-----
		//}while(condition)

		System.out.println("do while = print 1 to 10");
		int k=1;
		do {
			System.out.println(k);
			k++;
		}while(k<=10);

	}

}
