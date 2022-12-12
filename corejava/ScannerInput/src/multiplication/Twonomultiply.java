package multiplication;

import java.util.Scanner;

public class Twonomultiply {
public static void main(String[] args)
{
	System.out.println("Enter First Number");
	Scanner sc=new Scanner(System.in);
	int x=sc.nextInt();
	System.out.println("Enter Second Number");
	int y=sc.nextInt();
	int z=x*y;
	System.out.println("Two no. multiplication is:"+z);
	sc.close();

}
}
