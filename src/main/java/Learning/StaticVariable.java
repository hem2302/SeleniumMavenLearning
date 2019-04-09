package Learning;

public class StaticVariable {
	int a; // non static global or instance variable
	static int b; //static global variable

	
	StaticVariable(){
		a++;
		b++;
		
		System.out.println("a = " + a + " b = " + b);
	}
	
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StaticVariable obj1 = new StaticVariable();
		
		StaticVariable obj2 = new StaticVariable();
		
		StaticVariable obj3 = new StaticVariable();

		//output will be
		//a=1 b=1
		//a=1 b=2
		//a=1 b=3

	}

}
