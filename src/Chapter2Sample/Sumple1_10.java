package Chapter2Sample;

public class Sumple1_10 {
	public static void main(String[] args){
		int[]i= {1,2,3};
		for(int x:i) {
		x=x*10;
		System.out.println(x);
	}
	String[] str = {"さむい","あつい"};
	for(String s:str) {
		s="今日は"+s;
		System.out.println(s);
	}

	int[] intArray= {1,2,3,4,5};

	for(int i1: intArray ) {//配列の要素分処理が繰り返される
		i1=i1*3;
		System.out.println(i1);
	}
	}
}
