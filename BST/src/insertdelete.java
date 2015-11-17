
public class insertdelete {

	public static void main(String args[])
	{
		Node root = insert(null, 50);
	    root = insert(root, 30);
	    root = insert(root, 20);
	    root = insert(root, 40);
	    root = insert(root, 70);
	    root = insert(root, 60);
	    root = insert(root, 80);
	    root = delete(root,20);
	    root = delete(root,30);
	    root = delete(root,50);
	    System.out.print("");
	}
	
	public static Node insert(Node x, int k)
	{
		if(x == null)
			return new Node(k);
		if(k<x.val)
			x.left = insert(x.left,k);
		else
			x.right = insert(x.right,k);
		return x;
	}
	
	public static Node delete(Node x, int k)
	{
		if(x==null)
			return x;
		if(k < x.val)
			x.left = delete(x.left,k);
		else if(k>x.val)
			x.right = delete(x.right,k);
		else
		{
			if(x.left == null)
			{
				Node temp = x.right;
				x.right = null;
				x = null;
				return temp;
			}
			else if(x.right == null)
			{
				Node temp1 = x.left;
				x.left = null;
				x = null;
				return temp1;
			}
			
			Node temp3 = min(x.right);
			temp3.left = x.left;
			temp3.right = x.right;
			x = null;
			return temp3;
		}
		return x;
			
	}
	
	public static Node min(Node x)
	{
		if(x == null)
			return null;
		if(x.left!=null)
			return min(x.left);
		else
			return x;
	}
}
