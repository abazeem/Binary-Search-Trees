import java.util.Iterator;
import java.util.Set;
import java.util.TreeMap;

public class Printvertical {

	public static void main(String args[])
	{
		Node x = new Node(6);
		x.left = new Node(-13);
		x.left.right = new Node(-8);
		x.right = new Node(14);
		x.right.left = new Node(13);
		x.right.right = new Node(15);
		x.right.left.left = new Node(7);
		printv(x);
	}
	
	public static void printv(Node x)
	{
		TreeMap<Integer, Node> map = new TreeMap<Integer,Node>();
		getorder(x,map,0);
		Set<Integer> list = map.keySet();
		Iterator<Integer> it = list.iterator();
		while(it.hasNext())
		{
			Node temp = map.get(it.next());
			while(temp!=null)
			{
				System.out.print(temp.val + " ");
				temp = temp.right;
			}
			System.out.println("");
		}
	}
	
	public static void getorder(Node x, TreeMap<Integer,Node> map, int h)
	{
		if(x == null)
			return ;
		if(map.get(h) == null)
			map.put(h, new Node(x.val));
		else
		{
			Node temp = map.get(h);
			while(temp.right != null)
				temp = temp.right;
			temp.right = new Node(x.val);
		}
		getorder(x.left,map,h-1);
		getorder(x.right,map,h+1);
	}
}
