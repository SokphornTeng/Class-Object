package com.class_object.classObject;

public class App 
{
    public static void main( String[] args )
    {
      parents ObjParent = new parents("Sokphorn", "Female&Male", 56, "Work in Bank", "Backend Dev");
      ObjParent.takeCare();
      ObjParent.experience();
      
      dougter ObjDougter = new dougter("I Love Doll", "Vila", 5, "Female", "Study", "Improve", 12);
      ObjDougter.takeCare();
      ObjDougter.experience();
      
      son ObjSon = new son("I Love my Toy", 1,"Jason", "Male", 3, "still drink milk", "Study");
      ObjSon.takeCare();
      ObjSon.experience();
     
      System.out.println(ObjParent.name + " " + ObjParent.age + " " + ObjParent.gender + " " + ObjParent.knowledge + " " + ObjParent.work);
      System.out.println( ObjParent.takeCare() + " and " + ObjParent.experience());
      System.out.println("=========Parents========");
      System.out.println(ObjDougter.name + " " + ObjDougter.age + " " + ObjDougter.gender + " " + ObjDougter.knowledge + " " + ObjDougter.work + " " +    " " + ObjDougter.takeCare() + " " + ObjDougter.experience());
      System.out.println("=========Children=========");
      System.out.println(ObjSon.name + " " + ObjSon.age + " " + ObjSon.gender + " " + ObjSon.knowledge + " " + ObjSon.work + " " + ObjSon.takeCare() + " " + ObjSon.experience());
    }
}
