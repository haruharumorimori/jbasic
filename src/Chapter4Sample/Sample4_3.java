package Chapter4Sample;

class StaticCodeExample {
static int counter=0;
static {
	counter++;
	System.out.println("Static Code block: counter:"+counter);
	}
StaticCodeExample(){
	System.out.println("Constuctor:counter:"+counter);
	}
}
public class Sample4_3{
	public static void main(String[] args) {
		StaticCodeExample sce1=new StaticCodeExample();
		StaticCodeExample sce2=new StaticCodeExample();
	}
}