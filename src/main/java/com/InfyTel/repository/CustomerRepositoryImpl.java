package com.InfyTel.repository;

import com.InfyTel.domain.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.util.List;

@Service
public class CustomerRepositoryImpl implements ICustomerRepository{
    private EntityManagerFactory emf;
    @Autowired
    public void setEntityManagerFactory(EntityManagerFactory emf) {
        this.emf = emf;
    }

    @Override
    public List<Customer> searchCustomer(String name, String address, Character gender, Integer age) {
        EntityManager em = emf.createEntityManager();
        CriteriaBuilder builder = em.getCriteriaBuilder();

        CriteriaQuery<Customer> query = builder.createQuery(Customer.class);
        Root<Customer> root = query.from(Customer.class);
        Predicate cName = builder.equal(root.get("name"), name);
        Predicate cAddress = builder.equal(root.get("address"), address);

        Predicate exp1 = builder.and(cName, cAddress);

        Predicate cGender = builder.equal(root.get("gender"), gender);
        Predicate cAge = builder.equal(root.get("age"), age);

        Predicate exp2 = builder.or(cGender,cAge);

        //Predicate dept = builder.equal(root.get("dept"), department);
        query.where(builder.or(exp1, exp2));
        return em.createQuery(query.select(root)).getResultList();
    }
}
