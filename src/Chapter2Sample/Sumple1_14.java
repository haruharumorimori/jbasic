package Chapter2Sample;

public class Sumple1_14 {
	public static void main(String[] args) {
		for (int i =0;i<=10;i++){
			if(i==3) {
				continue;
			}
			if( i == 5) {
				break;
			}
			System.out.println(i);
		}
	}
}
