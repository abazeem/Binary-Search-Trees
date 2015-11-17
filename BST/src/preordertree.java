public class preordertree {

	public static void main(String args[])
	{
		int[] a = {10,5,1,7,40,50};
		Node x = calc(a,a.length,new Node(0), 1000, -1000);
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
	
	public static Node calc(int[] a , int size, Node preorder, int max , int min)
	{
		if(preorder.val >= size)
			return null;
		Node x  = null;
		if(a[preorder.val] > min && a[preorder.val] < max )
		{
			x = new Node(a[preorder.val]);
			preorder.val++;
			x.left = calc(a,size,preorder,x.val,min);
			x.right = calc(a,size,preorder,max,x.val);
			return x;
		}
		return x;
	}
}
