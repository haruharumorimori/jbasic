package Chapter2Sample;

public class Sumple1_11 {
	public static void main(String[] args){
		int cnt=1;
		int sum=0;
		while(cnt<=10) {
			sum+=cnt;
			cnt++;
			System.out.println(sum);
		}
		System.out.println("1から10までの総和は"+sum+"です。");
	}
}
