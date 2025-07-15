//04 Type casting -> changing Data types
/*
	widening casting(Ascending memory order):
		byte -> short -> char -> int -> long -> float -> double
		
	narrowing casting(Descending memory order):
		double -> float -> long -> int -> chat -> short -> byte
*/


class casting{
	public static void main(String args[])
	{
		int a = 5;
		double b = a;
		double c = 5.9;
		int d = (int)c;
		System.out.println(a); 
		System.out.println(b);
		System.out.println(c); 
		System.out.println(d);
	}
}