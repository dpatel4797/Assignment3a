package secondlargest.java;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections; 
import java.io.IOException;

public class SecondLargest {
	public static void main(String[] args) throws IOException {
		// /Users/deepanpatel/Desktop/Sample
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a filename: "); 
		String filename = sc.nextLine(); 
		
		FileReader fr = new FileReader(filename);
		BufferedReader br = new BufferedReader(fr);
		
		String line;
		ArrayList<Integer> values = new ArrayList<>();
		while ((line = br.readLine())!=null) {
			values.add(Integer.parseInt(line));
			
		}
		
		boolean flag = false;
		int first = 0;
		int second = 0;
		int index =0;
		for(int i =0; i < values.size(); i++) {
			int currValue = values.get(i);
			index = i;
			if (first < currValue) {
			second = first;
			first = currValue;
			} else if (second < currValue) {
				second = currValue;
			}
			index++;
		}
		System.out.println(" The second largest value is " + second + " at index " + index);
		
			}
		}