public class Maxwidth {

	public static void main(String args[])
	{
		Node x = new Node(50);
		x.left = new Node(30);
		x.left.left = new Node(20);
	//	x.left.right = new Node(40);
		x.right = new Node(70);
		x.right.left = new Node(60);
		//x.right.right = new Node(80);
		System.out.print(max(x));
	}
	
	public static int max(Node x)
	{
		Queue que = new Queue(100);
		que.enqueue(x);
		int size = 0;
		int max = 0;
		while(!que.isEmpty())
		{
			size = que.size();
			if(max<size)
				max = size;
			while(size!=0)
			{
				Node temp = que.dequeue();
				if(temp.left!=null)
					que.enqueue(temp.left);
				if(temp.right!=null)
					que.enqueue(temp.right);
				size--;
			}
		}
		return max;
	}
}
