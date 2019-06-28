package graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.NoSuchElementException;
import java.util.Stack;

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
	public String BFSearch(T obj) //visits all the children
	{
		Stack<Integer> st = new Stack();
		for(int i = 0; i < vertices.size(); i++)
		{
			st.push(i);
		}
		st.push(retrieveBF((vertices.get(0)), st));
		return st.toString();
	}
	//retrieve in a breadly manner
	public Integer retrieveBF(Vertex vert, Stack<Integer> st)
	{
		for(int k = 0; k < vertices.size(); k++)
		{
			/*for(int j = 0; j < vertices.get(k).getEdges().size(); j++)
				{
					if (!vert.get.isTraversed())
					{
						break;
					}
				}*/
			//else if(this.getEdge(i, k) != null && vertices.get(i).getEdge(k).isTraversed() == false);
			//{
			/*else */
			if(vert.getEdge(k) != null && vert.getEdge(k).isTraversed() == false)
			{				
				vert.getEdge(k).setTraversed();
				st.push(retrieveBF(vert.getEdge(k).getVertex(vert.getID()),st));
				//return st.push(retrieveBF(vert.getEdge(k).getVertex(vert.getID()),st));
			}
				return st.push(retrieveBF(vert,st));
		}
		return st.pop();
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