package com.home.jooq.connection;

import org.jooq.codegen.GenerationTool;
import java.nio.file.Files;
import java.nio.file.Path;
 

public class CreateEntities {

	public CreateEntities() {
		try {
			GenerationTool.generate(
					  Files.readString(Path.of("/Users/guyfeigenblat/eclipse-workspace/basic-hibernate-example-master/src/main/resources/jooq-config.xml"))    
					);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Here");
	}
	
	public static void main(String[] args) {
		
		//CreateEntities c = new CreateEntities();
		
		Class<?> clazz;
		try {
			clazz = Class.forName("com.home.jooq.entity.tables.Article");
			System.out.println(clazz);
			System.out.println(clazz.getFields());
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
