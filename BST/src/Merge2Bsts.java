public class Merge2Bsts {

	public static void main(String args[])
	{
		Node x = new Node(50);
		x.left = new Node(30);
		x.right = new Node(70);
		x.right.right = new Node(80);
		Node y = new Node(40);
		y.left = new Node(20);
		y.right = new Node(60);
		int[] b = toinorder(y, new int[size(y)], new Node(0));
		int[] a = toinorder(x,new int[size(x)], new Node(0));
		int[] ab = merge(a, b, size(x), size(y));
		Node root = convert(ab, 0 ,ab.length -1 );
		disp(root);
	}
	
	public static void disp(Node x)
	{
		if(x == null)
			return;
		disp(x.left);
		System.out.print(x.val + " ");
		disp(x.right);
	}
	
	public static int size(Node x)
	{
		if(x == null)
			return 0;
		return (size(x.left) + 1 + size(x.right));
	}
	
	
	public static int[] toinorder(Node x, int[] a, Node i)
	{
		if(x == null)
			return a;
		a = toinorder(x.left,a,i);
		a[i.val] = x.val;
		i.val++;
		a = toinorder(x.right,a,i);
		return a;		
	}
	
	public static int[] merge(int[] a , int [] b , int n1, int n2)
	{
		int i = 0;
		int j = 0;
		int k = 0;
		int[] c = new int[n1+n2];
		while(i<n1 && j<n2)
		{
			if(a[i] < b[j])
				c[k++] = a[i++];
			else
				c[k++] = b[j++];
		}
		while(i<n1)
			c[k++] = a[i++];
		while(j<n2)
			c[k++] = a[j++];
		return c;
	}
	
	public static Node convert(int[] a, int left, int right)
	{
		if(left> right)
			return null;
		int mid = left + (right - left)/2;
		Node x = new Node(a[mid]);
		if(left == right)
			return x;
		x.left = convert(a, left, mid-1);
		x.right = convert(a, mid+1, right);
		return x;
	}
}
