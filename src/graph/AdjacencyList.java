package graph;

import java.util.ArrayList;

public class AdjacencyList {
	public static ArrayList<String> GenerateList(ArrayList<Vertex> vertices)
	{
		ArrayList<String> list= new ArrayList<String>();
		for(int i = 0; i < vertices.size(); i++)
		{
			for(int k = i + 1; k < vertices.size(); k++)
			{		
				try
				{
					if(vertices.get(i).getEdge(k).checkVertices(i, k))
						list.add(vertices.get(i).getID() + ", " + vertices.get(k).getID());
				}
				catch(NullPointerException e)
				{
					
				}
			}
		}
		return list;
	}
	public static void PrintList(ArrayList<String> vertices)
	{
		for (int i = 0; i < vertices.size(); i++)
		{
			System.out.println("{" + vertices.get(i)+ "}");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vertex v = new Vertex(0,0);
		Graph g  = new Graph (v);
		g.addVertex(v,0,'c');
		g.addVertex(v,0,'a');
		g.addVertex(v,0,'o');
		g.addVertex(v,0,"*");
		g.addVertex(v,0,1);
		g.connectVertex(1,3,1);
		g.connectVertex(5,2,3);
		g.connectVertex(3,4,'l');

		PrintList(GenerateList(g.getVertices()));
	}

}
