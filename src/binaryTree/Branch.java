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
	public void setVal(T arg0)
	{
		this.val = arg0;
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
		if(val.compareTo(arg0) >= 0) // arg0 > val :: -1 | arg0 = val :: 0 | arg0 < val :: 1
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
		if(val.compareTo(arg0) < 0) // arg0 > val :: -1 | arg0 = val :: 0 | arg0 < val :: 1
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
		if(val.compareTo(arg0) > 0) // arg0 > val :: -1 | arg0 = val :: 0 | arg0 < val :: 1
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
		if(val.compareTo(arg0) < 0) // arg0 > val :: -1 | arg0 = val :: 0 | arg0 < val :: 1
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
	public Branch findBranch(T arg0)
	{
		if(val.compareTo(arg0) < 0) // arg0 > val :: -1 | arg0 = val :: 0 | arg0 < val :: 1
		{
			try
			{
				return left.findBranch(arg0);
			}
			catch(NullPointerException e)
			{
				return null;
			}
		}
		if(val.compareTo(arg0) > 0) // arg0 > val :: -1 | arg0 = val :: 0 | arg0 < val :: 1
		{
			try
			{
				return right.findBranch(arg0);	
			}
			catch(NullPointerException e)
			{
				return null;
			}
		}
		if(val.compareTo(arg0) == 0) // arg0 > val :: -1 | arg0 = val :: 0 | arg0 < val :: 1
		{
			return this;
		}
		return null;
	}
	public boolean remove(T arg0) //returns the branch, not the whole tree.
	{
		Branch<T> br;
		if(val.compareTo(arg0) > 0) // arg0 > val :: -1 | arg0 = val :: 0 | arg0 < val :: 1
		{
			left.remove(arg0);
			
		}
		if(val.compareTo(arg0) < 0) // arg0 > val :: -1 | arg0 = val :: 0 | arg0 < val :: 1
		{
			right.remove(arg0);	
		}
		if(!(this.hasRight()) && !(this.hasLeft()))
		{
			this.setVal(null);
			return true;
		}
		if(this.hasRight() && !(this.hasLeft()))
		{
			br = this.getRight();
			this.setVal(br.getVal());
			this.setLeft(br.getLeft());
			this.setRight(br.getRight());
			return true;
		}
		if(this.hasLeft() && !(this.hasRight()))
		{
			br = this.getLeft();
			this.setVal(br.getVal());
			this.setLeft(br.getLeft());
			this.setRight(br.getRight());
			return true;
		}
		if(this.hasLeft() && this.hasRight())
		{
			br = new Branch(this.hooBoyHereWeGo(this.getLeft()));
			br.setLeft(this.getLeft());
			br.setRight(this.getRight());
			this.setVal(br.getVal());
			return true;
		}
		return false;
	}
	private T hooBoyHereWeGo(Branch br)
	{
		if(br.hasRight())
		{
			return (T) br.hooBoyHereWeGo(br.getRight());
		}
		else
		{
			return (T) br.getVal();
		}
	}
}
