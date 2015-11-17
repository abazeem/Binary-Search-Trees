
public class hassum {

	public static void main(String args[])
	{
		Node x = new Node(10);
		x.left = new Node(5);
		x.left.left = new Node(3);
		x.left.right = new Node(8);
		x.right = new Node(15);
		x.right.right = new Node(30);
		x.right.right.left = new Node(19);
		System.out.print(check(x,25));
	}
	
	public static boolean check(Node x, int sum)
	{
		Stack stk1 = new Stack(10);
		Stack stk2 = new Stack(10);
		Node left = x;
		Node right = x;
		Node curr1 = left;
		Node curr2 = right;
		while(curr1 != null || !stk1.isEmpty() ||curr2 != null || !stk2.isEmpty()  )
		{
			if(curr1 != null || curr2 != null)
			{
				if(curr1 != null)
				{
					stk1.push(curr1);
					curr1 = curr1.left;
				}
				if(curr2 != null)
				{
					stk2.push(curr2);
					curr2 = curr2.right;
				}
			}
			else
			{
				curr1 = stk1.pop();
				curr2 = stk2.pop();
				if(curr1.val + curr2.val == sum && curr1.val != curr2.val)
					return true;
				if(curr1.val + curr2.val < sum)
				{
					curr1 = curr1.right;
					stk2.push(curr2);
					curr2 = null;
				}
				else
				{
					stk1.push(curr1);
					curr1 = null;
					curr2 = curr2.left;
				}
				
			}
		}
		return false;
	}
}
