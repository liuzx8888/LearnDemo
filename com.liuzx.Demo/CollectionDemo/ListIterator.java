package CollectionDemo;
import java.util.ArrayList;

public class ListIterator {
	public static void main(String[] args) {
		ArrayList<String> sortedSet = new ArrayList<String> ();
		sortedSet.add("����");
		sortedSet.add("��");
		sortedSet.add("30");
		sortedSet.add("����");
		sortedSet.add("��");
		sortedSet.add("22");
		sortedSet.set(0, "������");
		java.util.ListIterator<String> iterator = sortedSet.listIterator();
		while(iterator.hasNext()) {
			System.out.println("��ǰ����"+iterator.next());
		}
		while(iterator.hasPrevious()) {
			System.out.println("�Ӻ���ǰ��"+iterator.previous());	
		}
		
		
	}

}
