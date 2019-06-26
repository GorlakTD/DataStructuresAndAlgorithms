package graph;

import java.util.ArrayList;

@SuppressWarnings("rawtypes")
public class Vertex<T extends Comparable> {
	private boolean visited;
	private ArrayList<Edge> edges = new ArrayList<Edge>();
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
	public ArrayList<Edge> getEdges()
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
	public void add(Vertex vert, T val)
	{
		edges.add(new Edge(this, vert, val));
	}
}