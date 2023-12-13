package com.class_object.Animal;

public class Execute {

	public static void main(String[] args) {
	    
		
	    System.out.print("assign value direct to attribute");
	    Animals animal = new Animals();
	    animal.name = "Birds";
	    animal.age = 1;
	    animal.color = "blue";
	    animal.eat();
	    System.out.print("\n");
	    animal.sleep();
	    System.out.print("\n");
	    animal.living();
	    System.out.print(animal.name + animal.age + animal.color);

	    
	    
	    System.out.print("assign value by constructor to attribute");
	    Animals animal1 = new Animals("kiki", 2, "black");
	    System.out.print("\n");
	    animal1.sleep();
	    System.out.print("\n");
	    animal1.living();
	    System.out.print(animal1.name + animal1.age + animal1.color);
	    
	    
	    
	    System.out.print("assign value and get value with setter and getter");
	    Animals animal2 = new Animals();
	    animal2.setName("Lolo");
	    animal2.setAge(2);
	    animal2.setColor("blue");
	    System.out.print(animal2.getName() + animal2.getAge() + animal2.getColor());
	    
	    
	    
	    Elephants elephant_1 = new Elephants();
	    elephant_1.setName("Vira");
	    elephant_1.setAge(10);
	    elephant_1.setColor("brown");
	    elephant_1.setSizeBig("elephant is bigger");
	    elephant_1.setLongNose("elephant has long nose");
	    elephant_1.strong();
	    elephant_1.eat();
	    elephant_1.sleep();
	    elephant_1.living();
	    System.out.print(elephant_1.getAge() + elephant_1.getColor() + elephant_1.getName() + elephant_1.getLongNose());
	    
	    
	    
	    Elephants elephant_2 = new Elephants();
	    elephant_2.setName("Sokphorn");
	    elephant_2.setAge(10);
	    elephant_2.setColor("Pink");
	    elephant_2.setSizeBig("elephant is bigger");
	    elephant_2.setLongNose("elephant has long nose");
	    elephant_2.strong();
	    elephant_2.eat();
	    elephant_2.sleep();
	    elephant_2.living();
	    System.out.print(elephant_2.getAge() + elephant_2.getColor() + elephant_2.getName() + elephant_2.getLongNose());
  
	    
	    
	    Elephants elephant_3 = new Elephants();
	    elephant_3.setName("Siya");
	    elephant_3.setAge(10);
	    elephant_3.setColor("Pink");
	    elephant_3.setSizeBig("elephant is bigger");
	    elephant_3.setLongNose("elephant has long nose");
	    elephant_3.strong();
	    elephant_3.eat();
	    elephant_3.sleep();
	    elephant_3.living();
	    System.out.print(elephant_3.getAge() + elephant_3.getColor() + elephant_3.getName() + elephant_3.getLongNose());
	    
	    
	    
	    Lions lion_1 = new Lions();
	    lion_1.setName("Hiry");
	    lion_1.setAge(10);
	    lion_1.setColor("Pink");
	    lion_1.setHairFace("hair is long");
	    lion_1.runFast();
	    lion_1.eat();
	    lion_1.sleep();
	    lion_1.living();
	    System.out.print(lion_1.getAge() + lion_1.getColor() + lion_1.getName() + lion_1.getHairFace());
	    
	    
	    
	    Lions lion_2= new Lions();
	    lion_2.setName("Sophea");
	    lion_2.setAge(15);
	    lion_2.setColor("Pink");
	    lion_2.setHairFace("hair is long");
	    lion_2.runFast();
	    lion_2.eat();
	    lion_2.sleep();
	    lion_2.living();
	    System.out.print(lion_2.getAge() + "\n" + lion_2.getColor() +"\n"  + lion_2.getName() +"\n"  + lion_2.getHairFace());
	    
	    
	  }
	
}
