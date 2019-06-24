package binaryTree;

@SuppressWarnings("rawtypes")
public class Branch<T extends Comparable<T>> {
	private T val;
	private Branch left;
	private Branch right;
	public Branch(T obj)
	{
		this.val = obj;
	}
	public Branch getLeft()
	{
		return left;
	}
	public Branch getRight()
	{
		return right;
	}
	public T getVal()
	{
		return val;
	}
	public void setLeft(Branch br)
	{
		this.left  = br;
	}
	public void setRight(Branch br)
	{
		this.right = br;
	}
	public boolean hasLeft()
	{
		if (this.left == null)
		{
			return false;
		}
		return true;
	}
	public boolean hasRight()
	{
		if (this.right == null)
		{
			return false;
		}
		return true;
	}
	
	public void add(T arg0) 
	{
		if(val.compareTo(arg0) <= 0) // arg0 > val :: -1 | arg0 = val :: 0 | arg0 < val :: 1
		{
			try
			{
				if(!(this.getLeft() == null))
				{
					left.add(arg0);
					return;
				}
				this.left = new Branch<T>(arg0);
				return;
			}
			catch(NullPointerException e)
			{
				this.left = new Branch<T>(arg0);
				return;
			}
		}	
		if(val.compareTo(arg0) > 0) // arg0 > val :: -1 | arg0 = val :: 0 | arg0 < val :: 1
		{
			try
			{
				if(!(this.getRight() == null))
				{
					right.add(arg0);
					return;
				}
				this.right = new Branch<T>(arg0);
				return;
			}
			catch(NullPointerException e)
			{
				this.right = new Branch<T>(arg0);
				return;
			}
		}
	}
	public boolean find(T arg0)
	{
		if(val.compareTo(arg0) < 0) // arg0 > val :: -1 | arg0 = val :: 0 | arg0 < val :: 1
		{
			try
			{
				return left.find(arg0);
				
			}
			catch(NullPointerException e)
			{
				return false;
			}
		}
		if(val.compareTo(arg0) > 0) // arg0 > val :: -1 | arg0 = val :: 0 | arg0 < val :: 1
		{
			try
			{
				return right.find(arg0);	
			}
			catch(NullPointerException e)
			{
				return false;
			}
		}
		if(val.compareTo(arg0) == 0) // arg0 > val :: -1 | arg0 = val :: 0 | arg0 < val :: 1
		{
			return true;
		}
		return false;
	}
	public Branch remove(T arg0)
	{
		if(val.compareTo(arg0) < 0) // arg0 > val :: -1 | arg0 = val :: 0 | arg0 < val :: 1
		{
			return left.remove(arg0);
		}
		if(val.compareTo(arg0) > 0) // arg0 > val :: -1 | arg0 = val :: 0 | arg0 < val :: 1
		{
			return right.remove(arg0);	
		}
		if(!(this.hasRight()) && !(this.hasLeft()))
		{
			return null;
		}
		if(this.hasRight() && !(this.hasLeft()))
		{
			return this.getRight();
		}
		if(this.hasLeft() && !(this.hasRight()))
		{
			return this.getLeft();
		}
		if(this.hasLeft() && this.hasRight())
		{
			return this.getLeft().hooBoyHereWeGo(this);
		}
		return null;
	}
	public Branch hooBoyHereWeGo(Branch br)
	{
		if(this.hasRight())
		{
			return this.hooBoyHereWeGo(br);
		}
		else
		{
			return this;
		}
	}
}
