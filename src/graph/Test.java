package graph;

public class Test {

	public static void main(String[] args) {
	
			Vertex v = new Vertex("cat",0);
			Graph g  = new Graph (v);
			g.addVertex(v,"shuckle",'c');
			g.addVertex(v,"alpha",'a');
			g.addVertex(v,"owl",'o');
			g.addVertex(v,"test","*");
			g.addVertex(v,"thicc",1);
			g.connectVertex(1,3,1);
			g.connectVertex(5,2,3);
			g.connectVertex(3,4,'l');
			
			String str = "test";
			System.out.println(g.BFSearch(str));
			
	}

}
