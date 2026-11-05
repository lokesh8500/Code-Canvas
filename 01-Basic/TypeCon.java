class TypeCon
{
	public static void main(String args[])
	{
		int a = 257;
		byte k = (byte) a;
		//int to byte conversion
		float f = 5.6f; // here if we try float f = 5.6f; it will throw compile time exception
		int t = (int)f;
		//float to int conversion
		System.out.println(k);
		System.out.println(t);
		
		byte x = 10;// value is byte so, the answer should be in byte
		byte y = 20;// but the answer will comes in integer
		
		int result = x * y;// here type promotion will happen 
		System.out.println(result);
	}
}