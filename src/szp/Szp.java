package szp;

import java.util.*;

public class Szp
{
	public static void main(String[] args)
	{
		Scanner scanner=new Scanner(System.in);
		System.out.println("请输入数字a");
		int a=scanner.nextInt();
		System.out.println("请输入数字b");
		int b=scanner.nextInt();
		int sum=a-b;
		System.out.println("两个数之差为"+sum);
	}
}