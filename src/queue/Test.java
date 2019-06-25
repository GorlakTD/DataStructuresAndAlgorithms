package queue;

public class Test {
	public static void main(String args[])
	{
	Queue q = new Queue();
	q.push(5);
	q.push(6);
	q.push(4);
	System.out.println(q.pop());
	System.out.println(q.pop());
	System.out.println(q.pop());
	}
}
