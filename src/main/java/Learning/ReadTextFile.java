package Learning;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadTextFile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		//Open the specified file in read mode	
		FileReader objRead = new FileReader("C:\\Users\\Samsung\\Desktop\\makedirectory\\test.txt");

		//Reading the data from opened file
		//pass the file reader instance(objRead) to connect the Buffered reader
		BufferedReader br = new BufferedReader(objRead);
		String line;

		//print  the text file content from the opened file until last line is line
		//space also considered as value

		while((line = br.readLine()) != null) {
			//this if statement excludes the spaces and prints the line
			if(line.length()>0) {
				System.out.println(line);
			}

		}

		//close objects - optional  but best practice. it releases the memory immediately

		br.close();
		objRead.close();

	}

}
