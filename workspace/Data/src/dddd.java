import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;
public class dddd {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		File data1 = new File("data1.txt");
		File data2 = new File("data2.txt");
		String contents = new String(Files.readAllBytes(Paths.get("data1.txt")));
		System.out.print(contents);
	}

}
