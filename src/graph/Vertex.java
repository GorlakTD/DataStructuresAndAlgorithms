package graph;

import java.util.LinkedList;

@SuppressWarnings("rawtypes")
public class Vertex<T extends Comparable> {
	private boolean visited;
	private LinkedList<Edge> edges = new LinkedList<Edge>();
	private T obj;
	private int id;
	public Vertex(T arg0, int id)
	{
		this.obj 	= arg0;
		this.id		= id;
	}
	public T getValue()
	{
		return this.obj;
	}
	public int getID()
	{
		return this.id;
	}
	public LinkedList<Edge> getEdges()
	{
		return this.edges;
	}
	public boolean isVisited()
	{
		return visited;
	}
	public Edge getEdge(int id2)
	{
		for (int i = 0; i < edges.size(); i++)
		{
			if(edges.get(i).checkVertices(this.id, id2))
				return edges.get(i);
		}
		return null;
	}
	
	public void add(Vertex<T> vert, T val)
	{
		edges.add(new Edge<T>(this, vert, val));
	}
}