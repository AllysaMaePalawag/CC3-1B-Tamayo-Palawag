package classesandobjects;

import java.util.Scanner;

public class ClassesAndObjects {

    public static void main(String[] args) {
    
        Dog object= new Dog();
        
        Scanner sc= new Scanner(System.in);
        
        System.out.print("Dog 1\nName:");
        String name= sc.next();
        object.setName(name);
        String name1= object.getName();
        
        System.out.print("Age:");
        int age= sc.nextInt();
        object.setAge(age);
        int age1= object.getAge();
 
        System.out.print("Breed:");
        String breed= sc.next();
        object.setBreed(breed);
        String breed1= object.getBreed();
        
        System.out.print("Gender:");
        char gender= sc.next().charAt(0);
        object.setGender(gender);
        char gender1= object.getGender();
        
        
        Dog object2= new Dog();
        
        System.out.print("\nDog 2\nName:");
        String name2= sc.next();
        object2.setName(name2);
        String name3= object2.getName();
        
        System.out.print("Age:");
        int age2= sc.nextInt();
        object2.setAge(age2);
        int age3= object2.getAge();

        System.out.print("Breed:");
        String breed2= sc.next();
        object2.setBreed(breed2);
        String breed3= object2.getBreed();
        
        System.out.print("Gender:");
        char gender2= sc.next().charAt(0);
        object2.setGender(gender2);
        char gender3= object2.getGender();
        

        System.out.print("==================================="
                + "\nDog 1"
                + "\nName:" + name1
                + "\nAge: " + age1
                + "\nBreed: " +breed1
                + "\nGender: "  + gender1
                + "\n===================================\n");
        
        System.out.print("==================================="
                + "\nDog 2"
                + "\nName: " + name3
                + "\nAge:" + age3
                + "\nBreed: " + breed3
                + "\nGender: " + gender3);
        
    }
    
    
}
