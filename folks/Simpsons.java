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
public class Simpsons {
    private String name;
    private long age;
    private long salary;
    private long iq;

    public Simpsons(String name, long age, long salary, long iq) {
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.iq = iq;
    }

    @Override
    public String toString() {
        return "Simpsons{" + "name=" + getName() 
                + ", age=" + getAge() 
                + ", salary=" + getSalary() 
                + ", iq=" + getIq() + '}';
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
    public long getAge() {
        return age;
    }

    /**
     * @param age the age to set
     */
    public void setAge(long age) {
        this.age = age;
    }

    /**
     * @return the salary
     */
    public long getSalary() {
        return salary;
    }

    /**
     * @param salary the salary to set
     */
    public void setSalary(long salary) {
        this.salary = salary;
    }

    /**
     * @return the iq
     */
    public long getIq() {
        return iq;
    }

    /**
     * @param iq the iq to set
     */
    public void setIq(long iq) {
        this.iq = iq;
    }
    
    
}
