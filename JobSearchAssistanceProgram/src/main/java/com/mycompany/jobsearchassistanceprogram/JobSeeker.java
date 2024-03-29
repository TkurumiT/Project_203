
package com.mycompany.jobsearchassistanceprogram;

import java.io.Serializable;

public class JobSeeker implements Serializable{
    private String name;
    private int phone;
    private String yearOfBirth;
    private String schoolStage;
    private String qualification;

    public JobSeeker(String name, int phone, String yearOfBirth, String schoolStage, String qualification) {
        this.name = name;
        this.phone = phone;
        this.yearOfBirth = yearOfBirth;
        this.schoolStage = schoolStage;
        this.qualification = qualification;
    }
    public JobSeeker(){
        
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public String getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(String yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    public String getSchoolStage() {
        return schoolStage;
    }

    public void setSchoolStage(String schoolStage) {
        this.schoolStage = schoolStage;
    }

    public String getQualification() {
        return qualification;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }
   
}
