
public class Mergeusingstacks {
		
	public static void main(String args[])
	{
		Node x = new Node(50);
		x.left = new Node(30);
		x.right = new Node(70);
		x.right.right = new Node(80);
		Node y = new Node(40);
		y.left = new Node(20);
		y.right = new Node(60);
		merge(x,y);
	}
	
	public static void disp(Node x)
	{
		if(x == null)
			return ;
		disp(x.left);
		System.out.print(x.val + " ");
		disp(x.right);
	}
	
	public static void merge(Node a, Node b)
	{
		Stack stk1 = new Stack(10);
		Stack stk2 = new Stack(10);
		Node curr1 = a;
		Node curr2 = b;
		if(a == null)
		{
			disp(b);
			return;
		}
		if(b == null)
		{
			disp(a);
			return;
		}
		
		while(curr1 != null || curr2 !=null || !stk1.isEmpty() || !stk2.isEmpty())
		{
			if( curr1 != null || curr2!=null)
			{
				if(curr1 != null)
				{
					stk1.push(curr1);
					curr1 = curr1.left;
				}
				if(curr2 != null)
				{
					stk2.push(curr2);
					curr2 = curr2.left;
				}
			}
			else if(!stk1.isEmpty() || !stk2.isEmpty())
			{
				if(stk1.isEmpty())
				{
					curr2 = stk2.pop();
					curr2.left = null;
					disp(curr2);
					return;
				}
				if(stk2.isEmpty())
				{
					curr1 = stk1.pop();
					curr1.left = null;
					disp(curr1);
					return;
				}
				curr1 = stk1.pop();
				curr2 = stk2.pop();
				if(curr1.val < curr2.val)
				{
					System.out.print(curr1.val + " ");
					curr1 = curr1.right;
					stk2.push(curr2);
					curr2 = null;
				}
				else
				{
					System.out.print(curr2.val + " ");
					curr2 = curr2.right;
					stk1.push(curr1);
					curr1 = null;
				}
			}
		}
	}
}