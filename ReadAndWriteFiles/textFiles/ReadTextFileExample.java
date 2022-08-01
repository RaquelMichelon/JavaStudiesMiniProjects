package readfile;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class ReadTextFileExample {

	public static void main(String[] args) {
		//map the path to the file
		Path p = Paths.get("C:/Users/RAQUEL/Desktop/file.txt");
		
		//access class Files; call the method readAllBytes passing a path; this method require throws an exception
		try {
			byte[] text = Files.readAllBytes(p); //this method return an array of bytes
			 //store the txt in a string
			String readText = new String(text);
			//show content in the console
			System.out.println(readText);
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}

}
