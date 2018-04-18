package Chapter7;

public class Sample7_2 {
	public static void main(String[] args) {
		int x=15;
		int y=0;
		try {
			System.out.println("x/y:"+x/y);//ArithmeticExceptionが発生
			System.out.println("x*y:"+x*y);
		}catch(Throwable oe){
			System.out.println("An exception ocured"+oe);
		}finally {
			System.out.println("finally block must be executed!");
		}
		System.out.println("x-y:"+(x-y));
	}
}
