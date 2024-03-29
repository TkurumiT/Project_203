/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.jobsearchassistanceprogram;

import java.io.Serializable;

/**
 *
 * @author pc
 */
public class Application extends JobSeeker implements Serializable{
    
    private String company;
    private String career;
    private String status;

    public Application(String company, String career, String status, String name, int phone, String yearOfBirth, String schoolStage, String qualification) {
        super(name, phone, yearOfBirth, schoolStage, qualification);
        this.company = company;
        this.career = career;
        this.status = status;
    }

    public Application(String company, String career,String status) {
        this.company = company;
        this.career = career;
        this.status = status;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getCareer() {
        return career;
    }

    public void setCareer(String career) {
        this.career = career;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    

    

    
}
