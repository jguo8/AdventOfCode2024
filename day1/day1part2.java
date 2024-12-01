import java.io.*;
import java.util.*;

class Day1part2 {
	public static void main(String[] args) {
		int similarityScore = 0;
		ArrayList<Integer> list1 = new ArrayList<Integer>();		
		Map<Integer, Integer> list2 = new HashMap<>();
		
		try {
			File myObj = new File("input.txt");
			Scanner myReader = new Scanner(myObj);
			while (myReader.hasNextLine()) {
				String data = myReader.nextLine();
				String[] values = data.split("\\s+");
				list1.add(Integer.valueOf(values[0]));
				int val2 = Integer.valueOf(values[1]);
				
				if(list2.containsKey(val2)) {
					list2.put(val2, list2.get(val2) + 1);
				} else {
					list2.put(val2, 1);
				}
				
			}
			myReader.close();
						
			for (int i = 0; i < list1.size(); i++) {
				int val1 = list1.get(i);
				int freqVal1InList2 = 0;
				if(list2.containsKey(val1)) {
					freqVal1InList2 = list2.get(val1);
				}
				int score = val1 * freqVal1InList2;
				
				similarityScore += score;
			}
						
		} catch (FileNotFoundException e) {
			System.out.println("An error occurred.");
			e.printStackTrace();
		}
		
		System.out.println(similarityScore);
	}
}