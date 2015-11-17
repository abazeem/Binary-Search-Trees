public class Queue {

	int capacity;
	int front;
	int last;
	Node[] arr;
	
	public Queue(int x)
	{
		capacity = x;
		front = -1;
		last = 0;
		arr = new Node[x];
	}
	
	public void enqueue(Node x)
	{
		if(front - last < capacity)
			arr[++front] = x;
	}
	
	public Node dequeue()
	{
		if(front>= last)
			return(arr[last++]);
		return null;
	}
	
	public boolean isEmpty()
	{
		if(front < last)
			return true;
		else 
			return false;
	}
	
	public int size()
	{
		return (front - last + 1);
	}
}
