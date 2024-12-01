import java.io.*;
import java.util.*;

class Day1 {
	public static void main(String[] args) {
		int totalDistance = 0;
		ArrayList<Integer> list1 = new ArrayList<Integer>();
		ArrayList<Integer> list2 = new ArrayList<Integer>();
		
		try {
			File myObj = new File("input.txt");
			Scanner myReader = new Scanner(myObj);
			while (myReader.hasNextLine()) {
				String data = myReader.nextLine();
				String[] values = data.split("\\s+");
				list1.add(Integer.valueOf(values[0]));
				list2.add(Integer.valueOf(values[1]));
				
			}
			myReader.close();
			
			Collections.sort(list1);
			Collections.sort(list2);
						
			for (int i = 0; i < list1.size(); i++) {
				int distanceBetween = Math.abs(list1.get(i) - list2.get(i));
				totalDistance += distanceBetween;
			}
						
		} catch (FileNotFoundException e) {
			System.out.println("An error occurred.");
			e.printStackTrace();
		}
		
		System.out.println(totalDistance);
	}
}