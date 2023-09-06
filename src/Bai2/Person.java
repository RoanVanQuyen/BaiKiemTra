package Bai2;

import java.util.Scanner;

public class Person {
    private String name ;
    private int age ;
    private String gender ;

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

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Person(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }
    public Person(){

    }
    Scanner Ip = new Scanner(System.in) ;
    public void  Input(){
        name = Ip.nextLine() ;
        age = Ip.nextInt() ;
        Ip.nextLine() ;
        gender = Ip.nextLine() ;
    }
    public void Out(){
        System.out.println("name = " + name);
        System.out.println("age = " + age);
        System.out.println("gender = " + gender);
    }
}
