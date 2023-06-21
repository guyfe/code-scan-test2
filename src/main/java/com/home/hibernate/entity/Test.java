package com.home.hibernate.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "database_functions")
public class Test{
	 
    @Id
    private String name;
 
    private String params;
    
	public Test(String name, String params) {
		this.name = name;
		this.params = params;
	}
	
	public Test(String name) {
		this.name = name;
	}

 
    public String getName() {
        return name;
    }
 
    public String[] getParams() {
        return params.split(",");
    }
}


