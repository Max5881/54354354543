package ru.sapteh.service;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import ru.sapteh.dao.DAO;
import ru.sapteh.model.Gender;
import ru.sapteh.model.Service;

import java.util.List;

public class ServiceServ implements DAO<Service, Integer> {
    private final SessionFactory factory;

    public ServiceServ(SessionFactory factory) {
        this.factory = factory;
    }

    @Override
    public void create(Service service) {
        try(Session session = factory.openSession()) {
            session.beginTransaction();
            session.save(service);
            session.getTransaction().commit();
        }

    }

    @Override
    public Service read(Integer id) {
        try(Session session = factory.openSession()) {
            return session.get(Service.class, id);
        }
    }

    @Override
    public List<Service> readByAll() {
        try(Session session = factory.openSession()){
            String sql = "FROM Service";
            Query<Service> query = session.createQuery(sql);
            List<Service> list = query.list();
            return list;
        }

    }

    @Override
    public void update(Service service) {
        try(Session session = factory.openSession()){
            session.beginTransaction();
            session.update(service);
            session.getTransaction().commit();

        }

    }

    @Override
    public void delete(Service service) {
        try(Session session = factory.openSession()){
            session.beginTransaction();
            session.delete(service);
            session.getTransaction().commit();
        }
    }
}
