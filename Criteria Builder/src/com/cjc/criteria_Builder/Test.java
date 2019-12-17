package com.cjc.criteria_Builder;

import java.util.List;
import java.util.Scanner;

import javax.persistence.Query;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.hibernate.Session;

public class Test {
	public static void main(String[] args) {
		Session session=HibernateUtil.getSessionFactory().openSession();
		Scanner sc=new Scanner(System.in);
		for(int i=1;i<2;i++)
		{
			Employe emp1=new Employe();
		System.out.println("Enter Employey name");
		String s=sc.next();
		        emp1.setEname(s);
		        System.out.println("Enter Employ Address");
		        String s1=sc.next();
		        emp1.setEaddr(s1);
		        
		        emp1.setCompanyName("wipro");
		        System.out.println("Enter Employ Salary");
		        double d=sc.nextDouble();
		        emp1.setSalary(d);
		
		        session.save(emp1);
		}
		        session.beginTransaction().commit();
		        System.out.println("successfully");
		CriteriaBuilder builder=session.getCriteriaBuilder();
		CriteriaQuery<Employe>cquery=builder.createQuery(Employe.class);
		Root<Employe>root=cquery.from(Employe.class);
		cquery.select(root);
		
		List<Employe>list=session.createQuery(cquery).getResultList();
		System.out.println("Ename\t"+"Eid\t"+"Eaddrs\t"+"Cname\t"+"salary");
		for(Employe emp:list)
		{
			
			System.out.println(emp.getEname()+"\t"+emp.getEid()+"\t"+emp.getEaddr()+"\t"+emp.getCompanyName()+"\t"+emp.getSalary());
			
		}
	}

}
