
public class swapBST {

	public static void main(String args[])
	{
		Node x = new Node(6);
		x.left = new Node(10);
		x.left.left = new Node(1);
		x.left.right = new Node(3);
		x.right = new Node(2);
		x.right.left = new Node(7);
		x.right.right = new Node(12);
		calc(x);
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
	
	@SuppressWarnings("unused")
	public static Node calc(Node x)
	{
		PointT first = new PointT(), last = new PointT(), mid = new PointT(),prev = new PointT();
		calc2(x,first,last,mid,prev);
		if(last != null)
			swap(first.node, last.node);
		else
			swap(first.node, mid.node);
		return x;
	}
	
	public static void calc2(Node x, PointT first, PointT last, PointT mid, PointT prev)
	{
		if(x == null)
			return;
		calc2(x.left,first,last,mid,prev);
		if(prev.node != null && x.val < prev.node.val)
		{
			if(first.node == null)
			{
				first.node = prev.node;
				mid.node = x;
			}
			else
				last.node = x;
		}
		else
			prev.node = x;
		calc2(x.right,first,last,mid,prev);
	}
	
	public static void swap(Node a, Node b)
	{
		int temp = a.val;
		a.val = b.val;
		b.val = temp;
	}
}
