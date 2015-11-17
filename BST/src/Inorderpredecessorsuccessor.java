
public class Inorderpredecessorsuccessor {

	public static void main(String args[])
	{
		Node root = insert(null, 50);
	    root = insert(root, 30);
	    root = insert(root, 20);
	    root = insert(root, 40);
	    root = insert(root, 70);
	    root = insert(root, 60);
	    root = insert(root, 80);
	    presuc(root,null,null,70);
	}
	
	public static Node insert(Node x, int k)
	{
		if(x == null)
			return new Node(k);
		if(k<x.val)
			x.left = insert(x.left,k);
		else
			x.right = insert(x.right,k);
		return x;
	}
	
	public static void presuc(Node x, Node pre, Node suc, int k)
	{
		if(x==null)
			return;
		if(x.val == k)
		{
			if(x.left != null)
			{
				Node temp = x.left;
				while(temp.left!=null)
					temp = temp.left;
				pre = temp;
			}
			if(x.right != null)
			{
				Node temp2 = x.right;
				while(temp2.right != null)
					temp2 = temp2.right;
				suc = temp2;
			}
			
			if(pre == null)
				System.out.println("Predecessor is null" );
			else
				System.out.println("Predecessor " + pre.val);
			if(suc == null)
				System.out.println("Successor is null" );
			else
				System.out.println("Successor " + suc.val);	
			return;
		}
		if(x.val > k)
		{
			suc = x;
			presuc(x.left,pre,suc,k);
		}
		else
		{
			pre = x;
			presuc(x.right,pre,suc,k);
		}
	}
}
