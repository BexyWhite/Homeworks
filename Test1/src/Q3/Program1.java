package Q3;

public class Program1
{
	public static void main(String[] args)
	{
		String[] title ={"MAX-VALUE","MIN-VALUE","+0","-0","Infinity","-Infinity","NaN"};
		double[] innum ={Double.MAX_VALUE,Double.MIN_VALUE,+0.0,-0.0,Double.POSITIVE_INFINITY,Double.NEGATIVE_INFINITY,Double.NaN};
		System.out.println("除法 ");
		System.out.printf("          被除数"+"\\"+"除数        ");
		for(String s : title)
			System.out.printf("%14s",s);
		System.out.println();
		for(int i = 0;i<7;i++)
		{
			System.out.printf("%14s",title[i]);
			for(int j =0;j<7;j++)
			{
				System.out.printf("%14f",innum[i]/innum[j]);
			}
			System.out.println();
		}
		System.out.println();
		
		
		System.out.println("求余");
		System.out.printf("          被除数"+"\\"+"除数        ");
		for(String s : title)
			System.out.printf("%14s",s);
		System.out.println();
		for(int i = 0;i<7;i++)
		{
			System.out.printf("%14s",title[i]);
			for(int j =0;j<7;j++)
			{
				System.out.printf("%14f",innum[i]%innum[j]);
			}
			System.out.println();
		}
	}
}