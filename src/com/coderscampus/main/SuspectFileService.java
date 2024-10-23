package com.coderscampus.main;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

public class SuspectFileService {
ArrayList firstFile= new ArrayList();
String[] firstFile1= new String[24];
	public void readFile(String fileName) {
		int z=0;
	try {
		BufferedReader reader= new BufferedReader(new FileReader("src/InterpolWatchReport-Week1.csv"));
		
		String lines= "";
		while((lines=reader.readLine()) !=null) {
		System.out.println(lines);	
		firstFile1=	lines.split(",");
		System.out.println(Arrays.toString(firstFile1));
		}
	SuspectLocation suspect= new SuspectLocation(firstFile1[1], firstFile1[0]);
	
	for(int i=0; i<firstFile1.length;i++) {
	firstFile.add(suspect);
	
	}
	
	for (int q=0; q<firstFile.size(); q++) {
	System.out.println(firstFile.get(q));
	}
	;
	
	
	
		
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		System.out.println("File not found");
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	}

	public void readFile2(String fileName2) throws IOException {
		BufferedReader reader2= null;
		try {
			reader2 = new BufferedReader(new FileReader("src/InterpolWatchReport-Week2.csv"));
			String lines="";
			while((lines=reader2.readLine())!=null){
				System.out.println(lines);}
			
			
			
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			reader2.close();
		}
		
	}
	
	public void readFile3(String fileName3) throws IOException {
		BufferedReader reader3= null;
		try {
			 reader3= new BufferedReader(new FileReader("src/InterpolWatchReport-Week3.csv"));
			 String lines="";
			 while((lines=reader3.readLine())!=null) {
				System.out.println(lines); 
			 }
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			reader3.close();
	}
	}
}
