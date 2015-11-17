
public class treetoarray {

	public static void main(String args)
	{
		Node x = new Node(10);
		x.left = new Node(20);
		x.right = new Node(40);
		x.left.right = new Node(60);
		x.left.left = new Node(50);
		x.right.right = new Node(70);
		int[] a = new int[7];
		convert(x,a,new Node(0));
		for(int i = 0; i< a.length; i++)
			System.out.print( a[i] + " ");
	}
	
	public static void convert(Node x, int[] a, Node p)
	{
		if( x == null)
			return;
		convert(x.left,a,p);
		a[p.val] = x.val;
		p.val++;
		convert(x.right, a, p);
	}
	
}
