package com.class_object.Animal;

public class Animals {

// attribute, property
	  public String name;
	  public int age;
	  public String color;
	  

//  public Animals(String name, int age, String color) {
//	    super();
//	    this.name = name;
//	    this.age = age;
//	    this.color = color;
//  }
	  
	  
	  public String getName() {
	    return name;
	  }
	  public void setName(String name) {
	    this.name = name;
	  }
	  public int getAge() {
	    return age;
	  }
	  public void setAge(int age) {
	    this.age = age;
	  }
	  public String getColor() {
	    return color;
	  }
	  public void setColor(String color) {
	    this.color = color;
	  }


	  // method, behavior, function
	  public void eat() {
	    System.out.print("Eat for a live");
	  }
	  public void living() {
	    System.out.print("animal live in a group");
	  }
	  public void sleep() {
	    System.out.print("sleep with soud zzzzzz");
	  }
	
}
