
public class internalnode {

	public static void main(String args[])
	{
		int[] pre = {8, 3, 5, 7, 6};
		if(calc(pre))
			System.out.print("Yes");
		else
			System.out.print("No");
	}
	
	public static boolean calc(int[] a)
	{
		for(int i = 0; i<a.length-2;i++)
		{
			int next = a[i] - a[i+1];
			int difflast = a[i] - a[a.length - 1];
			if(next*difflast < 0)
				return false;
		}
		return true;
	}
}
