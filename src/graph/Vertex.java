package graph;

import java.util.ArrayList;

@SuppressWarnings("rawtypes")
public class Vertex<T extends Comparable> {
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
	public void add(Vertex vert, T val)
	{
		edges.add(new Edge(this, vert, val));
	}
}