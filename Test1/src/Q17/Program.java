package Q17;

public class Program {
	static int Find (int[] a){
		int t1=a[0];
		int t2=0;
		int i;
		for(i=1;i<a.length;i++)
		{
			if(a[i]>t1)
			{
				t1=a[i];
				t2=i;
			}
		}
		return t2;
	}
	
	public static void main(String args[])
	{
		int a[]={1,6,7,8,99,43,6,77,99,5,7,84,55};
		int t=Find(a);
		System.out.println(t);
	}
}
