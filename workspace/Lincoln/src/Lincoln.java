import java.io.File;
import java.util.Scanner;
public class Lincoln {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		File file = new File("Lincoln.txt");
		Scanner i = new Scanner(file);
		String fulladd = file.getCanonicalPath();
		int chars = 0;
		int words = 0;
		int lines = 0;
		while (i.hasNext()) {
			String word = i.next();
			boolean bool = false;
			for (char c: word.toCharArray()) {
				if (Character.isLetter(c))
					bool = true;
			}
			if (bool)
				words ++;
		}
		i.close();
		Scanner p = new Scanner(file);
		while (p.hasNext()) {
			String line = p.nextLine();
			for (char c: line.toCharArray())
				chars++;
			lines++;
		}
		
		System.out.println(fulladd + " contains:");
		System.out.println("Characters: " + chars);
		System.out.println("Words: " + words);
		System.out.println("Lines: " + lines);
		i.close();
	}

}
