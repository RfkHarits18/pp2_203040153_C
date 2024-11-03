/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas03;

/**
 *
 * @author Rifqi Harits Pratama
 */
public class Employee {
    private String name;
    private String address;
    private String gender;
    private String status;
    private String division;
    private int age;
    private int salary;

    public Employee(String name, String address, String gender, String status, String division, int age, int salary) {
        this.name = name;
        this.address = address;
        this.gender = gender;
        this.status = status;
        this.division = division;
        this.age = age;
        this.salary = salary;
    }

    // Getters
    public String getName() { return name; }
    public String getAddress() { return address; }
    public String getGender() { return gender; }
    public String getStatus() { return status; }
    public String getDivision() { return division; }
    public int getAge() { return age; }
    public int getSalary() { return salary; }
}

