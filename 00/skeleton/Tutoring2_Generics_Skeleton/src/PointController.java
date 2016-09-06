import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class PointController {
	
	public static void main(String[] args) {
		
		Point p1 = new Point(0f, 0f);
		Point p2 = new Point(2f, 5f);
		Point p3 = new Point(4f, 4f);
		Point p4 = new Point(7f, 9f);
		Point p5 = new Point(4f, 4f);
		
		List<Point> listOfPoints = new ArrayList<Point>();
		listOfPoints.add(p1);
		listOfPoints.add(p2);
		listOfPoints.add(p3);
		listOfPoints.add(p4);
		listOfPoints.add(p5);
		
		ListPrinter<Point> listPrinter = new ListPrinter<Point>();
		listPrinter.printByIndexedFor(listOfPoints);
		listPrinter.printByIterator(listOfPoints);
		listPrinter.printByEnhancedFor(listOfPoints);
		
		System.out.println("* * * * * * * * * *");
		
		Set<Point> setOfPoints = new HashSet<Point>(listOfPoints);
		
		IterablePrinter<Point> iterablePrinter = new IterablePrinter<Point>();
		iterablePrinter.printByIterator(setOfPoints);
		iterablePrinter.printByEnhancedFor(setOfPoints);
		
		System.out.println("* * * * * * * * * *");
		
		Map<Point, String> mapOfPointTags = new HashMap<Point, String>();
		mapOfPointTags.put(p1, "Origin");
		mapOfPointTags.put(p2, "A");
		mapOfPointTags.put(p3, "B");
		mapOfPointTags.put(p4, "C");
		mapOfPointTags.put(p5, "D");
		
		System.out.println(mapOfPointTags.get(p1));
		System.out.println(mapOfPointTags.get(new Point(2f, 5f)));
		System.out.println(mapOfPointTags.get(p3));
		
		
		System.out.println("* * * * * * * * * *");
		
		Collections.sort(listOfPoints, new Comparator<Point>(){

			@Override
			public int compare(Point arg0, Point arg1) {
				//FIXME
				return 0;
			}
			
		});
		iterablePrinter.printByEnhancedFor(listOfPoints);
		
	}
}
