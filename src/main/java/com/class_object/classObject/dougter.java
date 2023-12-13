package com.class_object.classObject;


public class dougter extends parents {
	
	String playDoll;
    int grade;
	
    
     dougter(String name, String gender, int age, String work, String knowledge, String playDoll, int grade) {
    	 super(name, gender, age, work, knowledge);
		this.playDoll = playDoll;
		this.grade = grade;
	}

	public String getPlayDoll() {
		return playDoll;
	}

	public void setPlayDoll( String playDoll ) {
		this.playDoll = playDoll;
	}

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

	@Override
	public String takeCare() {
		
		return "I want to take care my Doll";
	}

	@Override
	public String experience() {
		
		return "I am still study grade 5 for improving myself";
	}


     
}
