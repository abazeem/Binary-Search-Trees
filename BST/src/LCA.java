public class LCA {

	public static void main(String args[])
	{
		Node root = new Node(50);
		root.left = new Node(30);
		root.left.right = new Node(60);
		root.right= new Node(70);
		root.left.left = new Node(10);
		System.out.print(checkLCA(root,10,30).val);
	}
	
	public static Node checkLCA(Node x , int n1, int n2)
	{
		if(x == null)
			return null;
		if(x.val == n1 || x.val == n2 )
			return x;
		Node left_LCA = checkLCA(x.left,n1,n2);
		Node right_LCA = checkLCA(x.right,n1,n2);
		
		if(left_LCA !=null && right_LCA !=null)
			return x;
		if(left_LCA == null)
			return right_LCA;
		else
			return left_LCA;
	}
}
