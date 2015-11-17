public class isBST {

	public static void main(String args[])
	{
		//Node root = insert(null, 50);
	    //root = insert(root, 30);
	    //root = insert(root, 20);
	    //root = insert(root, 40);
	    //root = insert(root, 70);
	    //root = insert(root, 60);
	    //root = insert(root, 80);
		Node root = new Node(50);
		root.left = new Node(30);
		root.left.right = new Node(60);
		root.right= new Node(70);
	    if(isBST1(root,10000,-10000))
	    	System.out.println("Yes");
	    else
	    	System.out.println("No");
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
	
	public static boolean isBST1(Node x , int max, int min)
	{
		if(x == null)
			return true;
		if(x.val > min && x.val < max && isBST1(x.left,x.val,min) && isBST1(x.right,max,x.val))
			return true;
		else
			return false;
	}
}
