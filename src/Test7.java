
public class Test7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n1=0, n2=1, n3;
		
		int a=10;
		
		System.out.print(n1+" "+n2);
		
		for(int i=2;i<a;i++)
		{
			n3=n1 + n2;
			System.out.print(" "+n3);
			n1=n2;
			n2=n3;
				
		}

	}

}
