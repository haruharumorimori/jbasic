package practice.fundamentals.chapter4.sec1_method;
/*
 * キーボード入力により受け取った値が負であれば「-1」を返し、
 * 0であれば「0」、正であれば「1」を返すメソッド「signOf」を作成してmainメソッド内で使用してください。
 */
public class No007 {
	public static void main(String[] args) {
		int b=10;
		int c=0;
		int d=-12;
		System.out.println(check(b));
		System.out.println(check(c));
		System.out.println(check(d));
	}

	int a;
	public static int check(int a) {
		if(a<0) {
			return -1;
		}else if(a==0) {
			return 0;
		}else if(a>0) {
			return 1;
		}else {
			return 000;
		}
	}
}
