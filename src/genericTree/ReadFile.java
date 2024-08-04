package genericTree;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFile {
	public static int[] readfile(String fileName) throws FileNotFoundException {
		String initailPath = "C:\\Users\\Hemant Ranjan\\Desktop\\JSP\\Algo-University\\LLD Notes\\SnakeAndLadder\\DSA\\src\\genericTree\\"+fileName;
		File directory = new File(initailPath);
		Scanner scn = new Scanner(directory);
		
	    int n = Integer.parseInt(scn.nextLine());
	    String str = scn.nextLine();
	    String[] values = str.split(" ");
	    int[] arr = new int[n]; 
	    for(int i = 0;i<n;i++)arr[i] = Integer.parseInt(values[i]);
	    scn.close();
	    return arr;
	}
}
