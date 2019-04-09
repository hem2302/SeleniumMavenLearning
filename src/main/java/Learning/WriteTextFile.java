package Learning;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;

public class WriteTextFile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		//opens the file in write mode
		FileWriter  openFile = new FileWriter("C:\\Users\\Samsung\\Desktop\\makedirectory\\test2.txt");
	
		//writes the file which is opened
		//pass the filewriter instance to bufferedwriter
		
		BufferedWriter writeFile = new BufferedWriter(openFile);
		writeFile.write("abcdf");
			
		//save and close the file. Else it will not write
		writeFile.close();
		
		
	}

}
