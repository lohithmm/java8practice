package com.exilant.day2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileOperation {
	
	public static void main(String[] args) {
		//writeTofile1();
		readfile();
	}
	
	static void writeTofile1() {
		
		try(BufferedWriter bw=new BufferedWriter(new FileWriter("temp2.txt"));){
			bw.write("Hellow dvsdsfsd");
			bw.newLine();
			bw.write("Hellow cxvdcfgdfgdsgdfgdgd fgdfgfdgdgdfg");
			System.out.println("Data saved succesfully.........");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	static void readfile() {
		try(BufferedReader br=new BufferedReader(new FileReader("temp2.txt"))){
			//String str=null;
			//while((str=br.readLine())!=null) System.out.println(str);
			br.lines().forEach(System.out::println);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
static void writeTofile() {
	// erlier to 1.8
	BufferedWriter bw=null;
	try {
		bw=new BufferedWriter(new FileWriter("/Users/lohith.m/Desktop/temp2.txt"));
		bw.write("Hellow  dfghdgdffd");
		bw.newLine();
		bw.write("Hellow cxvdcfgdfgdsgdfgdgd fgdfgfdgdgdfg");
		System.out.println("Data saved succesfully.........");
	}
	catch (Exception e) {
		// TODO: handle exception
		e.printStackTrace();
	}finally {
		try {
		bw.close();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
}
