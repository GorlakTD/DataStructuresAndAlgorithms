package graph;

@SuppressWarnings("rawtypes")
public class Edge<T extends Comparable> {
	Vertex[] vertices = new Vertex[2];
	T value;
	public Edge(Vertex<T> arg0, Vertex<T> arg1, T val)
	{
		vertices[0] = arg0;
		vertices[1] = arg1;
		value	= val;
	}
	public T getValue()
	{
		return value;
	}
	public Vertex[] getVertices()
	{
		return vertices;
	}
	public Vertex getVertex(int id)
	{
		if(vertices[0].getID() == id)
			return vertices[1];
		if(vertices[1].getID() == id)
			return vertices[0];
		return null;
	}
	public boolean checkVertices(int id1, int id2)
	{
		if (vertices[0].getID() == id1 && vertices[1].getID() == id2 || vertices[0].getID() == id2 && vertices[1].getID() == id1)
		{
			return true;
		}
		return false;
		
	}
	public void setValue(T arg0)
	{
		this.value = arg0;
	}
}
