package writefile;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class WriteFileExample {

	public static void main(String[] args) {
		
		Path p = Paths.get("C:/Users/RAQUEL/Desktop/file.txt"); //url of the file in where we would like to write; if the file doesn't exist, will be created.
		
		//what i want to write
		String text = "This will be written into the file.";
		
		//byte vector
		byte[] textInBytes =  text.getBytes(); 
		
		//write
		try {
			Files.write(p, textInBytes); //this method throws an exceptions
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
