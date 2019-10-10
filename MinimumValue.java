package minfinder.java;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.IOException;

public class MinimumValue {
	
	public static void main(String[] args) {
		// /Users/deepanpatel/Desktop/Sample
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please enter filename: "); 
		String filename = sc.nextLine();
		sc.close(); 
		
		
		BufferedReader reader;
		try {
			reader = new BufferedReader(new FileReader(filename)); 
			String line;
			ArrayList<Integer> arrayList = new ArrayList<>(); 
			
			while((line=reader.readLine())!=null) {
				arrayList.add(Integer.parseInt(line)); 
			}
			reader.close(); 
			int lastIndex;
			int minIndex = -1;
			System.out.println("Looking for minimum..."); 
			
			int min = Integer.MAX_VALUE; 
			for (int i = 0; i < arrayList.size(); i ++) {
				min = Integer.min(min, arrayList.get(i)); 
				minIndex = i;
				
			}
			System.out.println(min);
			System.exit(0);

		}
		catch(Exception e) {
			System.out.println(e); 
		}
		
		
		
	}

}
