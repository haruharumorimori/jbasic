package Question;

public class Sample1 {
	public static void main(String[] args) {
		int z=3;
		int y=12;
		Sample1 s=new Sample1();
		int x=s.method(z, y);
		System.out.println(x);

	}
	int a;
	int b;
	public int method(int a,int b) {
		return a+b;
	}
}

