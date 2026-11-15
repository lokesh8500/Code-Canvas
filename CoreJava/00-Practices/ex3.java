import java.util.Scanner;
class main
{
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		System.out.println("enter some thing text");
		String user = s.nextLine();
		System.out.println("enter some thing double");
		double doub = s.nextDouble();
		System.out.println("enter some thing int");
		int number = s.nextInt();
		System.out.println("enter some thing float");
		float point = s.nextFloat();
		System.out.println("enter some thing 0 1");
		boolean b = s.nextBoolean();
	}
}