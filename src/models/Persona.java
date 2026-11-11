package models;

public class Persona {
    private String name;
    private int age;
    private char gender;

    //Constructor
    public Persona(String name, int age, char gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    //Setters & Getters
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
    public char getGender() {
        return gender;
    }
    public void setGender(char gender) {
        this.gender = gender;
    }
    public int compareTo(Persona o){
        
    }

    @Override
    public String toString() {
        return "Persona de nombre = " + name + ", con edad = " + age + ", y genero = " + gender + "";
    }
    

    

}