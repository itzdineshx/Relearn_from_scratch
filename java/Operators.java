//05 Operators

import java.lang.*;

public class Operators{
	public static void main(String args[]){
		
		// 1. Arithmetic Operators
		int a=12,b = 10;
		System.out.println("Addition "+(a+b));
		System.out.println("Subraction "+(a-b));
		System.out.println("Multiplication "+(a*b));
		System.out.println("Division "+(a/b));
		System.out.println("Modulus "+(a%b));
		
		//2. Comparison Operators
		System.out.println("Equal to "+(a==b));
		System.out.println("Not Equal to "+(a!=b));
		System.out.println("Greater than "+(a>b));
		System.out.println("Lesser than "+(a<b));
		System.out.println("Greater than or equal to "+(a>=b));
		System.out.println("Lesser than or equal to "+(a<=b));
		
		//3. Logical operator
		System.out.println("And operator "+(a>=25 && b<=25));
		System.out.println("Or operator "+(a>=25 || b<=25));
		
		//4. Conditional Operator
		int c = a<b ? a:b;
		System.out.println("Smallest Number "+c);
		
		//5. Unary Operators
		System.out.println("pre increment "+(++a));
		System.out.println("Post Decrement "+(a--));
		
		//6. Bitwise operator
		System.out.println("And Bitwise "+(a&b));
		System.out.println("Or Bitwise "+(a|b));
		System.out.println("XOr Bitwise "+(a^b));
	}
}