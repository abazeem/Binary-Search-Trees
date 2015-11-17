
public class Heavypath {

	public static void main(String args[])
	{
		Node x = new Node(1);
		x.left = new Node(2);
		x.right = new Node(5);
		x.left.left = new Node(5);
		x.left.right = new Node(4);
		x = delete(x,7,new Nodecheck());
		disp(x);
	}

	public static void disp(Node x)
	{
		if(x == null)
			return;
		disp(x.left);
		System.out.print(x.val + " ");
		disp(x.right);
	}
	
	public static Node delete(Node x, int k, Nodecheck check)
	{
		Nodecheck b1 = new Nodecheck();
		Nodecheck b2 = new Nodecheck();
		if(x== null)
			return null;
		x.left = delete(x.left, k - x.val, b1);
		x.right = delete(x.right,k - x.val,b2);
		if(isleaf(x) && k - x.val > 0 || (!isleaf(x) && (b1.val && b2.val)))
		{
			check.val = true;
			x.left = null;
			x.right = null;
			x = null;
			return x;
		}
		else
		{
			return x;
		}
		
//		if( k < 0 || (b1.val && b2.val))
//		{
//			check.val = true;
//			x.left = null;
//			x.right = null;
//			x = null;
//			return x;
//		}
//		else
//			return x;
	}
	
	public static boolean isleaf(Node x)
	{
		if(x.left == null && x.right == null)
			return true;
		else
			return false;
	}
}
