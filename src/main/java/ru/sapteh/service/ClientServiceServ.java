package ru.sapteh.service;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import ru.sapteh.dao.DAO;
import ru.sapteh.model.ClientService;

import java.util.List;

public class ClientServiceServ implements DAO<ClientService, Integer> {
    private final SessionFactory factory;

    public ClientServiceServ(SessionFactory factory) {
        this.factory = factory;
    }

    @Override
    public void create(ClientService clientService) {
        try (Session session = factory.openSession()){
            session.beginTransaction();
            session.save(clientService);
            session.getTransaction().commit();
        }

    }

    @Override
    public ClientService read(Integer id) {
        try(Session session = factory.openSession()) {
            return session.get(ClientService.class, id);
        }
    }

    @Override
    public List<ClientService> readByAll() {
        try(Session session = factory.openSession()){
            String sql = "FROM ClientService";
            Query<ClientService> query = session.createQuery(sql);
            List<ClientService> list = query.list();
            return list;
        }

    }

    @Override
    public void update(ClientService clientService) {
        try(Session session = factory.openSession()) {
            session.beginTransaction();
            session.update(clientService);
            session.getTransaction().commit();
        }

    }

    @Override
    public void delete(ClientService clientService) {
        try(Session session = factory.openSession()) {
            session.beginTransaction();
            session.delete(clientService);
            session.getTransaction().commit();
        }

    }
}
