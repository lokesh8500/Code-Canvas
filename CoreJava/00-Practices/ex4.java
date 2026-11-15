class p
{
	static void show()
	{
		System.out.println("h1 hide obj");
	}
}
class c extends p
{
	static void show()
	{
		System.out.println("h2 hide obj");
	}
}
class main 
{
	public static void main(String args[])
	{
		p po = new c();
		po.show();
		
	}
}