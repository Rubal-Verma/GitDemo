
public class MaximumNumberInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int c[][]= {{2,4,5},{3,4,7},{1,2,9}};
		int max = c[0][0];
		
		for (int x=0;x<3;x++) {
			
			for(int y=0;y<3;y++) {
				
				if (c[x][y]> max)
				{
					max = c[x][y];
				}
			}
		}
			
		System.out.println(max);
		
	}

}
