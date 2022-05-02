package MediaWiki;

import java.util.*;

public class Employee {

    private String name;
    private int age;
    private double currentSalary;
    private List<String> skills;

    public Employee(String name, int age, double currentSalary, List<String> skills) {
        this.name = name;
        this.age = age;
        this.currentSalary = currentSalary;
        this.skills = skills;
    }

    public String getName() {
        return name;
    }

    public void setSkills(List<String> skills) {
        this.skills = skills;
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

    public double getCurrentSalary() {
        return currentSalary;
    }

    public void setCurrentSalary(double currentSalary) {
        this.currentSalary = currentSalary;
    }

    public List<String> getSkills() {
        return skills;
    }

    public void setSkills(ArrayList<String> skills) {
        this.skills = skills;
    }

}



