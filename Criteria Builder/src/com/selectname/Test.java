package com.selectname;

import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.hibernate.Session;

public class Test {
	public static void main(String[] args) {
		Session session=HibernateUtil.getSessionFactory().openSession();
		CriteriaBuilder builder=session.getCriteriaBuilder();
		CriteriaQuery<String>cq=builder.createQuery(String.class);
		Root<Employe>root=cq.from(Employe.class);
		cq.select(root.get("ename"));
		List<String>list=session.createQuery(cq).getResultList();
		for(String emp:list)
		{
			System.out.println(emp);
		}
	}

}
