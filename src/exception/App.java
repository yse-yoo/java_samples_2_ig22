package exception;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class App {

	public static void main(String[] args) {

		int score = 100;
		int count = 0;
		
		if (count > 0) {
			float answer = score / count;
			System.out.println(answer);
		} else {
			System.out.println("countがまちがっています。");
		}
		
		loadFile("");
	}
	
	public static void loadFile(String path) {
		
		try {
			FileReader reader = new FileReader(path);
		} catch (FileNotFoundException e) {
			System.out.println("ファイルが読み込めませんでした");
		}
		
	}
	

}
