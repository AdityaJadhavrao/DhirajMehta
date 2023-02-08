package com.qa.Multiplicationtable;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadMultiplicationtable {
	
	public static void main (String args[]) throws IOException
	{
		File src = new File("/home/excellarate/eclipse-workspace/ExcellarateProject/src/main/java/com/qa/Multiplicationtable/MuitiplicationTable.txt");
		FileReader file = new FileReader(src);
		BufferedReader br = new BufferedReader(file);
		for(int i=1;i<=10;i++)
		{
			System.out.println(br.readLine());
		}
		br.close();
		
		
	}

}
