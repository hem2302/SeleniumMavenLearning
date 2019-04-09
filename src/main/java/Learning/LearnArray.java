package Learning;

import java.util.Arrays;

public class LearnArray {

	public static void main(String[] args) {
		
	//checking length of an array
	/*int a[] = {10,20,30,40};
	
	System.out.println(a.length);
	
	int size = a.length;
	System.out.println(size);
	*/
	
	//copy an array to a string
	/*int a[] = {10,20,30,40};
	String str = Arrays.toString(a);
	System.out.println(str);
	*/

		//print array using for loop
		
		/*String a[] = {"ABC","DEF","CCD"};
		
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}*/
	
		//print array using enhanced for loop
		String a[] = {"ABC","DEF","CCD"};
		for(String val:a)
		System.out.println(val);
	}
}
