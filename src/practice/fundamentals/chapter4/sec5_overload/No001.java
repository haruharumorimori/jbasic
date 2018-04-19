package practice.fundamentals.chapter4.sec5_overload;
/*
 * 2つのint型a,bの最小値、3つのint型abcの最小値を求める以下のメソッドを定義して、
 * mainメソッドで使用するプログラムを作成してください。
 * ・int min(int a,int b)
 * ・int min(int a,int b,int c)
 */
public class No001 {
	public static void main(String[] args) {
		int a=1;
		int b=2;
		int c=3;
		min m=new min();
		m.min(a, b);
		m.min(a, b, c);
	}
}

class min{
	int a;
	int b;
	int c;

	int min(int a,int b) {
		if(a<b) {
			System.out.println("aが最小");
			return a;
		}else if(b>a){
			System.out.println("bが最小");
			return b;
		}else{
			System.out.println("Error");
			return 0;
		}
	}

	int min(int a,int b,int c) {
		if(a-b<0&&a-c<0) {
		System.out.println("aが最小");
		return a;
	}else if(b-a<0&&b-c<0) {
		System.out.println("bが最小");
		return b;
	}else if(c-a<0&&c-b<0) {
		System.out.println("cが最小");
		return c;
	}else {
		System.out.println("Error");
		return 0;
		}
	}
}
