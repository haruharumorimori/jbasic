package practice.fundamentals.chapter0;
import java.util.function.Function;
/*
 * java.util.functionのインターフェース（Function<T,R>）を使用して
 * 「Hello10000」を表示させるプログラムを作成してください。
 * ※ラムダ式で記述すること
 */
public class No009 {
	public static void main(String[] args) {
		Function<Integer,String> a=(i)->{return "Hello"+i;};
		String result= a.apply(1000);
		System.out.println(result);
	}
}
