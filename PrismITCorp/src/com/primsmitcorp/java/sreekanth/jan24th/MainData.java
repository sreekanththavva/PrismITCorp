package com.primsmitcorp.java.sreekanth.jan24th;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class MainData {

	public static void main(String[] args) throws IOException {
		String input = FileWriter.readTextFile("//Users//sreekanthreddy//git//PrismITCorp//PrismITCorp//Sample.txt");
		System.out.println(input);
		FileWriter.writeToTextFile("Sample.txt", input);

		System.out.println(FileWriter.readTextFile("Sample.txt"));

		FileWriter.readTextFileByLines("Sample.txt");
		Path path = Paths.get("Sample.txt");
	}
}