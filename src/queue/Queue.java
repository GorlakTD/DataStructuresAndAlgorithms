package queue;

public class Queue {
	private Object[] ref = new Object[4096];
	private int firstIndex = 0;
	private int lastIndex  = 0;
	public void push(Object obj)
	{
		if(ref[4095] != null)
			return;
		ref[lastIndex] = obj;
		lastIndex = lastIndex + 1;
	}
	public Object pop()
	{
		
		Object obj = ref[firstIndex];	
		ref[firstIndex] = null;
		firstIndex = firstIndex + 1;
		return obj;

	}
	
	
}
