package org.example.demo;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Demo4 {
    private static EntityManagerFactory emf = Persistence.createEntityManagerFactory("jpa_demo_postgres");


    public static void main(String[] args) {

        EntityManager em = emf.createEntityManager();
        em.getTransation().begin();

        Employee employee = new Employee();
        employee.setId(6);

        Employee employee1 = new Employee();
        employee.setId(6);

        Departement departement = new Departement();
        Departement.setId(1);
        Departement.setName("Sciences");

        employee.setD(departement);
        employee1.setD(departement);

        Collection<Employee> list = new ArrayLisyt <>();
        list.add(employee);
        list.add(employee1);

        departement.setEmps(list);

    }


}
