package arrays;

public class TwoDimensionArrayValues {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] a= {{1,2,3,4},{5,6,7,8},{10,11,12,13}};
		
		int rows=a.length;
		int col=a[0].length;
		
		for(int i=0;i< rows;i++) {
			for(int j=0;j< col;j++) {
				System.out.print(a[i][j]+ " ");
			}
			System.out.println(""); 	
		}
		
		
	}

}
