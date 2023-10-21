package com.class_object.classObject;

public class son extends parents {
    String playToy;
    int grade;
   
    son(String playToy, int grade, String name, String gender, int age, String work, String knowledge){
    	super(name, gender, age, work, knowledge);
    	this.playToy = playToy;
    	this.grade = grade;
    }

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}
	
	public String getPlayToy() {
		return playToy;
	}
	public void setPlayToy(String playToy) {
		this.playToy = playToy;
	}

	@Override
	public String takeCare() {
		
		return "I like to play my toys somuch";
	}

	@Override
	public String experience() {
		
		return "I'm still drinking milk";
	}
    
	
}
