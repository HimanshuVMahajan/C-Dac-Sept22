class P1
{
public static void main(String args[])
{
	int i,j;
	for(i=1;i<=9;i++)
	{
		for(j=8;j>=i;j--)
		{
			System.out.print(" ");
		}
		for(j=1;j<=i;j++)
		{
		System.out.print(i+" ");
		}
		System.out.println(" ");
	}
}

}