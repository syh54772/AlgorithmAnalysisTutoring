import java.util.Iterator;
import java.util.List;

public class ListPrinter<T> {
	
	public void printByIndexedFor(List<T> list) {
		System.out.println("Print By Indexed For: ");
		for(int i = 0; i < list.size(); i ++) {
			System.out.print(list.get(i)+" ");
		}
		System.out.println();
	}
	
	public void printByIterator(List<T> list) {
		System.out.println("Print By Iterator: ");
		Iterator<T> iter = list.iterator();
		while(iter.hasNext()) {
			System.out.print(iter.next()+" ");
		}
		System.out.println();
	}
	
	public void printByEnhancedFor(List<T> list) {
		System.out.println("Print By Enhanced For: ");
		for(T t : list) {
			System.out.print(t+" ");
		}
		System.out.println();
	}
}
