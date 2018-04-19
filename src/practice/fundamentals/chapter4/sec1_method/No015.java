package practice.fundamentals.chapter4.sec1_method;

/*
 * Randomクラスを使用してランダムな整数を返すメソッドを作成してください。
 * 作成したメソッドを使用した結果を変数に格納してください。
 * 最後に変数に格納した結果を画面に表示させるプログラムを作成してください。
 */
import java.util.Random;

public class No015 {
	public static void main(String[] args) {
		No015 n=new No015();
		System.out.println(n.faaaa());
	}
	Random r=new Random();
	public int faaaa() {
		 int b=r.nextInt();
		// (int)(Math.random()*100);
		return b;
	}
}
