package practice.fundamentals.chapter10.sec1_list;
/*
 * ArrayListに数値を代入し、出力するプログラムを作成してください。
 */
import java.util.ArrayList;
public class No002 {
	public static void main(String[] args) {
		ArrayList<Integer> i=new ArrayList<Integer>();
		i.add(1);
		i.add(2);
		i.add(3);
		for(int a:i) {
			System.out.println(a);
		}
	}
}
