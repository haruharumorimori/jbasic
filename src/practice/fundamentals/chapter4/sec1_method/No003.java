package practice.fundamentals.chapter4.sec1_method;
/*
 * int型の「年」「月」「日」を受け取り「XXXX年XX月XX日」という形式の日付を出力するメソッドを定義してください。
 * mainメソッドからそのメソッドを使用していくつか日付を表示させてください。
 */
public class No003 {
	public static void ymd(int a,int b,int c) {
		System.out.println(a+"年"+b+"月"+c+"日");
	}

	public static void main(String[] args) {
		int a1=1987;
		int b1=12;
		int c1=31;
		
		ymd(a1,b1,c1);
	}
}
