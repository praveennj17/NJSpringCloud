package com.example.springbootapplication;

import java.io.IOException;

public class JavaMain {

	public static void main(String[] args) throws IOException {

		String path = "C:\\Spring\\SpringTest\\Test";
		for(int i=0;i<10;i++) {
		Runtime.getRuntime().exec("notepad.exe " + path);
		}

	}

}
