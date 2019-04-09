package Learning;

public class LearnInheritance {

	//create a static and nonstatic class members and call

	static int a = 20,b =20;
	int c=60,d=70;

	public int Multiply(){
		int result = c*d;
		return result;
	}

	public static int add () {

		int result = a+b;
		return result;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//call a nonstatic method
		LearnInheritance obj = new LearnInheritance();
		int multiplyValue = obj.Multiply();
		System.out.println(multiplyValue);
	
		//call static method
		int addValue = add();
		System.out.println(addValue);
	}

}
