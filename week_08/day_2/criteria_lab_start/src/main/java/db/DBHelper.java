package db;

import models.Child;
import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;

import org.hibernate.Transaction;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;

import java.util.List;

public class DBHelper {

    private static Transaction transaction;
    private static Session session;

    public static void save(Object object) {

        session = HibernateUtil.getSessionFactory().openSession();
        try {
            transaction = session.beginTransaction();
            session.saveOrUpdate(object);
            transaction.commit();
        } catch (HibernateException e) {
            transaction.rollback();
            e.printStackTrace();
        } finally {
            session.close();
        }
    }

    public static <T> List<T> getAll(Class classType){
        session = HibernateUtil.getSessionFactory().openSession();
        List<T> results = null;
        Criteria criteria = session.createCriteria(classType);
        results = getList(criteria);
        return results;
    }

    public static <T> T getChildByName(Class classType, String name){
        session = HibernateUtil.getSessionFactory().openSession();
        T child = null;
        Criteria cr = session.createCriteria(classType, name);
        cr.add(Restrictions.eq("name", name));
        child = (T) getUniqueResult(cr);
        return child;
    }

    public static <T> List<T> getAllOrderedByAge(Class classType){
        session = HibernateUtil.getSessionFactory().openSession();
        List<T> results = null;
        Criteria cr = session.createCriteria(classType);
        cr.addOrder(Order.asc("age"));
        results = getList(cr);
        return results;
    }

    public static <T> List<T> getAllSopranoChildren(Class classType, String range){
        session = HibernateUtil.getSessionFactory().openSession();
        List<T> results = null;
        Criteria cr = session.createCriteria(classType, range);
        cr.add(Restrictions.eq("range", range));
        results = getList(cr);
        return results;
    }

    public static <T> List<T> getAllChildrenUnderTen(Class classType){
        session = HibernateUtil.getSessionFactory().openSession();
        List<T> results = null;
        Criteria cr = session.createCriteria(classType);
        cr.add(Restrictions.lt("age", 10));
        results = getList(cr);
        return results;
    }

    public static <T> T getOldestAge(Class classType){
        session = HibernateUtil.getSessionFactory().openSession();
        T age = null;
        Criteria cr = session.createCriteria(classType);
        cr.setProjection(Projections.max("age"));
        age = (T) getUniqueResult(cr);
        return age;
    }

    public static <T> T getOldestChild(Class classType){
        int maxAge = getOldestAge(classType);
        session = HibernateUtil.getSessionFactory().openSession();
        T child = null;
        Criteria cr = session.createCriteria(classType);
        cr.add(Restrictions.eq("age", maxAge));
        child = (T) getUniqueResult(cr);
        return child;
    }

    public static <T> T getYoungestAge(Class classType){
        session = HibernateUtil.getSessionFactory().openSession();
        T age = null;
        Criteria cr = session.createCriteria(classType);
        cr.setProjection(Projections.min("age"));
        age = (T) getUniqueResult(cr);
        return age;
    }

    public static <T> T getYoungestChild(Class classType){
        int minAge = getYoungestAge(classType);
        session = HibernateUtil.getSessionFactory().openSession();
        T child = null;
        Criteria cr = session.createCriteria(classType);
        cr.add(Restrictions.eq("age", minAge));
        child = (T) getUniqueResult(cr);
        return child;
    }

    public static <T> T getAverageAge(Class classType){
        session = HibernateUtil.getSessionFactory().openSession();
        T age = null;
        Criteria cr = session.createCriteria(classType);
        cr.setProjection(Projections.avg("age"));
        age = (T) getUniqueResult(cr);
        return age;
    }

    public static Long getTotalAge(Class classType){
        session = HibernateUtil.getSessionFactory().openSession();
        Long age = null;
        Criteria cr = session.createCriteria(classType);
        cr.setProjection(Projections.sum("age"));
        age = getUniqueResult(cr);
        return age;
    }


    public static <T> List<T> getList(Criteria cr) {
        List<T> results = null;
        try {
            transaction = session.beginTransaction();
            results = cr.list();
            transaction.commit();
        } catch (HibernateException ex) {
            transaction.rollback();
            ex.printStackTrace();
        } finally {
            session.close();
        }
        return results;
    }

    public static <T> T getUniqueResult(Criteria cr) {
        T result = null;
        try {
            transaction = session.beginTransaction();
            result = (T) cr.uniqueResult();
            transaction.commit();

        } catch (HibernateException ex) {
            transaction.rollback();
            ex.printStackTrace();
        } finally {
            session.close();
        }
        return result;
    }
}
