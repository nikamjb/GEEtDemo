package com.criteria.getdeta.rollno;

import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.hibernate.Session;



public class Test {
	public static void main(String[] args) {
		Session session=HibernateUtil.getSessionFactory().openSession();
        
		CriteriaBuilder builder=session.getCriteriaBuilder();
		CriteriaQuery<Employe>cquery=builder.createQuery(Employe.class);
		Root<Employe>root=cquery.from(Employe.class);
		cquery.select(root).where(builder.equal(root.get("eid"),1));
		List<Employe>list=session.createQuery(cquery).getResultList();
		for(Employe emp:list)
		{
			System.out.println(emp.getEid());
		}
		}

}
