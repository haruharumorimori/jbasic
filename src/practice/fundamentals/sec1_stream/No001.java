package practice.fundamentals.sec1_stream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
/*
 * cドライブのtrainingディレクトリ内に任意の文字列を記述した「test1.txt」ファイルを作成し、
 * No001クラス内でtest1.txtないに記載された内容をバイト単位で読みこんで画面に表示するプログラムを作成してください。
 */
public class No001 {
	public static void main(String[] args) {
		Path p=Paths.get("c:\\training\\test1.txt") ;
		FileInputStream s;
		try{
			s=new FileInputStream(p.toFile());

			int contents;
			while((contents=s.read())!=-1) {
				System.out.println(contents);
			}
			s.close();
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
}
