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
	public Branch remove(T arg0) //returns the modified branch, not the whole tree.
	{
		Branch<T> br;
		
		if(val.compareTo(arg0) > 0) // arg0 > val :: -1 | arg0 = val :: 0 | arg0 < val :: 1
		{
			br = this.getLeft();
			if(br.getVal().equals(arg0))
			{
		
				if(!(br.hasRight()) && !(br.hasLeft()))
				{
					this.setLeft(null);
				}
				if(br.hasLeft() && !br.hasRight())
				{
					this.setLeft(br.getLeft());
				}
				if(br.hasRight() && !br.hasLeft())
				{
					this.setLeft(br.getRight());
				}
				if(br.hasLeft() && br.hasRight())
				{
					Branch c = new Branch(this.hooBoyHereWeGo(br));
					c.setLeft(br.getLeft());
					c.setRight(br.getRight());
					this.setLeft(c);
				}
			}
			else
				return left.remove(arg0);
		}
		if(val.compareTo(arg0) < 0) // arg0 > val :: -1 | arg0 = val :: 0 | arg0 < val :: 1
		{
			br = this.getRight();
			if(br.getVal().equals(arg0))
			{
		
				if(!(br.hasRight()) && !(br.hasLeft()))
				{
					this.setRight(null);	
				}
				if(br.hasLeft() && !br.hasRight())
				{
					this.setRight(br.getLeft());
				}
				if(br.hasRight() && !br.hasLeft())
				{
					this.setRight(br.getRight());
				}
				if(br.hasLeft() && br.hasRight())
				{
					Branch c = new Branch(this.hooBoyHereWeGo(br));
					c.setLeft(br.getLeft());
					c.setRight(br.getRight());
					this.setRight(c);
				}
			}
			else
				return right.remove(arg0);
		}
		return this;
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
