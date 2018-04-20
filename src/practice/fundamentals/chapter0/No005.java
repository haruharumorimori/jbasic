package practice.fundamentals.chapter0;
/*
 * mainメソッド内にローカルクラスを作成し、その中に「Hello」を画面に表示させるプログラムを作成してください。
 */
public class No005 {
	final static String a="Hello";
	public static void main(String[] args) {
		class Hello1{
			void method(){
				String b=a;
				System.out.println(b);
			}
		}
		Hello1 h=new Hello1();
		h.method();
	}
}

