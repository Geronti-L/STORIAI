package org.example;

//import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import com.google.gson.Gson;
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
        Person person=new Person("gero",40);
        String json=gson.toJson(person);
        System.out.println(json);
        Person person1=gson.fromJson(json,Person.class);
        System.out.println(person1.name);
    }


}