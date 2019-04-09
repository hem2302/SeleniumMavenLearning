package Learning;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReadAndWrite {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		// Read data from one file and write to another file[Ex: Open ABC file and write to DEF file]
		
		
		String line;
		
		//Open file1 in read mode
		FileReader file1 =  new FileReader("C:\\Users\\Samsung\\Desktop\\makedirectory\\ABC.txt");

		//open file2 in write mode
		FileWriter file2 = new FileWriter("C:\\Users\\Samsung\\Desktop\\makedirectory\\DEF.txt");
		
		//Reads the opened file1 in read mode
		BufferedReader reader = new BufferedReader(file1);
		
		//Write the file2 which is opened in write mode
		BufferedWriter writer1 = new BufferedWriter(file2);
		
		/*while((line = reader.readLine()) != null){
			writer1.write(line);
			writer1.newLine();
		}*/
		
		//to read a range of data{ex: line 2 to 20)
		for(int i=2;i<=3;i++) {
			System.out.println(line=reader.readLine());
			writer1.write(line);
			writer1.newLine();
		}
		
		
		reader.close();
		writer1.close();
		file1.close();
		file2.close();

	}

}
