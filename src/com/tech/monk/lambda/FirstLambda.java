package com.tech.monk.lambda;

import java.io.File;
import java.io.FileFilter;

public class FirstLambda {

	public static void main(String[] args) 
	{
		//Before java8 , Using anonymous class
		FileFilter filter = new FileFilter()
		{

			@Override
			public boolean accept(File pathname) {
				return pathname.getName().endsWith(".java");
			}
			
		};
		//Java 8 Lambda implementation 
		FileFilter filterlmd = (File pathname) -> pathname.getName().endsWith(".java");
		File dir = new File("F:/mywork/github/java8/src/com/tech/monk/lambda");
		
		//Replace filter with filterlmd to implement lambda
		File[] files = dir.listFiles(filterlmd);
		for(File file:files)
		{
			System.out.println(file);
		}
	}

}
