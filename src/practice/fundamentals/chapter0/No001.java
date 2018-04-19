package practice.fundamentals.chapter0;
import java.time.LocalDateTime;
/*
 * APIを使用して日時(XXXX年XX月XX日)を表示するプログラムを作成してください。
 * ※APIは自身で探してみてください
 */
public class No001 {
public static void main(String[] args) {
	LocalDateTime ldt=LocalDateTime.now();
	System.out.println(ldt);
	}
}
