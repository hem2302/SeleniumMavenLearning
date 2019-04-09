package Learning;

public class LearnString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String a = "e2abe";
		String b = "h373h";
		String hhh = "abcdef12345";
		//int c=Integer.parseInt(a);
		char bbb = (b.charAt(1));
		System.out.println(bbb);
		int test = Character.getNumericValue(bbb);
		String  kkk= hhh.valueOf(hhh.charAt(test-1));
		System.out.println(kkk);
		//int test = 3;
		//int kkk= (hhh.length());
		
		//int test = Integer.parseInt(bbb);
		//int mmm = test-1;
		//int lll = kkk-(test-2);
		
		
		//System.out.println(hhh.substring(mmm, kkk-2));
		//System.out.println("");
		
		//System.out.println(c);
	}

}
