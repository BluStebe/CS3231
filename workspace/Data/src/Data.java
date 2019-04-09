import java.util.*;
import java.io.*;
public class Data {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		File data1 = new File("data1.txt");
		File data2 = new File("data2.txt");
		Scanner i1 = new Scanner(data1);
		Scanner i2 = new Scanner(data2);
		ArrayList<String> data1s = new ArrayList<String>();
		ArrayList<String> data2s = new ArrayList<String>();
		ArrayList<String> merges = new ArrayList<String>();
		while (i1.hasNext()) {
			System.out.print("a");
			for (char c: data1.toString().toCharArray()) {
				data1s.add(c+"");
				merges.add(c+"");
			}
		}
		while (i2.hasNext()) {
			System.out.print("b");
			for (char c: data2.toString().toCharArray()) {
				data2s.add(c+"");
				merges.add(c+"");
			}
		}
		Collections.sort(data1s);
		Collections.sort(data2s);
		Collections.sort(merges);
		System.out.print(data1s);
		PrintWriter data1p = new PrintWriter("data1sorted.txt");
		PrintWriter data2p = new PrintWriter("data2sorted.txt");
		PrintWriter merge = new PrintWriter("merge.txt");
		for (String s: data1s)
			data1p.println(s);
		for (String t: data2s)
			data1p.println(t);
		for (String r: merges)
			data1p.println(r);
		
		i1.close();
		i2.close();
		data1p.close();
		data2p.close();
		merge.close();
	}

}
