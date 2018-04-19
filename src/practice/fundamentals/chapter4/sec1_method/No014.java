package practice.fundamentals.chapter4.sec1_method;
/*
 * 九九のひとつの段を表示するメソッドを作成しなさい。何の段（ 1 ～ 9 ）であるかを引数とします。
 * このメソッドを使用して、九九表を作成してください。
 */
public class No014 {
	public static void main(String[] args) {
		int a=8;
		Mp(a);
	}

	public static void Mp(int a) {
		for(int b=0;b<=9;b++) {
			int c=a*b;
			System.out.println(c);
		}
	}
}
