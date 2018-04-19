package practice.fundamentals.chapter4.sec3_field;
/*
 * クラス内でint型のインスタンス変数、static変数、ローカル変数を定義し、
 * メソッド内でそれぞれ定義した変数の和を表示させるプログラムを作成してください。
 */
public class No002 {
public static void main(String[] args) {
	addadd z=new addadd();
	int a=21;
	int b=22;

	z.add(a,b);
	}
}

class addadd{
	int a;
	static int b;
	public void add(int a,int b) {
		int c = 1642;
		int sum1=a+b+c;
		System.out.println(sum1);
		int sum2=a+b;
		System.out.println(sum2);
		int sum3=b+c;
		System.out.println(sum3);
		int sum4=c+a;
		System.out.println(sum4);
	}
}
