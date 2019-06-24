package binaryTree;

@SuppressWarnings("rawtypes")
public class Branch/*<T extends Comparable>*/ {
	private Object val;
	private Branch left;
	private Branch right;
	public Branch(Object obj)
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
	public Object getVal()
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
}
