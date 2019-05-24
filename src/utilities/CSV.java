package utilities;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CSV {
	// This method will read a CSV file and return a List of String[]
	public static List<String[]> get(String filename) {
		List<String[]> data = new ArrayList<String[]>();
		String testRow;
		BufferedReader br = null;
		try {
			// Open and read the file
			br = new BufferedReader(new FileReader(filename));
			// Read data as long as it's not empty
			// Parse the data by comma using .split() method
			// Place into a temporary array, then add to List 
			while ((testRow = br.readLine()) != null) {
				String[] line = testRow.split(","); //Test,10,1 [0]=Test, [1]=10, [2]=1
				data.add(line);
			}
		} catch (FileNotFoundException e) {
			System.out.println("ERROR: File not found " + e.getMessage());
		} catch (IOException e) {
			System.out.println("ERROR: IOException" + e.getMessage());
		} finally {
				try {
					br.close();
				} catch (IOException e) {
					System.out.println("IOException: " + e.getMessage());
				}
		}
		return data;
	}
}
