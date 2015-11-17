
public class connect {

	public static void main(String args[])
	{
		NodeR x = new NodeR(6);
		x.left = new NodeR(-13);
		x.left.right = new NodeR(-8);
		x.right = new NodeR(14);
		x.right.left = new NodeR(13);
		x.right.right = new NodeR(15);
		x.right.left.left = new NodeR(7);
		connectr(x);
		System.out.print("");
	}
	
	public static  void connectr(NodeR x)
	{
		x.nextright = null;
		connectright(x);
	}
	
	public static void connectright(NodeR x)
	{
		if( x == null)
			return;
		if( x.nextright != null)
			connectright(x.nextright);
		if(x.left != null)
		{
			if(x.right!= null)
			{
				x.left.nextright = x.right;
				x.right.nextright = getnextright(x);
			}
			else
				x.left.nextright = getnextright(x);
			connectright(x.left);
		}
		else if(x.right != null)
		{
			x.right.nextright = getnextright(x);
			connectright(x.right);
		}
		else
			connectright(getnextright(x));
	}
	
	public static NodeR getnextright(NodeR x)
	{
		NodeR temp = x.nextright;
		while(temp!= null)
		{
			if(temp.left != null)
				return temp.left;
			if(temp.right != null)
				return temp.right;
			temp = temp.nextright;
		}
		return null;
	}
}
