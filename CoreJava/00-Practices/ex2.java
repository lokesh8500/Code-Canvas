class main
{
	public static void main(String args[])
	{
		int no=Integer.parseInt(args[0]);
		int num=no;
		int org=no;
		int mod=0,rev=0;
		while(num > 0)
		{
			mod=num%10;
			rev=(rev*10)+mod;
			num=num/10;
		}
		if(org==rev)
			System.out.println("palindrom");
		else
			System.out.println("not palindrom");
	}
}