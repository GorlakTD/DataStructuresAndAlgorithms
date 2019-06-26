package graph;

import java.util.ArrayList;


public class AdjacencyMatrix {
	public static void PrintMatrix(Object[][] obj)
	{
		for(int i = 0; i < obj.length; i++)
		{
			for(int k = 0; k < obj.length; k++)
			{
				System.out.print(obj[i][k] + " ");
			}
			System.out.println();
		}
	}
	public static Object[][] GenerateMatrix(ArrayList<Vertex> vertices)
	{
		Object[][] Matrix = new Object[vertices.size()][vertices.size()];
		for(int i = 0; i < vertices.size(); i++)
		{
			
			for(int k = 0; k < vertices.size(); k++)
			{
				try
				{
					Matrix[i][k] = (vertices.get(i).getEdge(k).getValue());
				}
				catch(NullPointerException e)
				{
					Matrix[i][k] = 0;
				}
				Matrix[k][i] = Matrix[i][k];
			}	
			Matrix[i][i] = 0;
		}
		return Matrix;
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
		g.connectVertex(3,4,'l');
		
		PrintMatrix(GenerateMatrix(g.getVertices()));
	}
}
