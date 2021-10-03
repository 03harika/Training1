public class Diamond
{
 public static void main(String[] args) 
  {
	int t=4,s=3;
	for(int i=1;i<=5;i++)
	{
		for(int k=t;k>=0;k--)
		{
		  System.out.print(' ');
		}
		for(int j=1;j<=i;j++)
		{
			System.out.print("*");
			System.out.print(" ");
		}
		System.out.println();
		t--;
	}
	for(int i=4;i>=0;i--)
	{
		for(int k=s;k<=4;k++)
		{
	      System.out.print(' ');
		}
		for(int j=1;j<=i;j++)
		{
	      System.out.print("*");
	      System.out.print(" ");
		}
		System.out.println();
		s--;
     }
  }
}


