package practice.fundamentals.chapter2.sec6_if;
/*
 * キーボード入力によって入力された数字に対して偶数か奇数を判定するプログラムを作成してください。
 */
public class No007 {
	public static void main(String[] args) {
		int a=123;
		if(a%2==0) {
			System.out.println("偶数");
		}else if(a%2==1) {
			System.out.println("奇数");
		}
	}
}
