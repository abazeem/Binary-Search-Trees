public class Ceil {

	public static void main(String args[])
	{
		Node x = new Node(6);
		x.left = new Node(-13);
		x.left.right = new Node(-8);
		x.right = new Node(14);
		x.right.left = new Node(13);
		x.right.right = new Node(15);
		x.right.left.left = new Node(7);
		System.out.print(calc(x, 9));
	}
	
	public static int calc(Node x, int k)
	{
		if(x == null)
			return -1;
		if(x.val == k)
			return x.val;
		if(x.val < k)
			return calc(x.right, k);
		int temp = calc(x.left,k);
		if(temp >= k)
			return temp;
		else
			return x.val;
					
	}
}
