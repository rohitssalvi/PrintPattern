package assignment;

public class sum {
	public static void main(String[] args) 
	{
		int i,j;
		
		for(i=1;i<=5;i++)
		{
			
			for(j=1;j<=i;j++)
			{
				System.out.println(j);
			}
			
			System.out.println();
			
		}
		
		for(int k=1,r=5-1;k<=5-1;k++,r--)
		{
			for(int l=1;l<=r;l++)
			{
				System.out.println(l);
			}

			System.out.println();
		}
	}

}
