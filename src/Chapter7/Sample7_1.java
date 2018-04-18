package Chapter7;

public class Sample7_1 {
	public static void main(String[] args) {
		int x=15;
		int y=0;

		try {
			System.out.println("x/y:"+x/y);//ArithmeticExceptionが発生しします
			System.out.println("x*y:"+x*y);
		}catch(ArithmeticException ae) {
			System.out.println("An exception occured:"+ae);
		}finally {
			//必ず実行したい処理を記述
		}
		System.out.println("x-y:"+(x-y));
	}
}
