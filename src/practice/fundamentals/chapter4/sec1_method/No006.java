package practice.fundamentals.chapter4.sec1_method;



/*
 * int型の配列を受け取り、すべての要素の合計を返すメソッドを定義してください。
 * mainメソッドから、そのメソッドに配列を渡して合計を表示してください。
 * ※配列の要素数や値は任意とする
 */
public class No006 {
	public static void main(String[] args) {
		int[] array= {19,20,21};
		int add=a(array);

		System.out.println(add);
	}

	public static int a(int[]array) {
		int a=0;
		for(int i=0;i<array.length;i++) {
			a+=array[i];
		}
		return a;
	}
}






