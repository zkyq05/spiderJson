package com.zkyq.spiderJson.modle;

import org.hibernate.validator.constraints.UniqueElements;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.UniqueConstraint;

@Entity
public class Zhilian {
    @Id
    @GeneratedValue
    private long id;
    private String cityName;
    private String companyName;
    private String jobName;
    private String salary;
    private String emplType;
    private String createDate;
    private String getTime;
    @GeneratedValue
    private String positionURL;
    private String companyURL;
    private String detail_position;
    private String detail_company;
    private String detail_salary;

    public String getDetail_position() {
        return detail_position;
    }

    public void setDetail_position(String detail_position) {
        this.detail_position = detail_position;
    }

    public String getDetail_company() {
        return detail_company;
    }

    public void setDetail_company(String detail_company) {
        this.detail_company = detail_company;
    }

    public String getDetail_salary() {
        return detail_salary;
    }

    public void setDetail_salary(String detail_salary) {
        this.detail_salary = detail_salary;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getJobName() {
        return jobName;
    }

    public void setJobName(String jobName) {
        this.jobName = jobName;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    public String getEmplType() {
        return emplType;
    }

    public void setEmplType(String emplType) {
        this.emplType = emplType;
    }

    public String getCreateDate() {
        return createDate;
    }

    public void setCreateDate(String createDate) {
        this.createDate = createDate;
    }

    public String getGetTime() {
        return getTime;
    }

    public void setGetTime(String getTime) {
        this.getTime = getTime;
    }

    public String getPositionURL() {
        return positionURL;
    }

    public void setPositionURL(String positionURL) {
        this.positionURL = positionURL;
    }

    public String getCompanyURL() {
        return companyURL;
    }

    public void setCompanyURL(String companyURL) {
        this.companyURL = companyURL;
    }
}
