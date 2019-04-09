package Learning;

public class StaticExample {
int rollno;
String name;
static String college = "db jain";


public void method1(int a, String b) {
	rollno=a;
	name=b;
	
	System.out.println("name" + name +" roll no " + rollno + " college name " + college);
}

public void method2(int a, String b, String res) {
	
	System.out.println("name " + name +" roll no " + rollno + " college name " + res);
}

public static void main(String[]args) {
	
	StaticExample obj1 = new StaticExample();
	StaticExample obj2 = new StaticExample();
	StaticExample obj3 = new StaticExample();
	obj1.method1(1, "kum");
	obj2.method1(2, "hem");
	obj3.method1(3, "manu");
	
	obj1.method2(1, "kum", "pass");
	obj2.method2(2, "hem", "fail");
	obj3.method2(3, "manu", "pass");
}
}
