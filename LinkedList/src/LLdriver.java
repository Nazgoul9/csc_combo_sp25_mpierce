
public class LLdriver {

	public static void main(String[] args) {
		
		LinkedList list = new LinkedList();
		
		list.insert(52);
		list.insert(26);
		list.insert(13);
		list.show();
		list.inserAtStart(6);
		list.show();
		list.insertAt(2, 10);
		list.show();
		list.deleteAt(3);
		list.show();
		
	}

}
