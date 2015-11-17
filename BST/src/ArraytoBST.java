
public class ArraytoBST {

	public static void main(String args[])
	{
		int[] a = {1, 2, 3,4,5, 6};
		Node x = gen(a, 0 ,a.length-1);
		disp(x);
	}
	
	public static void disp(Node x)
	{
		if(x == null)
			return ;
		disp(x.left);
		System.out.print(x.val + " ");
		disp(x.right);
	}
	
	public static Node gen(int[] a, int l , int r)
	{
		if( l > r)
			return null;
		int mid = l +( r - l )/2;
		Node x = new Node(a[mid]);
		if( l == r)
			return x;
		x.left = gen(a, l, mid-1);
		x.right = gen(a, mid+1, r);
		return x;
	}
}