
public class printkeys {

	public static void main(String args[])
	{
		Node x = new Node(20);
		x.left = new Node(8);
		x.left.left = new Node(4);
		x.left.right = new Node(12);
		x.right = new Node(22);
		disp(x,10,22);
	}
	
	public static void disp(Node x , int k1, int k2)
	{
		if( x== null)
			return;
		if(k1<x.val)
			disp(x.left,k1,k2);
		if(x.val >= k1 && x.val <= k2)
			System.out.print(x.val + " ");
		if(k2>x.val)
			disp(x.right,k1,k2);
	}
}
