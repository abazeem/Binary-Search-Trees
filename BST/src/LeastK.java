public class LeastK {

	public static void main(String args[])
	{
		
		//Node root = new Node(50);
		//root.left = new Node(30);
		//root.left.right = new Node(40);
		//root.right= new Node(70);
		//root.right.left = new Node(60);
		//root.right.right = new Node(80);
		//int x = disp(root,new Node(3));
		//if(x>0)
		//	System.out.print("Error");
		Nodep root = insert(null, 50);
		root = insert(root,40);
		root = insert(root,60);
		root = insert(root,30);
		root = insert(root,70);
		root = insert(root,80);
		System.out.println(kthelement(root,4));
	}
	
	public static int disp(Node x, Node k)
	{
		if(x == null)
			return k.val;
		k.val = disp(x.left,k);
		k.val--;
		if(k.val == 0)
			System.out.print(x.val);
		k.val = disp(x.right,k);
		return k.val;
	}
	
	public static Nodep insert(Nodep root, int k)
	{
		Nodep prev = root;
		Nodep curr = root;
		while(prev != null)
		{
			curr = prev;
			if(prev.val > k)
			{
				prev.count++;
				prev = prev.left;
			}
			else
				prev = prev.right;
		}
		if(root == null)
			return new Nodep(k);
		if( k < curr.val)
			curr.left = new Nodep(k);
		else
			curr.right = new Nodep(k);
		return root;
	}
	
	public static int kthelement(Nodep x, int k)
	{
		if( x == null)
			return -1;
		int rev = -1;
		Nodep p = x;
		while(p != null)
		{
			if(k == p.count + 1)
			{
				rev = p.val;
				break;
			}
			else if(k < p.count)
				p = p.left;
			else 
			{
				k = k - p.count - 1;
				p = p.right;
			}
		}
		return rev;
	}
}
