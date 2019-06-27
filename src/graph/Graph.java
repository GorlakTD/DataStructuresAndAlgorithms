package graph;

import java.util.ArrayList;
import java.util.LinkedList;

public class Graph<T extends Comparable<T>> {
	private LinkedList<Vertex> vertices = new LinkedList<Vertex>();
	public Graph(Vertex v)
	{
		vertices.add(v);
	}
	public void addVertex(T obj)
	{
		Vertex vert = new Vertex(obj, vertices.size());
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
	public LinkedList<Vertex> getVertices()
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
	//bread first search
	public void BFSearch(T obj) //visits all the children
	{
		retrieveBF(obj, (Edge)(vertices.getFirst().getEdges().getFirst()));
	}
	//retrieve in a breadly manner
	public int retrieveBF(T target, Edge e)
	{
		try {
			retrieveBF(target, ((Edge)(vertices.getFirst().getEdges().pop())));
		}
		catch(NullPointerException N)
		{
			System.out.println("matt is dummy thicc");
		}
		finally
		{
			if(vertices.getFirst().getValue().equals(target))
			{
				return vertices.getFirst().getID();
			}
		}
		return -1;
		
	}
	//depth first search
	public void DFSearch() //goes to the end of the path
	{
		
	}
	//retrieve in a depthly manner
	public void retrieveDF(Vertex vert, boolean[] visited)
	{
	}
}