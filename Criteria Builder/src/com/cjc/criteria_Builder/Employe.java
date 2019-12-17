package com.cjc.criteria_Builder;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Employe {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
private int eid;
private String ename;
private String eaddr;
private String companyName;
private double salary;
public int getEid() {
	return eid;
}
public void setEid(int eid) {
	this.eid = eid;
}
public String getEname() {
	return ename;
}
public void setEname(String ename) {
	this.ename = ename;
}
public String getEaddr() {
	return eaddr;
}
public void setEaddr(String eaddr) {
	this.eaddr = eaddr;
}
public String getCompanyName() {
	return companyName;
}
public void setCompanyName(String companyName) {
	this.companyName = companyName;
}
public double getSalary() {
	return salary;
}
public void setSalary(double salary) {
	this.salary = salary;
}
}
