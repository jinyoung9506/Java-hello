import java.util.*;

public class TreeSetTestMain {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<Integer> tree = new TreeSet<Integer>();
		tree.add(3); 
		tree.add(1);
		tree.add(2);
		tree.add(4);
		tree.add(6);
		tree.add(8);
		tree.add(5);
		System.out.println("인스턴스 수: " + tree.size());
		
		// for-each문에 의한 반복
		for(Integer n : tree)
			System.out.print(n.toString() + '\t');
		System.out.println();

		// Iterator 반복자에 의한 반복
		for(Iterator<Integer> itr = tree.iterator(); itr.hasNext(); )
			System.out.print(itr.next().toString() + '\t');
		System.out.println();
	}
}
