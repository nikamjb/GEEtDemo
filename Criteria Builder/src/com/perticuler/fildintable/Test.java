package com.perticuler.fildintable;

import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.hibernate.Session;

public class Test {
	public static void main(String[] args) {
		Session session=HibernateUtil.getSessionFactory().openSession();
		CriteriaBuilder builder=session.getCriteriaBuilder();
		
		CriteriaQuery<Object[]>cq=builder.createQuery(Object[].class);
		Root<Employe>root=cq.from(Employe.class);
		cq.multiselect(root.get("ename"),root.get("salary"),root.get("eaddr"));
		List<Object[]>list=session.createQuery(cq).getResultList();
		for(Object[] emp:list)
		{
			System.err.println(emp[0]);
			System.out.println(emp[1]);
			System.out.println(emp[2]);
			
		}
	}

}
