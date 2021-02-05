package ru.sapteh.service;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import ru.sapteh.dao.DAO;
import ru.sapteh.model.Gender;

public class GenderServ {
    private final SessionFactory factory;

    public GenderServ(SessionFactory factory) {
        this.factory = factory;
    }

    public Gender read(char code) {
        try(Session session = factory.openSession()) {
            Gender gender = session.get(Gender.class,code);
            return gender;
        }

    }
}
