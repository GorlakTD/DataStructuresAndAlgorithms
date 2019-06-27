package graph;

import java.util.ArrayList;

public class BreadthFirstSearch {
	private Graph ref;
	public BreadthFirstSearch(Graph g)
	{
		this.ref = g;	
	}
	public int retrieve(Object o)
	{
		ArrayList<Vertex> v = (ref.getVertices());
		for(int i = 0; i < v.size(); i++)
		{
			if(v.get(i).getValue().equals(o))
				return v.get(i).getID();
		}
		return -1;
			
	}
}
