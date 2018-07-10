package com.exilant.day2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileStream {
	public static void main(String[] args) throws IOException {
		Files.list(Paths.get("."))
		.map(Path::getFileName)
		.map(Path::toString)
		.filter(name->name.endsWith(".txt"))
		.filter(name->{          //display file name containing exilant word
			
			try(BufferedReader br=new BufferedReader(new FileReader(name))){
				String str=null;
				while((str=br.readLine())!=null) {
					//System.out.println(str);
					if(str.equalsIgnoreCase("exilant")) {
						return true;
					}
				}
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
				return false;
		})
		//.map(String::toUpperCase)
		//.filter(name->name.endsWith(".TXT"))
		//.sorted()
		//.limit(5)
	    //.skip(2)
	    .forEach(System.out::println);
	}
}
