
public class ChildClass extends ParentClass{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		ParentClass cc = new ChildClass();
	
		cc.fly();
		cc.run();
		
		int a[]= {6,7,8,9,5};
		int b[]= {1,2,3,4,5};
		
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
		
		System.out.println("--------------------------------");
		
		for(int i=0;i<b.length;i++)
		{
			System.out.println(b[i]);
		}
	
	
	System.out.println("----------------------------------------");
	
	int c[][]= {{1,2,3},{4,5,6},{7,8,9}};
	
	for(int i=0;i<3;i++)
	{
		
		for(int j=0;j<3;j++)
		{
			System.out.print(c[i][j]);
			System.out.print("\t");
		}
		System.out.println("");
		
		System.out.println("This is first git update");
	}
	}

}
