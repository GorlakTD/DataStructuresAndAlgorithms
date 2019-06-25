package stack;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Integer> queue = new Stack<Integer>();
		queue.push(6);
		queue.push(5);
		queue.push(8);
		System.out.println(queue.pop());
		System.out.println(queue.pop());
		System.out.println(queue.pop());
	}

}
