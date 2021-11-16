
public class MinimumNumberInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int c[][]= {{7,3,4},{5,6,0},{9,8,7}};
		int min = c[0][0];
		int minimumCol = 0;
		
		for(int i=0;i<3;i++) {
			
			for(int j=0;j<3;j++) {
				
				if(c[i][j]<min)
				{
					min=c[i][j];
					
					minimumCol = j;
					
					System.out.println(min);
				}
				
				
			}
		}
		System.out.println("------------------------");
		
		int max= c[0][minimumCol];
		int k =0;
		while (k<3)
		{
			if(c[k][minimumCol]> max)
			{
				max=c[k][minimumCol];
			}
		k++;
		}
		
		System.out.println(max);
	}

}
