package inheritance;

public class Class2 extends Class1{

	int a = 100, b=100;
	
	public int add() {
		int res = a+b;
		return res;
		
			}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//if parent and child class has same method(Parent and child class - Add() method then home class will be called.
		// Priority will be given to home class only
		
		Class2 obj = new Class2();
		int res = obj.add();
		System.out.println(res);
		
	}

}
