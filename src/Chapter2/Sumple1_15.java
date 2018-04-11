package Chapter2;

public class Sumple1_15 {
	public static void main(String[] args) {
		label:for(int i=1;i<10;i++) {
			for(int j=1;j<10;j++) {
				if(i*j>20) {
					break label;
				}
			if(i==1) {
				break;
			}
			if(j%2==1) {
				continue;
			}
			System.out.println(i*j);
		}
		}
	}
}



