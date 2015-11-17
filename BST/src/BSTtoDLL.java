public class BSTtoDLL {

	public static void main(String args[])
	{
		Node x = new Node(50);
		x.left = new Node(30);
		x.left.left = new Node(20);
		x.left.right = new Node(40);
		x.right = new Node(70);
		x.right.left = new Node(60);
		x.right.right = new Node(80);
		PointT head = new PointT();
		PointT tail = new PointT();
		convertSL(head, tail, x);
		disp(head.node);
	}
	
	public static void disp(Node x)
	{
		if( x == null)
			return;
		while(x!= null)
		{
			System.out.print(x.val + " ");
			x = x.right;
		}

	}
	
	public static void convert(PointT head, PointT tail, Node x)
	{
		if( x == null)
			return;
		convert(head,tail,x.left);
		if( tail.node == null)
			head.node = x;
		else
		{
			x.left = tail.node;
			tail.node.right = x;
		}
		tail.node = x;
		convert(head,tail,x.right);
	}
	
	public static void convertSL(PointT head, PointT tail, Node x)
	{
		if( x == null)
			return;
		convertSL(head,tail, x.left);
		if(tail.node == null)
			head.node = x;
		else
		{
			x.left = null;
			tail.node.right = x;
		}
		tail.node = x;
		convertSL(head,tail, x.right);
	}
}
