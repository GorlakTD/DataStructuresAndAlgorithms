package hashMap;

import java.util.Collection;
import java.util.LinkedList;
import java.util.Map;
import java.util.Set;

public class Hashmap implements Map{
	
	private LinkedList<String>[] keys;
	private LinkedList<Object>[] values;
	private int size;
	private int capacity;
	
	public Hashmap()
	{
		capacity = 8;
		keys  	 = new LinkedList[capacity];
		values 	 = new LinkedList[capacity];
		size 	 = 0;
	}
	
	
	
	
	@Override
	public void clear() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean containsKey(Object arg0) {
		// TODO Auto-generated method stub
		for(int i = 0; i < keys.length; i++)
		{
			if(keys[i].contains(arg0))
				return true;
		}
		return false;
	}

	@Override
	public boolean containsValue(Object arg0) {
		// TODO Auto-generated method stub
		for(int i = 0; i < values.length; i++)
		{
			if(values[i].contains(arg0))
				return true;
		}
		return false;
	}

	@Override
	public Set entrySet() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object get(Object arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Set keySet() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object put(Object arg0, Object arg1) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void putAll(Map arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Object remove(Object arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return this.size;
	}

	@Override
	public Collection values() {
		// TODO Auto-generated method stub
		return null;
	}

}
