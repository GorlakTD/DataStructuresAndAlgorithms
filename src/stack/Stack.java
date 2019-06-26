package stack;

public class Stack   {
	private Object[] ref = new Object[4096]; 
	private int lastIndex = 0;
	public void push(Object obj)
	{
		if(ref[4095] != null)
			return;
		ref[lastIndex] = obj;
		lastIndex = lastIndex + 1;	
	}
	public Object pop()
	{
		lastIndex = lastIndex - 1;
		if(lastIndex < 0)
			return null; 
		Object obj = ref[lastIndex];
		ref[lastIndex] = null;
		return obj;
		
	}
	public boolean isEmpty()
	{
		if (lastIndex == 0)
		{
			return true;
		}
		return false;
	}
	
}
