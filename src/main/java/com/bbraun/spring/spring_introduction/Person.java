package com.bbraun.spring.spring_introduction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

//@Component("personBean")
public class Person {
    //    @Autowired
//   @Qualifier("dog")
    private Pet pet;
    @Value("${person.surname}")
    private String surname;
    @Value("${person.age}")
    private int age;

//@Autowired
//    public Person(@Qualifier("catBean") Pet pet) {                          //данный конструктор был нужен для установки атрибута pet в конструкторе
//        System.out.println("Person bean is created");
//        this.pet = pet;
//    }

    public Person(Pet pet) {                          //данный конструктор был нужен для установки атрибута pet в конструкторе
        System.out.println("Person bean is created");
        this.pet = pet;
    }


    public Person() {
        System.out.println("Person bean is created");
    }

    //    @Autowired
//    //pet -> setPet -будь внимательнее, надо называть так атрибуты и сеттры, чтобы компилятор понимал как из имени получть сеттер
    public void setPet(Pet pet) {
        System.out.println("Class Person: set pet");
        this.pet = pet;
    }

    //@Autowired //метод не обязательно должен называться setPet для инициализации аннотацией @Autowired
    public void anyMethodName(Pet pet) {
        System.out.println("Class Person: anyMethodName");
        this.pet = pet;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        System.out.println("Class Person: set surname");
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        System.out.println("Class Person: set age");
        this.age = age;
    }

    public void callYourPet() {
        System.out.println("Hello, my lovely Pet!");
        pet.say();
    }

}
