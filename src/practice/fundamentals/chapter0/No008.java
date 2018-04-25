package practice.fundamentals.chapter0;
/*
 * Runnableインターフェースを使用して、「Hello ラムダ」が表示されるようにプログラムを作成してください。
 * ※ラムダ式を使用すること
 */
public class No008 {
	public static void main(String[] args) {
		Runnable runner=()->{
			System.out.println("Hello ラムダ");
		};
		runner.run();
	}
}
