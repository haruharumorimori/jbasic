package practice.fundamentals.chapter2.sec7_switch;

/*
 * int型変数xを定義し、switch文でxが1の場合「1です。」、xが2の場合「2です。」、xが3の場合「3です」を表示させるプログラムを作成してください。
 */
public class No001 {
	public static void main(String[] args) {
		int x=1;
		switch(x) {
		case 1:
			System.out.println("1です。");
		case 2:
			System.out.println("2です。");
		case 3:
			System.out.println("3です。");
		}
	}
}