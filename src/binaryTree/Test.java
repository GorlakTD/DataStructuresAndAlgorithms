package binaryTree;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tree<Integer> tr = new Tree<Integer>();
		for(int i = 0; i < 10; i++)
		{
			tr.add(i);
			tr.add((int) (Math.random()*10) - 20);
		}
		//tr.add(3);
		//tr.add(13);
		//tr.add(-33);
		tr.remove(3);
	}

}
