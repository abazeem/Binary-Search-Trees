public class complete {

	public static void main(String args[])
	{
		Node x = new Node(1);
		x.left = new Node(2);
		x.right = new Node(3);
		x.left.left = new Node(4);
		System.out.print(check(x));
	}
	
	public static boolean check(Node y)
	{
		if ( y == null )
			return true;
		Queue que = new Queue(10);
		que.enqueue(y);
		boolean flag = false;
		while(!que.isEmpty())
		{
			Node x = que.dequeue();
			if( x.left != null)
			{
				if ( flag)
					return false;
				que.enqueue(x.left);
			}
			else
				flag = true;
			if( x.right != null)
			{
				if( flag )
					return false;
				que.enqueue(x.right);
			}
			else
				flag = true;
		}
		return true;
	}
}
