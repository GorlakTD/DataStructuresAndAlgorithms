package binaryTree;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Tree <T extends Comparable<T>>{ //implements List{
	private Branch root;
	public Tree()
	{
	}
	public void add(T arg0) {
		// TODO Auto-generated method stub
		
		if (root == null)
		{
			this.root = new Branch<T>(arg0);
			return;
		}
		root.add(arg0);
	}

	public void addAll(Collection<T> arg0) {
		// TODO Auto-generated method stub
		for (T val : arg0)
		{
			root.add(val);
		}
	}

	public void clear() {
		// TODO Auto-generated method stub
		root = null;
	}

	public boolean contains(T arg0) {
		// TODO Auto-generated method stub
		return root.find(arg0);
	}

	public boolean isEmpty() {
		// TODO Auto-generated method stub
		if (root == null)
			return true;
		return false;
	}

	public boolean remove(T o) {
		// TODO Auto-generated method stub
		if(!(this.contains(o)))
		{
			return false;	
		}
		return root.remove(o);
			
		
	}

	public int size() {
		// TODO Auto-generated method stub
		return 0;
	}

	public Object[] toArray() {
		// TODO Auto-generated method stub
		return null;
	}

	public Object[] toArray(Object[] a) {
		// TODO Auto-generated method stub
		return null;
	}

}
