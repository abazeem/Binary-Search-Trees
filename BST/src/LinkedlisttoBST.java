public class LinkedlisttoBST {

	public static void main(String args[])
	{
		NodeL x = new NodeL(1);
		x.next = new NodeL(2);
		x.next.next = new NodeL(3);
		x.next.next.next = new NodeL(4);
		x.next.next.next.next = new NodeL(5);
		//Node root = gen(x,x.next.next.next.next);
		Node root = calc(x,5);
		disp(root);
	}
	
	public static Node calc(NodeL x, int n)
	{
		Point headref = new Point(x);
		return (convert(headref,n));
	}
	
	public static Node convert(Point headref, int n)
	{
		if(n <= 0)
			return null;
		Node left  = convert(headref, n/2);
		Node x = new Node(headref.node.val);
		headref.node = headref.node.next;
		x.left = left;
		x.right = convert(headref,n-n/2-1);
		return x;
	}
	
	
	
	public static void disp(Node x)
	{
		if(x == null)
			return;
		disp(x.left);
		System.out.print(x.val + " ");
		disp(x.right);
	}
	
	public static Node gen(NodeL head, NodeL tail)
	{
		if(head == null || tail == null)
			return null;
		NodeL mid = genmid(head, tail); 
		Node temp = new Node(mid.val);
		if(head == tail)
			return temp;
		NodeL temp2 = head;
		while(temp2.next != mid && temp2 != mid)
			temp2 = temp2.next;
		if(temp2 != mid)
			temp.left = gen(head, temp2);
		temp.right = gen(mid.next, tail);
		return temp;
	}
	
	public static NodeL genmid(NodeL head, NodeL tail)
	{
		NodeL mid = head;
		while(head.next != tail.next && head.next.next != tail.next)
		{
			mid = mid.next;
			head = head.next.next;
		}
		return mid;
	}
}
