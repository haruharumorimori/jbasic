package practice.fundamentals.chapter4.sec1_method;
/*
 * int型の年を受け取り、うるう年かどうかを判定するメソッドを定義してください。
 * うるう年の場合はtrue、違う場合はfalseを返します。
 * キーボード入力から年を受け取り、メソッドを使用して判定してください。
 * ※うるう年は、西暦が400で割り切れる年、または100で割り切れず、4で割り切れる年です。
 */
public class No005 {
	public static void main(String[] args) {
		int year1=2400;
		System.out.println(check(year1));
	}
	int year;

	public static boolean check(int year) {
		if(year%400==0) {
			return true;
		}else {
			return false;
		}
	}
}
