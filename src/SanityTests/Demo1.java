package SanityTests;

public class Demo1 {
	
	public void find2(int [] a)
	{
		int low=0;
		int high=0;
		int min=a.length/2;
		
		for (int i=0;i<=min;i++)
		{
			
		}
		
	}
	
	
	public void find (int [] a)
	{
		
		int j=0;
		for (int i=0;i<a.length;i++)
		{
			
				if(a[i]!=j)
				{
					System.out.println(j);
				   	break;
				   	
				}
				j++;
		}
		
	}
	
	public int [] sorting (int[] c)
	{
		int temp=0;
		for (int i=0; i<c.length;i++)
		{
			for (int j=0;j<c.length-1;j++)
			{
				if (c[j]>c[j+1])
				{
					temp=c[j];
					c[j]=c[j+1];
					c[j+1]=temp;
				}
			}
				
		}
		
		return c;
	}
	
	
	public static void main(String[] args)
	{
		
		Demo1 obj1= new Demo1();	
		
		
		int [] a= {0,3,2,1,7,6,5,8,9};
		int [] b= obj1.sorting(a);
		obj1.find(b);
		
		
	}
	
}
