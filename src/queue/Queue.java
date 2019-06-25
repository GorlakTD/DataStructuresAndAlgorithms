package queue;

import java.util.LinkedList;

public class Queue <T extends Comparable<T>>{
	private LinkedList<T> ref = new LinkedList<T>();
	public Queue()
	{
		
	}
	public void push(T obj)
	{
		ref.add(obj);
	}
	public T pop()
	{
		return ref.removeFirst();
	}
	
}
