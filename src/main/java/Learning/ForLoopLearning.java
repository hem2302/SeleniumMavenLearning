package Learning;

public class ForLoopLearning {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//print 1 to 10 numbers
		
		System.out.println("Print 1 to 10 numbers");
		for(int i = 1; i<=10;i++) {
			System.out.println(i);
		}
		
		System.out.println("Print 10 to 1 in reverse");
		for(int i=10;i>=1;i--) {
			System.out.println(i);
		}
		
		System.out.println("print 1 to 10 except 7 and 2");
		for(int i=1;i<=10;i++){
			if((i!=2)&&(i!=7)) {
				System.out.println(i);
			}
					}
	}

}
