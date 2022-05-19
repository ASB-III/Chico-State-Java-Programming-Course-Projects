/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package my.folks;

/**
 *
 * @author GLNN104Lab
 */
public class Folks {
    private String name;
    private int age;
    private int salary;
    private int iq;

    public Folks(String name, int age, int salary,
            int iq) {
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.iq = iq;
    }

    @Override
    public String toString() {
        return "Folks{" + "name=" + getName() + ", age=" + getAge() + ", salary=" + getSalary() + ", iq=" + getIq() + '}';
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the age
     */
    public int getAge() {
        return age;
    }

    /**
     * @param age the age to set
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * @return the salary
     */
    public int getSalary() {
        return salary;
    }

    /**
     * @param salary the salary to set
     */
    public void setSalary(int salary) {
        this.salary = salary;
    }

    /**
     * @return the iq
     */
    public int getIq() {
        return iq;
    }

    /**
     * @param iq the iq to set
     */
    public void setIq(int iq) {
        this.iq = iq;
    }
    
}
