//io operations
import java.lang.*;
import java.util.*;

class io_operation{
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		int a,b,c;
		System.out.println("Enter two numbers to add");
		a = in.nextInt();//a = in.nextFloat()
		b = in.nextInt();//b = in.nextFloat()
		c = a+b;
		System.out.println("Result "+c);
	}
}