package exam.ch05;

public class AdvancedForExample {
	private static final String sc = null;
	public static void main(String[] args) {

		int[] scores = int {13,23,46,66,26};
		int sum=0;

		for (int i = 0; i< scores.length; i++) 
			sum=sum+scores[i];

		for(int score:scores) {
			sum=sum+score;
		}
	}

	int[][] sc1 = {{1,2,3},{4,5,6},{7,8,9}};

	for (int i = 0;i<sc.length;i++){
		for(int j =0;j<sc[i]).length;j++) {
			System.out.println(i+"행" +j+"열"+sc[i][j]);

		}
		for (int[] ii : sc){
			for(int jj:ii)

}	
		}
}
