package stack;

import java.util.LinkedList;

public class Stack<T extends Comparable<T>>   {
	private LinkedList<T> ref = new LinkedList<T>();
	public Stack()
	{
		
	}
	public void push(T obj)
	{
		ref.add(obj);
	}
	public T pop()
	{
		return ref.removeLast();
	}
	
}
