package com.java7;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/** Java 7 Features
 *
 */
public class Features {

	public static void main(String []args) {
		
		//Binary literals
		
		int binary = 0b0101;
		System.out.println(binary == 5 ? true : false);

		//UnderScore between literals
		
		int oneMillion_ = 1_000_000;
		int oneMillion  = 1000000;
		System.out.println(oneMillion_ == oneMillion ? true : false);	
		
		//string in switch case
		
		String s = "zmr";
		switch(s) {
		case "zmr": 
			System.out.println("ZMR");
			break;
			
		case "gdp":
			System.out.println("GDP");
			break;
		
		default:
			System.out.println("Default");
		}
		
		//multi-catch exception
		
		try {
			throw new FileNotFoundException("File not found...");
		}catch(IOException | ArrayIndexOutOfBoundsException e){
			System.out.println("Exception occurred ");
		}
		
		//try with resources
		try(FileInputStream fis = new FileInputStream("D:\\temp\\results\\sample.txt")){
			int ch = 0 ;
		while((ch = fis.read()) != -1)
			System.out.print((char)ch);
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println();
		
		//Diamond operator
		List<String> list = new ArrayList<String>();

		list.add("Mustafa Zari");
		list.add("Sudhansu Pandey");
		for (String string : list) {
			System.out.println(string);
		}
				
		//Type Inference
		class Abc<T>{
			public <T> Abc(T t){
				System.out.println("Input provided :- " + t + "; Type of class :- " + t.getClass().getName() + ";");
			}
		}
		

		new Abc("Mustafa");
		new Abc(5);
		
	}
	
}
