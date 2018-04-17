package Chapter5;

public class Sumple5_2 {
	public static void main(String[] args) {
		int[][][] array=new int[2][3][2];//配列の宣言
		array[0][0][0]=1;//配列の初期化
		array[0][2][0]=3;
		array[1][0][0]=4;
		array[1][1][1]=5;
		array[1][2][1]=6;

		for (int i=0;i<array.length;i++) {
			for(int j=0;j<array[i].length;j++) {
				for(int y=0;y<array[i][j].length;y++)
				System.out.println("array["+i+"]["+j+"]["+y+"]="+array[i][j][y]);
			}
		}
	}
}
