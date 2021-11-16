
public class Pyramid {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int k=1;
		for(int i=0;i<4;i++)  // this loop is for number of rows i.e there are 4 rows
		{
		//	System.out.println("outer loop started");
			for(int j=1;j<=4-i;j++)
			{
				System.out.print(k);
				System.out.print("\t"); //for giving space between numbers
				k++;
			}
			
			System.out.println(""); // to print in next line after 1st row is printed
		}
		
		System.out.println("---------------------------------------");
		
		int c=1;
		
		for(int a=0;a<4;a++)
		{
			
			for(int b=0;b<=a;b++)
			{
				System.out.print(c);
				System.out.print("\t");
				c++;
			}
			
			System.out.println(" ");
		}

	}

}

