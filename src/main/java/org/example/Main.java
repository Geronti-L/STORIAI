package org.example;

//import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import com.google.gson.Gson;

import java.util.Scanner;

class employee{
    int id;
    String name;
    float sel;
    Scanner sc=new Scanner(System.in);
public employee(Scanner s){
  this.sc=s;
}
public  void setEmpl(){
    System.out.println("enter id:-");
    id=sc.nextInt();
    System.out.println("enter name:-");
    name=sc.nextLine();
}
public void display(){
    System.out.println("id="+id);
    System.out.println("name"+name);
}
}
class Person{
    String name;
    int age;
    public Person(String name,int age){
        this.name=name;
        this.age=age;
    }
}
public class Main {

    public static void main(String[] args) {

        Gson gson=new Gson();
        Person person=new Person("geronti",40);
        String json=gson.toJson(person);
        System.out.println(json);
        Person person1=gson.fromJson(json,Person.class);
        System.out.println(person1.name);
//

    }


}