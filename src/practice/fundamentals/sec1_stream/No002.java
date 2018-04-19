package practice.fundamentals.sec1_stream;


import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
/*
 * No001で作成した「test2.txt」を文字列として読み込んで画面に表示するプログラムを作成してください。
 */
public class No002 {
	public static void main(String[] args) throws IOException {
		Path p=Paths.get("c:\\training\\test1.txt");
		BufferedReader r=Files.newBufferedReader(Paths.get("c:\\training\\test1.txt"),Charset.forName("SJIS"));

		String contents;

		while((contents=r.readLine())!=null) {
			System.out.println(contents);
		}
	}
}

