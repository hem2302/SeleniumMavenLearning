package Learning;

import java.io.File;
import java.io.IOException;

public class FileHandling {
//comment
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		//File object is only used only for creating and delete- external operations. 
		//But cant conduct any internal operations - opening the file and reading writing the file(Require filereader and bufferedreader)
		
		
		//Create a new folder
		File fileObject = new File("C:\\Users\\Samsung\\Desktop\\makedirectory");
		fileObject.mkdir();
		System.out.println("Folder created");
		
		
		//Create new text file
		File createFile = new File("C:\\Users\\Samsung\\Desktop\\makedirectory\\text.txt");
		createFile.createNewFile();
		
		//Delete a file
		
		fileObject.delete();
		
	}

}
