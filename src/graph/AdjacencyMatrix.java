package graph;

import java.util.ArrayList;


public class AdjacencyMatrix {
	public static void GenerateMatrix(Graph g)
	{
		ArrayList<Vertex> vertices = g.getVertices();
		System.out.print("  ");
		for(Vertex v : vertices)
		{
			System.out.print(v.getID() + " ");
		}
		System.out.println();
		for(Vertex v : vertices)
		{
			System.out.print(v.getID() + " ");

			for(int i = 0; i < vertices.size()- 1; i++)
			{
				if(v.getID() == i)
					System.out.print("0 ");
				try {
					System.out.print(((Edge)(v.getEdges().get(i))).getValue() + " " );
				}
				catch(IndexOutOfBoundsException E)
				{
					System.out.print("0 ");
				}
			}
			System.out.println();
		}
		System.out.println();
	}
	
	public static void main(String args[])
	{
		Vertex v = new Vertex(0,0);
		Graph g  = new Graph (v);
		g.addVertex(v,0,'c');
		g.addVertex(v,0,'a');
		g.addVertex(v,0,'o');
		g.addVertex(v,0,"*");
		g.addVertex(v,0,1);
		g.connectVertex(1,3,1);
		g.connectVertex(5,2,3);
		GenerateMatrix(g);
	}
}
