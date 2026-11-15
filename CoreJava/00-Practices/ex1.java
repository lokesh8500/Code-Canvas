class main
{
	public static void main(String args[])
	{
		int no = Integer.parseInt(args[0]);
		int num = no;
		int sum,mod;
		sum = 0;
		mod = 0;
		while(num > 0)
		{
			mod=num%10;
			sum=sum+mod;
			num=num/10;
		}
		System.out.println(sum);	
	}
}
