package com.coderscampus.main;

import java.io.IOException;

public class SuspectApplication {
public static void main (String []args) throws IOException {
	SuspectFileService service= new SuspectFileService();
	service.readFile("InterpolWatchReport-Week1.csv");
	System.out.println("-------");
	service.readFile2("InterpolWatchReport-Week2.csv");
	System.out.println("-------");
	service.readFile3("InterpolWatchReport-Week2.csv");
}
}
