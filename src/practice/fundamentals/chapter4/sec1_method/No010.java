package practice.fundamentals.chapter4.sec1_method;
/*
 * 1からnまでの全整数の和を求めて返却するメソッドを作成し、
 * mainメソッド内で使用するプログラムを作成してください。
 * ※nはキーボード入力により取得すること
 */
public class No010 {
	public static void main(String[] args) {
		No010 n=new No010();

		System.out.println(n.add(8));
	}
	
	int n;
	int a=1;
	int b=0;
	public int add(int n){
		while(a<=n) {
			b+=a;
			a++;
		}
		return b;
	}
}
