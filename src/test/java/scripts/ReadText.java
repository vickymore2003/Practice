package scripts;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadText {
	public static void main(String[] args) throws FileNotFoundException {
		String path = System.getProperty("user.dir") + "\\src\\test\\resources\\text\\test.txt";
		BufferedReader read = new BufferedReader(new FileReader(path));
		String readLn;
		try {
			while ((readLn = read.readLine()) != null) {
				System.out.println(readLn);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}