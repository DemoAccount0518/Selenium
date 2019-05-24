package DDT;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CSV {
public static List<String[]> get(String filename){
	List<String[]> data = new ArrayList<String[]>();
	String dataRow;
	try {
		BufferedReader br = new BufferedReader(new FileReader(filename));
		try {
			while( (dataRow =br.readLine())!= null) {
				String[] line = dataRow.split(",");
				data.add(line);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return data;
}
}
