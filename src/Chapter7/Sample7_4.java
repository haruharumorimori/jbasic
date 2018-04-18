package Chapter7;

public class Sample7_4 {
	public static void main(String[] args) {
		double x=15.0;
		double y=0.0;
		try {
			Sample7_4 obj=new Sample7_4();//インスタンス化
			double z=obj.doubleDivide(x,y);
			System.out.println("x/y="+z);
		}catch(ArithmeticException ae) {
			System.out.println("An exception occured.");
			System.out.println(ae);
		}
		System.out.println("x-y="+(x-y));
	}

	double doubleDivide(double x,double y) {
		if(y==0) {
			throw new ArithmeticException(
					"Integer or not , please do not devide by zero!");
		}else {
			return x/y;
		}
	}
}
