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
public class RecruitmentInformation extends Businesses implements Serializable{
    private int salary;
    private String jobInformation;
    private String jobBenefits;
    private String careers;

    public RecruitmentInformation(int salary, String jobInformation, String jobBenefits, String careers) {
        this.salary = salary;
        this.jobInformation = jobInformation;
        this.jobBenefits = jobBenefits;
        this.careers = careers;
    }

    public RecruitmentInformation(int salary, String jobInformation, String jobBenefits, String careers, String address, int phone, String email, String name) {
        super(address, phone, email, name);
        this.salary = salary;
        this.jobInformation = jobInformation;
        this.jobBenefits = jobBenefits;
        this.careers = careers;
    }

    public String getCareers() {
        return careers;
    }

    public void setCareers(String careers) {
        this.careers = careers;
    }
    
    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getJobInformation() {
        return jobInformation;
    }

    public void setJobInformation(String jobInformation) {
        this.jobInformation = jobInformation;
    }

    public String getJobBenefits() {
        return jobBenefits;
    }

    public void setJobBenefits(String jobBenefits) {
        this.jobBenefits = jobBenefits;
    }
}
