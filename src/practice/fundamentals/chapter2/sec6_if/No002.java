package practice.fundamentals.chapter2.sec6_if;

/*
 * int型変数xに対し、xに代入された数値が奇数か偶数かを判定するプログラムを作成してください。
 */
public class No002 {
	public static void main(String[] args) {
		int x=34;
		int y=2;

		if(x%y==1) {
			System.out.println("奇");
		}else{
			System.out.println("偶");
		}
	}
}
