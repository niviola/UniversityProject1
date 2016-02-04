/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package universityproject1;

import java.util.UUID;

/**
 *
 * @author Viktor-VM
 */
public class Student {

    private String firstname;
    private String lastname;
    private int age;
    private UUID userid;
    private Address address;

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public UUID getUserid() {
        return userid;
    }

    public void setUserid(UUID userid) {
        this.userid = userid;
    }

    Student(String firstname, String lastname, int age) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.age = age;
        UUID userid = UUID.randomUUID();
        this.userid = userid;
    }

    @Override
    public String toString() {
        return "Student Info: " + getFirstname() + " " +
                getLastname() + " (" + getAge() + ") \n\n" + getAddress();
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
