package Chapter8;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Sample8_2 {
	public static void main(String[] args) throws IOException {
		Path path =Paths.get("c:\\training\\Hello.java");
		BufferedReader r=Files.newBufferedReader(path);
		BufferedReader reader=Files.newBufferedReader(Paths.get("c:\\training\\test.txt"),Charset.forName("Unicode"));

		String contents;

		while((contents=reader.readLine())!=null){
		System.out.println(contents);
		}
		String source;

		while((source=r.readLine())!=null){
		System.out.println(source);
		}
	}
}
