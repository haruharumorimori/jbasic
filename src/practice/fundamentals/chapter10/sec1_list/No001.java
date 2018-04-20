package practice.fundamentals.chapter10.sec1_list;
/*
 * ArrayListクラスに文字列を代入し、出力するプログラムを作成してください。
 */
import java.util.ArrayList;
public class No001 {
	public static void main(String[] args) {
		ArrayList<String> a=new ArrayList<String>();
		a.add("きつねうどん");
		a.add("たぬきそば");
		a.add("そーめん");
		for(String s:a) {
			System.out.println(s);
		}
	}
}
