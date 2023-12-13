package com.class_object.Animal;

public class Elephants extends Animals {

//  public Elephants(String name, int age, String color, String longNose, String sizeBig) {
//  super(name, age, color);
//  this.longNose = longNose;
//  this.sizeBig = sizeBig;
//}

private String longNose;
private String sizeBig;

public String getLongNose() {
  return longNose;
}

public void setLongNose(String longNose) {
  this.longNose = longNose;
}

public String getSizeBig() {
  return sizeBig;
}

public void setSizeBig(String sizeBig) {
  this.sizeBig = sizeBig;
}

public void strong() {
  System.out.print("Element is so strong");
}
	
}
