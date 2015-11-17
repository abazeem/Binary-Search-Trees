public class removekeys {

	public static void main(String args[])
	{
		Node x = new Node(6);
		x.left = new Node(-13);
		x.left.right = new Node(-8);
		x.right = new Node(14);
		x.right.left = new Node(13);
		x.right.right = new Node(15);
		x.right.left.left = new Node(7);
		calc(x, -10,13);	
		disp(x);
	}
	
	public static void disp(Node x)
	{
		if(x == null)
			return ;
		disp(x.left);
		System.out.print(x.val + " ");
		disp(x.right);
	}
	public static Node calc(Node x , int min , int max)
	{
		if(x == null)
			return null;
		x.left = calc(x.left,min,max);
		x.right = calc(x.right,min,max);
		if(x.val < min)
		{
			Node temp = x.right;
			x.right = null;
			return temp;
		}
		if(x.val > max)
		{
			Node temp2 = x.left;
			x.left = null;
			return temp2;
		}
		return x;
	}
}
