
public class Stack {

	int capacity;
	Node[] arr ;
	int top;
	
	public Stack( int x)
	{
		capacity = x;
		arr = new Node[x];
		top = -1;
	}
	
	public void push(Node x)
	{
		if(top<capacity)
			arr[++top] = x;
		return;
	}
	
	public Node pop()
	{
		if(top!=-1)
			return(arr[top--]);
		return null;
	}
	
	public boolean isEmpty()
	{
		return (top == -1);
	}
}
