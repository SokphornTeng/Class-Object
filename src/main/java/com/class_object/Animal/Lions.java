package com.class_object.Animal;

public class Lions extends Animals {

//  public Lions(String name, int age, String color, String hairFace) {
//  super(name, age, color);
//  this.hairFace = hairFace;
//}

private String hairFace;

public String getHairFace() {
  return hairFace;
}

public void setHairFace(String hairFace) {
  this.hairFace = hairFace;
}

public void runFast() {
  System.out.print("Lion is run fast for cauth other for eat");
}

	
}
