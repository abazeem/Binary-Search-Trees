
public class Boundary {

	public static void main(String args[])
	{
		Node x = new Node(6);
		x.left = new Node(-13);
		x.left.right = new Node(-8);
		x.right = new Node(14);
		x.right.left = new Node(13);
		x.right.right = new Node(15);
		x.right.left.left = new Node(7);
		print(x);
	}
	
	public static void printleft(Node x)
	{
		if ( x == null)
			return;
		if( x.left != null)
		{
			System.out.print(x.val + " ");
			printleft(x.left);
		}
		else if(x.right != null)
		{
			System.out.print(x.val + " ");
			printleft(x.right);
		}
	}
	
	public static void printright(Node x)
	{
		if ( x == null)
			return;
		if( x.right != null)
		{
			System.out.print(x.val + " ");
			printright(x.right);
		}
		else if( x.left != null)
		{
			System.out.print(x.val + " ");
			printright(x.left);
		}
	}
	
	public static void printleaves(Node x)
	{
		if ( x == null)
			return ;
		printleaves(x.left);
		if( x.left == null && x.right == null)
			System.out.print(x.val + " ");
		printleaves(x.right);	
	}
	
	public static void print(Node x)
	{
		if( x == null)
			return;
		System.out.print(x.val + " ");
		printleft(x.left);
		printleaves(x.left);
		printleaves(x.right);
		printright(x.right);
	}
}
