package reversesearch.java;

import java.util.ArrayList;
import java.io.FileNotFoundException;
import java.io.BufferedReader;
import java.io.FileReader; 
import java.util.Scanner; 
import java.io.IOException;

public class ReverseSearch {

public static void main(String[] args) throws IOException {
		
	// /Users/deepanpatel/Desktop/Sample

	
		Scanner sc = new Scanner(System.in);
		String filename = sc.nextLine();
		int K = Integer.parseInt(sc.nextLine());

		
		FileReader fr = new FileReader(filename);
		BufferedReader br = new BufferedReader(fr);

		String line;
		
		ArrayList<Integer> values = new ArrayList<>();
		while ((line = br.readLine()) != null) {
			values.add(Integer.parseInt(line));
		}
		
		boolean flag = false;
		for (int i = 0; i < values.size(); i++) {
			int currValue = values.get(i);
			if (currValue == K) {
				flag = true;
				System.out.println("Index = " + i + " " + K);
			} else {
				
			}
		}
		if (! flag) { // flag == false
			System.out.println(-1);
		}
		
	}

}

