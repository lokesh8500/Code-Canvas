class ex
{
	int fact;
	
	ex(int f)
	{
		fact=f;
	}
	void display() 
 	{
		int ans;
		ans = 1;
		for(int i=1;i<=fact;i++)
		{
			ans = ans * i;
		}
		System.out.println(ans);
	}
}
class main
{
	public static void main(String args[])
	{
		ex e1 = new ex(4);
		e1.display();
	}
}
