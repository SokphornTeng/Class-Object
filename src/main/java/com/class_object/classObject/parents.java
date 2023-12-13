package com.class_object.classObject;

public class parents {
    String name;
    String gender;
    int age;
    String work;
    String knowledge;
    
    parents(String name, String gender, int age, String work, String knowledge){
    	this.name = name;
    	this.gender = gender;
    	this.age = age;
    	this.work = work;
    	this.knowledge = knowledge;
    }

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getWork() {
		return work;
	}

	public void setWork(String work) {
		this.work = work;
	}

	public String getKnowledge() {
		return knowledge;
	}

	public void setKnowledge(String knowledge) {
		this.knowledge = knowledge;
	}
    
	public String  takeCare() {
		return "I love my children";
	}
	
	public String experience() {
		return "I have alot of experience from working and keep to share to my children";
	}
	
}
