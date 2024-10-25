package com.coderscampus.main;

import java.io.IOException;

public class SuspectApplication {
public static void main (String []args) throws IOException {
	SuspectFileService service= new SuspectFileService();
	
	String [] filePaths={"InterpolWatchReport-Week1.csv","InterpolWatchReport-Week2.csv","InterpolWatchReport-Week2.csv"};
	
	for(String paths:filePaths) {
		
		service.readFile(paths);
		System.out.println("-------");
	}
}
}
