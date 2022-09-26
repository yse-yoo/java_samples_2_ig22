package exception;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

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
		
		try {
			
		} finally {

		}
		
		count = -1;
		if (count < 0) {
			try {
				throw new IllegalArgumentException();
			} catch (Exception e) {
				System.out.println("countがマイナスです");
			}
		}

		loadFile("sample.txt");
		try {
			loadFile2("sample.txt");
			System.out.println("ファイルを読み込みました");
		} catch (FileNotFoundException e) {
			System.out.println("ファイルが読み込めませんでした");
		}
	}


	public static void loadFile2(String path) throws FileNotFoundException {
		FileReader reader = new FileReader(path);
	}

	public static void loadFile(String path) {

		try {
			FileReader reader = new FileReader(path);
			System.out.println(path + "を読み込みました");

			// ファイルの中身を読み込む
			BufferedReader buffer = new BufferedReader(reader);
			String line;
			while ((line = buffer.readLine()) != null) {
				System.out.println(line);
			}

			// ファイルを閉じる
			reader.close();
			buffer.close();

		} catch (FileNotFoundException e) {
			System.out.println("ファイルが読み込めませんでした");
		} catch (IOException e) {
			System.out.println("中身が読み込めませんでした");
		} finally {
			System.out.println("処理終了");
		}

	}

}
