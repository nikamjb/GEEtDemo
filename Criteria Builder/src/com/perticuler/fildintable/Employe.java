package com.perticuler.fildintable;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Employe {
	@Id
	private int eid;
	private String ename;
	private String eaddr;
	private String cname;
	private String salary;
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
	public String getEaddrs() {
		return eaddr;
	}
	public void setEaddrs(String eaddrs) {
		this.eaddr = eaddrs;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public String getSalary() {
		return salary;
	}
	public void setSalary(String salary) {
		this.salary = salary;
	}
	

}
