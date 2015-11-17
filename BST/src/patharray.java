public class patharray {

	public static void main(String args[])
	{
		Node x = new Node(50);
		x.left = new Node(30);
		x.right = new Node(70);
		x.left.left = new Node(20);
		x.left.right = new Node(40);
		x.right.left = new Node(60);
		x.right.right = new Node(80);
		int[] a = new int[6];
		
		a = calc(x,a,0,80);
		for(int i = 0;i<a.length; i++)
		{
			System.out.print(a[i] + " ");		
		}
	}
	
	public static int[] calc(Node x, int[] a, int path, int k)
	{
		if(x == null)
		{
			int [] abc = new int[1];
			abc[0] = -1;
			return abc;
		}
		
		if( x.val == k)
			return a;
		else
		{
			if(x.val > k)
			{
				a[path] = -5;
				path++;
				return calc(x.left, a, path, k);
			}
			else
			{
				a[path] = 5;
				path++;
				return calc(x.right, a,path,k);
			}
		}
		
	}
}
