package org.example;

public class Person {



    String firstname ;
    String lastname ;
    int age ;
    int kisisayisi;
    String cinsiyet;
    int oran;


    public  Person(String firstname, String lastname , int age){
        this.firstname = firstname ;
        this.lastname=lastname;
        this.age=age;
    }

    public Person(String firstname, String lastname , int age,int kisisayisi,String cinsiyet,int oran){
        this(firstname,lastname ,age);
        this.kisisayisi=kisisayisi;
        this.cinsiyet=cinsiyet;
        this.oran=oran;
    }

    public  String getFirstName(){
        return firstname ;
    }

    public String getLastName(){
        return lastname ;
    }

    public int getAge(){
        return age ;
    }

    public boolean isTeen(){
       return age >=13 && age < 19 ;
        }

    }

