
public class greatestsum {

	public static void main(String args[])
	{
		Node x = new Node(50);
		x.left = new Node(30);
		x.left.left = new Node(20);
		x.left.right = new Node(40);
		x.right = new Node(70);
		x.right.left = new Node(60);
		x.right.right = new Node(80);
		calc(x,new Node(0));
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
	
	
	public static void calc(Node x, Node sum)
	{
		if(x == null)
			return;
		calc(x.right,sum);
		sum.val = sum.val + x.val;
		x.val = sum.val;
		calc(x.left,sum);
	}
}
