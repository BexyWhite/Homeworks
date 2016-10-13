package Q18;

public class Program {
	static int Find (int[][] a){
		int t1;
		int t2=0;
		int sum=0;
		int i,j;
		for(i=0;i<a.length;i++)
		{
			t1=0;
			for(j=0;j<a[i].length;j++)
			{
				t1+=a[i][j];
			}
			if(t1>sum){
				sum=t1;
				t2=i;
			}
		}
		return t2;
	}
	
	public static void main(String args[])
	{
		int a[][]={{1,6,7,1000},{8,99,43,1},{6,77,99},{5984},{55,44,5}};
		int t=Find(a);
		System.out.println(t);
	}
}
