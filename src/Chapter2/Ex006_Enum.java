package Chapter2;

public class Ex006_Enum {
//列挙型
	protected enum Color {
		赤,
		黄色,
		青,
	}
	public static void main(String[] args) {
		//値の取得
		Color red1 = Color.赤;
		System.out.println(red1);

		String result = check(Color.赤);
		 System.out.println(result);
	}
private static String check(Color color) {
	if(color == Color.赤) {
		return"止まれ";
	} else if(color == Color.黄色) {
		return"注意して進め";
	} else if (color == Color.青) {
		return"進め";
	} else {
		return null;
		}
	}
}



