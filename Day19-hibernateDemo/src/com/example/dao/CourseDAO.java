package com.example.dao;

import com.example.entity.Course;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;

public class CourseDAO {
    public void save(EntityManagerFactory entityManagerFactory){
        Course course1=new Course(".net",2,3000);
        Course course2=new Course(".net",2,3000);
        Course course3=new Course(".net",2,3000);
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        EntityTransaction transaction=entityManager.getTransaction();
        transaction.begin();
        entityManager.persist(course1);
        entityManager.persist(course2);
        entityManager.persist(course3);
        transaction.commit();
        entityManager.close();

    }
    public void readById(EntityManagerFactory entityManagerFactory){
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        Course course=entityManager.find(Course.class,3);
        System.out.println(course);
        entityManager.close();

    }
    public void update(EntityManagerFactory entityManagerFactory){
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        EntityTransaction transaction=entityManager.getTransaction();
        transaction.begin();
        Course course=entityManager.find(Course.class,3);
        course.setTitle("Spring");
        transaction.commit();
        entityManager.close();

    }
    public void delete(EntityManagerFactory entityManagerFactory){
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        EntityTransaction transaction=entityManager.getTransaction();
        transaction.begin();
        Course course=entityManager.find(Course.class,3);
        entityManager.remove(course);
        transaction.commit();
        entityManager.close();

    }

}
