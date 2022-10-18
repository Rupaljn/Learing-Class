package com.rakuten.learn;

public class Incapsulation {
private String name;

public String getName() {
	return name;
}

public void setName(String name) {
	if(name.length()<3){
		throw new RuntimeException("name is too short");
		
	}
	this.name = name;
}

}
