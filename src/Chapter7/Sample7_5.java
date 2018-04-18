package Chapter7;

public class Sample7_5 {
	public static void main(String[] args) {
		int x=15;
		DataAccess da=new DataAccess();

		assert x==10:"10以外が入っています";
		System.out.println("Value of x:"+x);
	}
}
class DataAccess{
	public boolean dataIsAccesible() {
		return false;
	}
}
