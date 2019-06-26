package graph;

import java.util.ArrayList;

public class Graph<T extends Comparable<T>> {
	private ArrayList<Vertex> vertices = new ArrayList<Vertex>();
	public Graph(Vertex v)
	{
		vertices.add(v);
	}
	public void addVertex(Vertex ref, T obj, T val)
	{
		Vertex vert = new Vertex(obj, vertices.size());
		ref.add(vert, val);
		vert.add(ref, val);
		vertices.add(vert);
	}
	public void connectVertex(int id, int id2, T val)
	{
		vertices.get(id).add(vertices.get(id2), val);
		vertices.get(id2).add(vertices.get(id), val);
	}
	public ArrayList<Vertex> getVertices()
	{
		return vertices;
	}
	public Vertex getVertex(int id)
	{
		for(Vertex v : vertices)
		{
			if(v.getID() == id)
			{
				return v; 
			}
		}
		return null;
	}
	public Edge getEdge(int arg0, int arg1)
	{
		Edge e;
		for(Vertex v : vertices)
		{
			for(int i = 0; i < v.getEdges().size(); i++)
			{
				e = (Edge) v.getEdges().get(i);
				if(e.checkVertices(arg0, arg1))
					return e;
			}	
		}
		return null;
	}
	
}