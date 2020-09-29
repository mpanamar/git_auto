package com.automation.mpanamar.students;

public class PersonalInfo {


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public StudentBirth getStudentBirth() {
        return studentBirth;
    }

    public void setStudentBirth(StudentBirth studentBirth) {
        this.studentBirth = studentBirth;
    }

    public PersonalInfo(String name, String surname, String middleName, String address, String phoneNumber, StudentBirth studentBirth) {
        this.name = name;
        this.surname = surname;
        this.middleName = middleName;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.studentBirth = studentBirth;
    }

    @Override
    public String toString() {
        return "PersonalInfo{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", middleName='" + middleName + '\'' +
                ", address='" + address + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", studentBirth=" + studentBirth +
                '}';
    }

    private String name;
    private String surname;
    private String middleName;
    private String address;
    private String phoneNumber;
    private StudentBirth studentBirth;

}
